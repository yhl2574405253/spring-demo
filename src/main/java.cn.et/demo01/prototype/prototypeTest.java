package demo01.prototype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class prototypeTest {
	public static void main(String[] args) {
//		FileSystemXmlApplicationContext ���ļ�ϵͳ��Ѱ��xml�ļ� ���̷�
//		ClassPathXmlApplicationContext  ����·����Ѱ��
//		GenericXmlApplicationContext    ͨ�� Ĭ�ϲ�����·��
//		WebApplicationContext web.xml��ʵ����
		
//		�ͽ�ԭ�� ����ApplicationContextָ�� ��֧�� �ַ���������ҷ���
//		classpath:
//		file:
		
		//��������
//		ApplicationContext context =new ClassPathXmlApplicationContext("prototypeSpring.xml");  //����·�����ļ�
		ApplicationContext context =new GenericXmlApplicationContext("classpath:/cn/et/day1/prototype/prototypeSpring.xml");
		
		A a =(A)context.getBean("a");
		A a1 =(A)context.getBean("a");
		System.out.println(a==a1);
		
	
		
		
	}
}
