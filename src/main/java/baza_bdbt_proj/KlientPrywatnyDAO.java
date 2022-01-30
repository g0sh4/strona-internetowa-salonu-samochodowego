package baza_bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
@Repository
public class KlientPrywatnyDAO {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public KlientPrywatnyDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<KlientPrywatny> list(){
        String sql = "SELECT o.imie,o.nazwisko,o.miasto,o.ulica,o.nr_telefonu,o.email FROM osoby_prywatne o ";


        List<KlientPrywatny> listKlientPrywatny = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(KlientPrywatny.class));
        return listKlientPrywatny;
    }
    public void save() {

    }
    /* Read – odczytywanie danych z bazy */
    public KlientPrywatny get(int id) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(KlientPrywatny sale) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id) {
    }
}
