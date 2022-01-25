package baza_bdbt_proj;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class MarkiDAO {
    /* Import org.springframework.jd....Template */
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public MarkiDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import java.util.List */
    public List<Marki> list(){
        String sql = "select * from marki";
        List<Marki> listMarki = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Marki.class));

        return listMarki;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Marki sale) {
    }
    /* Read – odczytywanie danych z bazy */
    public Marki get(int id) {
        String sql = "SELECT * FROM MARKI WHERE id_marki = ?";
        Object[] args = {id};
        Marki marki = jdbcTemplate.queryForObject(sql,args,BeanPropertyRowMapper.newInstance(Marki.class));
        return marki;
    }
    public Marki get1(int id) {
        Object[] args = {id};
        String sql = "SELECT * FROM MARKI WHERE id_marki = "+ args[0];
        Marki marki = jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Marki.class));
        return marki;
    }
    /* Update – aktualizacja danych */
    public void update(Marki sale) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id) {
    }
}
