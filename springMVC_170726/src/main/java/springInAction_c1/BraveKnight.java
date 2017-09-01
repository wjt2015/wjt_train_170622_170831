package springInAction_c1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:jintao.wang Date: 17-7-26 Time: 上午11:26
 */
@Slf4j
public class BraveKnight implements Knight{
    private Quest quest;
    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest(){
        log.info("wjt;BraveKnight;void embarkOnQuest()");
        quest.embark();
        log.info("wjt;BraveKnight;void embarkOnQuest()；quest.embark()");
    }
}


