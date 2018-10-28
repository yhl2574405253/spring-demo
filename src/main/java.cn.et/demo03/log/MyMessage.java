package demo03.log;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {
//    logger 是一个专门用来记录日志的
    Logger logger=Logger.getLogger(MyMessage.class);

    public void beforeSeek(JoinPoint jp){
        String method=jp.getSignature().getName();
        logger.debug("方法"+method+":调用");
    }

}
