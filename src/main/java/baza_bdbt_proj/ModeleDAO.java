package baza_bdbt_proj;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
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
        String sql = "SELECT s.model_auta,s.marka_auta,s.rok_produkcji,s.pojemnosc_silnika,s.rodzaj_paliwa"+
                ",s.standart_wyposazenia, s.cena,s.dostepnosc  FROM Samochody s";


        List<Modele> listModele = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Modele.class));
        return listModele;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Modele modele) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("samochody").usingColumns("rok_produkcji","pojemnosc_silnika","rodzaj_paliwa","standart_wyposazenia",
              "cena","dostepnosc","model_auta","marka_auta");
        //insertActor.withTableName("samochody").usingColumns("modelAuta","markaAuta","rokProdukcji","pojemnoscSilnika",
        //       "rodzajPaliwa","StandartWyposazenia","1","1","cena","dostepnosc");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(modele);
        insertActor.execute(param);
    }
    /* Read – odczytywanie danych z bazy */
    public Modele get(int id) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Modele sale) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id) {
    }


}
