package demo04.testm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class BcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;
	public  void saveBadd(int money) throws SQLException{
		String sql="update mymoney set money=money+"+money+" where id=2";
		jdbc.execute(sql);
	}
}
