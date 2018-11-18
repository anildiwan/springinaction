package coml.springinaction.chpt3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={PersistenceSpringConfig.class})
@ActiveProfiles("dev")
public class PersistenceSpringConfigTest {

    @Autowired
    ApplicationContext ctx;

    @Test
    public void embeddedDataSourceTest() {
        assertNotNull(ctx.getBean("dataSource"));
    }
}