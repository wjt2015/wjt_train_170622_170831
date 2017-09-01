//<start id="instrumentalist_java" />
package springInAction_c3;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springInAction_c2.PerformanceException;
import springInAction_c2.Performer;

@Slf4j
public class Instrumentalist implements Performer {
  public Instrumentalist(){
    log.info("wjt;class Instrumentalist implements Performer;Instrumentalist()");
  }
  public void perform() throws PerformanceException {
    getInstrument().play();
  }

  public Instrument getInstrument() {
    return instrument;
  }

  //<start id="autowire_property" />
  @Autowired
//  @Qualifier("stringed")
  private Instrument instrument;
  //<end id="autowire_property" />

}
//<end id="instrumentalist_java" />
