package com.springinaction.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    BraveKnight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    Quest quest () {
        return (Quest) new SlayDragonQuest(System.out);
    }
}
