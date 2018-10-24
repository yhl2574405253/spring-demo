package demo02.mvc;

import demo02.mvc.controller.MyController;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MyView {
    static ConfigurableApplicationContext  context;
    static{
        context = new ClassPathXmlApplicationContext("/demo02/mvc/mvcSpring.xml");
    }
    private static MyController cont;

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        try {
            while(true){
                System.out.print("请输入sql语句");
                String sql=scanner.nextLine();
                cont=(MyController)context.getBean("myController");
                cont.service(sql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            context.close();
        }

    }
}
