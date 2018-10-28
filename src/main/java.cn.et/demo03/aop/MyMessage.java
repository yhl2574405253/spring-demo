package demo03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {
//	配置前置通知的消息
	public void beforeSeek(){
		System.out.println("打扫卫生---》");
	}

//	配置后置通知的消息
	public void afterSeek(){
		System.out.println("收钱");
	}

//  配置异常通知的消息  JoinPoint 可以获取到当前方法以及其他关于方法的消息
	public void throwException(JoinPoint jp){
		System.out.println("出现异常");
		System.out.println(jp.getTarget());
		System.out.println(jp.getThis());
		System.out.println(jp.getSignature().getName());
		for(Object obj:jp.getArgs()){
			System.out.println(obj);
		}
	}
}

