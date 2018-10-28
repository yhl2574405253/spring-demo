package demo02.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class jdbcTest {
	static JdbcTemplate jt; //创建一个工具类
	static{
		ApplicationContext context = new ClassPathXmlApplicationContext("demo02/jdbc/jdbcSpring.xml");
		jt=(JdbcTemplate)context.getBean("jdbcTemplate");  //实例化工具类
	}
	public static void main(String[] args) throws SQLException {
		//容器对象 传入一个sql语句
		query("select * from info");

	}

	/**
	 * 封装查看的方法
	 */
	public static void query(String sql){
		List<Map<String, Object>> list=jt.queryForList(sql);
		System.out.println(list);
	}

	/**
	 * 封装增删改的方法
	 */
	public static void update(){
		String sql="update set from info where s=1";
		jt.execute(sql);
	}
	
	
	
	

}
