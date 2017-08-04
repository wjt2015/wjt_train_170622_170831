package springInAction_c3;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author：jintao.wang Date: 17-7-28 Time: 下午12:34
 */
@Slf4j
public class MyConfigureTest {
    @Test
    public void func1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c3/autoscan.xml");
        log.info("wjt;ctx={}",ctx);
        System.out.println("wjt;ctx=" + ctx);
        Instrument guitar = (Instrument)ctx.getBean("guitar");
        log.info("wjt;guitar={}",guitar);
        System.out.println("wjt;guitar=" + guitar);
    }
}


