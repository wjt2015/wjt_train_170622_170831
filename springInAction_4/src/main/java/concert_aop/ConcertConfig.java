package concert_aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author：jintao.wang Date: 17-8-17 Time: 下午10:08
 */
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    Audience audience(){
        return new Audience();
    }
}
