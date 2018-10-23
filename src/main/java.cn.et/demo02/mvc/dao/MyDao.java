package demo02.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MyDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public List<Map<String, Object>> queryMyResult(String sql){
		return template.queryForList(sql);
	}
}
