package baza_bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
@Repository
public class PracownikDAO {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public PracownikDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Pracownik> list(){
        String sql = "SELECT p.id_pracownik,p.imie,p.nazwisko,p.data_urodzenia,p.pesel,p.plec,p.data_zatrudnienia,p.nr_telefonu,p.wysokosc_wynagrodzenia"+
                ",p.miasto,p.ulica FROM Pracownicy p ";


        List<Pracownik> listPracownik = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Pracownik.class));
        return listPracownik;
    }
    public void save(Pracownik pracownik) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("pracownicy").usingColumns("imie","nazwisko","data_urodzenia","pesel",
                "plec","nr_telefonu","wysokosc_wynagrodzenia","miasto","ulica"); //,"data_zatrudnienia"

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownik);
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
    public void delete(int id_pracownik) {
        String sql = "delete from pracownicy where id_pracownik= ?";
        jdbcTemplate.update(sql,id_pracownik);
    }
}
