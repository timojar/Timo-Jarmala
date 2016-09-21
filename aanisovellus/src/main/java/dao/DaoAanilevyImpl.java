package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bean.Aanilevy;

public class DaoAanilevyImpl implements DaoAanilevy {

	
private JdbcTemplate jdbcTemplate;
	

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	
	public void talleta(Aanilevy aanilevy) {

		System.out.println("Testi");

	}

	public Aanilevy etsi(int id) {

		Aanilevy aanilevy = null;

		return aanilevy;

	}

	public List<Aanilevy> haeKaikki() {
		
		String sql="select * from Aanilevy";  
		RowMapper<Aanilevy> mapper=new AanilevyRowMapper();
		List<Aanilevy> aanilevyt = jdbcTemplate.query(sql, mapper);

		return aanilevyt;
	}

}
