package baza_bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
@Repository
public class FirmaDAO {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public FirmaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Firma> list(){
        String sql = "SELECT f.nazwa,f.nip,f.numer_krs,f.numer_regon,f.miasto,f.ulica,f.nr_telefonu,f.email FROM firmy f";


        List<Firma> listFirma = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Firma.class));
        return listFirma;
    }
    public void save() {

    }
    /* Read – odczytywanie danych z bazy */
    public Firma get(int id) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Firma sale) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id) {
    }
}
