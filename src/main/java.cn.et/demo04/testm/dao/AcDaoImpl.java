package demo04.testm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class AcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;

	@Autowired
	BcDaoImpl b;

	public void updateAminus(int money) throws SQLException {
		//扣钱
		String sql = "update mymoney set money=money-" + money + " where id=1";
		jdbc.execute(sql);

		//加钱
		b.saveBadd(money);
		int i = 5 / 0;
	}
}