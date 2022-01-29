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
        String sql = "SELECT p.imie,p.nazwisko,p.data_urodzenia,p.pesel,p.plec,p.data_zatrudnienia,p.nr_telefonu,p.wysokosc_wynagrodzenia"+
                ",a.miasto,a.ulica FROM Pracownicy p JOIN Adresy a On (a.id_adresu = p.id_adresu)";


        List<Pracownik> listPracownik = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Pracownik.class));
        return listPracownik;
    }
    public void save() {

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
