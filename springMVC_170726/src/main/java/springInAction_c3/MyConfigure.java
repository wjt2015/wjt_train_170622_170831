package springInAction_c3;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springInAction_c2.Performer;

/**
 * @author：jintao.wang Date: 17-7-27 Time: 下午9:48
 */
@Configuration
public class MyConfigure {
    @Bean
    Instrument guitar(){
        return new Guitar();
    }
    @Bean
    Performer instrumentalist(){
        return new Instrumentalist();
    }

}
