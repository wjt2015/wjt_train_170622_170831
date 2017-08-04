package springInAction_c3;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springInAction_c2.PerformanceException;
import springInAction_c2.Performer;

import static org.junit.Assert.*;

/**
 * @author：jintao.wang Date: 17-7-27 Time: 下午8:48
 */
@Slf4j
public class InstrumentTest {
    @Test
    public void testGuitar() throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c3/autowired.xml");
        Performer performer = (Performer)ctx.getBean("instrumentalistId");
        performer.perform();
        log.info("wjt;class InstrumentTest;void testGuitar()");
    }
    @Test
    public void testGuitar2() throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c3/autoscan.xml");
        Performer performer = (Performer)ctx.getBean("instrumentalistId");
        performer.perform();
        log.info("wjt;class InstrumentTest;void testGuitar()");
    }
}


