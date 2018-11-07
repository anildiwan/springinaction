package com.springinaction.chpt2.knights;

public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest () {
        quest.embark();
    }

}
