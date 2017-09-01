package springInAction_c2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * 1+2=3
 * @author：jintao.wang Date: 17-7-27 Time: 下午6:30
 */
@Slf4j
public class PerformerTest {
    @Test
    public void testJuggler() throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("performer_c2.xml");
        Juggler duke1 = ctx.getBean("duke1",Juggler.class);
        Juggler duke2 = ctx.getBean("duke2",Juggler.class);
        duke1.perform();
        duke2.perform();
        String msg = "wjt;PerformerTest;void testJuggler();";
        log.info(msg);
    }
    @Test
    public void testAOP() throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("performer_c2_aop.xml");
        Performer duke1 = (Performer) ctx.getBean("duke1");
        Performer duke2 = (Performer) ctx.getBean("duke2");
        duke1.perform();
        duke2.perform();
        String msg = "wjt;PerformerTest;void testAOP();";
        log.info(msg);
    }
}