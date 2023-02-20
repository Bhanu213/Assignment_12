package org.antwalk.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.model.Valentine;
import org.springframework.jdbc.core.RowMapper;

public class ValentineMapper implements RowMapper<Valentine>
{

	public Valentine mapRow(ResultSet rs, int rowNum) throws SQLException {
		Valentine v=new Valentine();
		v.setDate(rs.getString("date"));
		v.setGifts(rs.getString("gifts"));
		v.setLocation(rs.getString("location"));
		return v;
	}
}
