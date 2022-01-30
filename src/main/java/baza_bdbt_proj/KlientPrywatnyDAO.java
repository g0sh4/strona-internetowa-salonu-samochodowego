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
        String sql = "SELECT o.id_klienta,o.imie,o.nazwisko,o.miasto,o.ulica,o.nr_telefonu,o.email FROM osoby_prywatne o ";


        List<KlientPrywatny> listKlientPrywatny = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(KlientPrywatny.class));
        return listKlientPrywatny;
    }
    public void save(KlientPrywatny klientPrywatny) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("osoby_prywatne").usingColumns("imie","nazwisko","miasto","ulica",   //
                "nr_telefonu","email");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(klientPrywatny);
        insertActor.execute(param);
    }
    /* Read – odczytywanie danych z bazy */
    public KlientPrywatny get(int id) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(KlientPrywatny sale) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id_klienta) {
        String sql = "delete from osoby_prywatne where id_klienta= ?";
        jdbcTemplate.update(sql,id_klienta);
    }
}
