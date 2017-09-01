package springInAction_c4;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author：jintao.wang Date: 17-7-28 Time: 下午5:41
 */
@Slf4j
public class AudienceTest {
    @Test
    public void func1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c4/c4_aop.xml");
        Object obj = ctx.getBean("instrumentalist");
        Performer instrumentalist = (Performer) obj;
//        Instrumentalist instrumentalist = (Instrumentalist) obj;
        try {
            instrumentalist.perform();
        } catch (springInAction_c4.PerformanceException e) {
            log.error("wjt;springInAction_c2.PerformanceException happen!;e={}",e);
        }catch (InterruptedException e) {
            log.error("wjt;springInAction_c2.InterruptedException!;e={}",e);
        }
        log.info("wjt;class AudienceTest;void func1()");
    }
    @Test
    public void func2() throws PerformanceException, InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c4/c4_aop.xml");
        Object obj = ctx.getBean("instrumentalist2");
        Performer performer = (Performer)obj;
        performer.perform();
        System.out.println("void func2();");
    }
    @Test/*AOP,parameter*/
    public void func3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c4/c4_aop.xml");
        Object obj = ctx.getBean("thinker");
        Thinker thinker = (Thinker)obj;
        String thoughts = "wjt;I am a thinker!!";
        System.out.println("void func3();start:------");
        thinker.thinkOfSomething(thoughts);
        System.out.println("void func3();finish;------");
    }
}







