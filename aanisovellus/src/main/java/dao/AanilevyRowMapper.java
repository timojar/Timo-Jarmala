package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import bean.Aanilevy;
import org.springframework.jdbc.core.RowMapper;

public class AanilevyRowMapper implements RowMapper <Aanilevy> {
	
	
	
public Aanilevy mapRow(ResultSet rs, int rownumber)	throws SQLException{
	
	Aanilevy aanilevy=new Aanilevy();
	
	
	aanilevy.setId(rs.getInt("id"));
	
	aanilevy.setNimi(rs.getString("nimi"));
	
	aanilevy.setTekija(rs.getString("tekija"));
	
	
	return aanilevy;
}
	
	

}
