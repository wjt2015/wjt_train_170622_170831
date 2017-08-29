package concert_aop;

import org.springframework.stereotype.Component;

/**
 * @author：jintao.wang Date: 17-8-17 Time: 下午9:39
 */
@Component("dramaPerformance")
public class DramaPerformance implements Performance {
    public void play() {
        System.out.println("class DramaPerformance;void play()");
    }
}


