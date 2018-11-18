package coml.springinaction.chpt3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/com/springinaction/chpt3/app.properties")
public class DessertConfig {

    @Bean
    @Cold
    @Creamy
    public Dessert getIceCreamDessert () {
        return new IceCream();
    }

    @Bean
    @Cold
    @Icy
    public Dessert getPopsicleDessert () {
        return new Popsicle();
    }
}
