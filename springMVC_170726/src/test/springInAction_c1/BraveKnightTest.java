package springInAction_c1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.mock;
/*
* (http://www.cnblogs.com/MrSaver/p/6104130.html)
* */
/**
 * @author jintao.wang Date: 17-7-26 Time: 下午12:34
 */
@Slf4j
public class BraveKnightTest {
    @Test
    public void testBraveKnight(){
        Quest quest = mock(RescueDamselQuest.class);
        quest = new RescueDamselQuest();
        BraveKnight knight = new BraveKnight(quest);
        knight.embarkOnQuest();
        log.info("void testBraveKnight()");
    }
    @Test
    public void testBraveKnightAndSlayDragon(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("knights.xml");
        BraveKnight knight1 = (BraveKnight)applicationContext.getBean("knight");
        BraveKnight knight2 = applicationContext.getBean("knight",BraveKnight.class);
        knight1.embarkOnQuest();
        knight2.embarkOnQuest();
        log.info("class BraveKnightTest;void testBraveKnightAndSlayDragon()");
    }
    @Test
    public void testMinstrel(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("knights-aop.xml");
//        BraveKnight knight = applicationContext.getBean("knight",BraveKnight.class);
        Knight knight1 = (Knight)applicationContext.getBean("knight");
        knight1.embarkOnQuest();
        log.info("void testMinstrel()");
    }
}







