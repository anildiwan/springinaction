package com.springinaction.chpt2.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();


    }
}
