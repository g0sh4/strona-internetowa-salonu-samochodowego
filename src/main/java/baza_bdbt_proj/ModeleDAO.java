package baza_bdbt_proj;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
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
        String sql = "select * from modele";
        List<Modele> listModele = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Modele.class));

        return listModele;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Modele sale) {
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
