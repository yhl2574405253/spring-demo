package demo04.testm;

import demo04.testm.dao.AcDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

/**
 * 编程式事务
 * 声明式事务
 *    xml声明（全局）
 *    注解声明
 */

public class Test {
	static AcDaoImpl myMoneyDao;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/demo04/testm/spring.xml");
		myMoneyDao=(AcDaoImpl)context.getBean("acDaoImpl");
	}

	public static void main(String[] args) throws SQLException {
		myMoneyDao.updateAminus(10);
	}

}
