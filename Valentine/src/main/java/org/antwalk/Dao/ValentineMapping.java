package org.antwalk.Dao;


import java.util.List;

import javax.sql.DataSource;


import org.antwalk.model.Valentine;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class ValentineMapping
{
	private DataSource dataSource;
	private JdbcTemplate jbdbcTemplateObj;
	
	
	public void setDataSource(DataSource ds)
	{
		this.dataSource=ds;   //Initializing Connection
		this.jbdbcTemplateObj=new JdbcTemplate(dataSource);
	}
	public void create(String date,String gifts,String location)
	{
		String query="insert into valentine(date,gifts,location) values(?,?,?)";
		jbdbcTemplateObj.update(query,date,gifts,location);
		System.out.println(query);
	}
	public List<Valentine>listBook()
	{
		String query="select * from book";
		List<Valentine> books=jbdbcTemplateObj.query(query, new ValentineMapper());
		return books;
	}
}
