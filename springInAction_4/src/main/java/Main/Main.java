package Main;

import c2.springInAction_c1.BraveKnight;
import c2.springInAction_c1.Knight;
import c2.springInAction_c1.RescueDamselQuest;
import c2.springInAction_c2.Juggler;
import c2.springInAction_c2.PerformanceException;
import c2.springInAction_c2.Performer;
import c2.springInAction_c3.Guitar;
import c2.springInAction_c3.Instrumentalist;
import c2.springInAction_c3.Saxophone;
import concert_aop.DramaPerformance;
import concert_aop.Performance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：jintao.wang Date: 17-8-13 Time: 下午11:44
 */
@Slf4j
public class Main {
    public static void main(String[] args){
//        testKnight();
            testAOP();
    }

    private static void testKnight(){
        String xmlPath = "knight_spring.xml";
//        String xmlPath = "c2/c2_spring.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        BraveKnight knight = ctx.getBean("braveKnight", BraveKnight.class);
        knight.embarkOnQuest();
        System.out.println("knight=" + knight);
        knight.embarkOnQuest();
        Juggler performer = ctx.getBean("juggler", Juggler.class);
        System.out.println("performer=" + performer);
        try {
            performer.perform();
        } catch (PerformanceException e) {
            log.error("PerformanceException happens！",e);
        }

        BraveKnight braveKnightC = ctx.getBean("braveKnightC",BraveKnight.class);
        braveKnightC.embarkOnQuest();

        System.out.println("braveKnightC=" + braveKnightC);

        RescueDamselQuest rescueDamselQuestC = ctx.getBean("rescueDamselQuestC",RescueDamselQuest.class);
        rescueDamselQuestC.embark();

        System.out.println("\trescueDamselQuestC=" + rescueDamselQuestC);

        int i = 0,n = 5;
        BraveKnight braveKnight = null;
        System.out.println("+***********+");
        for (i = 0;i < n;i++){
            braveKnight = ctx.getBean("braveKnight",BraveKnight.class);
            System.out.println("i=" + i + ";braveKnight=" + braveKnight);
        }
        System.out.println("++++++++++");

        Guitar guitar = ctx.getBean("guitar",Guitar.class);
        guitar.play();
        System.out.println("guitart=" + guitar);

        Instrumentalist instrumentalist = ctx.getBean("instrumentalist",Instrumentalist.class);
        try {
            instrumentalist.perform();
        } catch (PerformanceException e) {
            log.error("PerformanceException happens！",e);
        }
        System.out.println("instrumentalist=" + instrumentalist);

        Saxophone saxophone = ctx.getBean("saxophone",Saxophone.class);
        System.out.println("saxophone=" + saxophone);
        System.out.println("%%%%%%%%%%%%");

    }

    private static void testAOP(){
        String xmlPath = "knight_spring.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
//        DramaPerformance dramaPerformance = ctx.getBean("dramaPerformance",DramaPerformance.class);
        System.out.println("------start-----");
//        dramaPerformance.play();
        System.out.println("------finish!!----");
        Performance performance = ctx.getBean("dramaPerformance",Performance.class);
        performance.play();
        System.out.println("------Performance performance;finish!!----");
    }
}













