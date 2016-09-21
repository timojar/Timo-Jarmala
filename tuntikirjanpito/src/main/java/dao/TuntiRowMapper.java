package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Tunti;

public class TuntiRowMapper {
	

	public Tunti mapRow(ResultSet rs, int rownumber) throws SQLException {  
        Tunti t=new Tunti();  
        t.setId(rs.getInt(1));  
        t.setKuvaus(rs.getString(2)); 
        t.setPvm(rs.getTimestamp(3));
        t.setToimenpide(rs.getString(4));
        t.setTuntimaara(rs.getDouble(5));
        return t;  
    }  	
	
	

}
