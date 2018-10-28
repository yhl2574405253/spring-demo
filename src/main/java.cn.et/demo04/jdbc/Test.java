package demo04.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * jdbc的commit和rollback控制事物的方式
 */

public class Test {
	static DataSource dataSource;
	static Connection conn;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/demo04/jdbc/spring.xml");
		dataSource=(DataSource)context.getBean("dataSource");
	}

	public static void main(String[] args) throws SQLException {
		try {
//			初始化数据源
			conn=dataSource.getConnection();

//			设置为手动提交
			conn.setAutoCommit(false);

//			执行一个事物当没有问题的时候才commit
			aminus(10);
			int i=5/0;
			badd(10);
			//后置通知
			conn.commit();
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			conn.close();
		}


	}
	//例子

	/**
	 * 减钱的方法
	 * @param money
	 * @throws SQLException
	 */
	public static void aminus(int money) throws SQLException{
		String sql="update mymoney set money=money-"+money+" where name='A'";
		conn.prepareStatement(sql).executeUpdate();
	}

	/**
	 * 加钱的方法
	 * @param money
	 * @throws SQLException
	 */
	public static void badd(int money) throws SQLException{
		String sql="update mymoney set money=money+"+money+" where name='B'";
		conn.prepareStatement(sql).executeUpdate();
	}
}
