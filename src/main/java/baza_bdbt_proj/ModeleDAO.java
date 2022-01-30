package baza_bdbt_proj;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;


@Repository
public class ModeleDAO {
    /* Import org.springframework.jd....Template */
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public ModeleDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import java.util.List */
    public List<Modele> list(){
        String sql = "SELECT s.id_pojazdu,s.model_auta,s.marka_auta,s.rok_produkcji,s.pojemnosc_silnika,s.rodzaj_paliwa"+
                ",s.standart_wyposazenia, s.cena,s.dostepnosc  FROM Samochody s";


        List<Modele> listModele = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Modele.class));
        return listModele;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Modele modele) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("samochody").usingColumns("rok_produkcji","pojemnosc_silnika","rodzaj_paliwa","standart_wyposazenia",
              "cena","dostepnosc","model_auta","marka_auta");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(modele);
        insertActor.execute(param);
    }
    /* Read – odczytywanie danych z bazy */
    public Modele get(int id_pojazdu) {
        String sql = "SELECT * FROM Samochody WHERE id_pojazdu = ?";
        Object[] args = {id_pojazdu};
        Modele modele = jdbcTemplate.queryForObject(sql,args,BeanPropertyRowMapper.newInstance(Modele.class));
        return modele;
    }

    public Modele get1(int id_pojazdu) {
        Object[] args = {id_pojazdu};
        String sql = "SELECT * FROM Samochody WHERE id_pojazdu = "+args[0];

        Modele modele = jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Modele.class));
        return modele;
    }
    /* Update – aktualizacja danych */
    public void update(Modele modele) {
        String sql = "Update samochody set id_pojazdu=:id_pojazdu,rok_produkcji=:rokProdukcji," +
                "pojemnosc_silnika=:pojemnoscSilnika,rodzaj_paliwa=:rodzajPaliwa,standart_wyposazenia=:standartWyposazenia," +
                "cena=:cena,dostepnosc=:dostepnosc,model_auta=:modelAuta,marka_auta=:markaAuta where id_pojazdu=:id_pojazdu";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(modele);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql,param);

    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id_pojazdu) {
        String sql = "delete from samochody where id_pojazdu= ?";
        jdbcTemplate.update(sql,id_pojazdu);
    }


}
