import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.consumer.ConsumerConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConsumerConfiguration.class)
public class AnnotionTest {

    @DubboReference
    private DemoService demoService;

    @Test
    public void test() {
        System.out.println(demoService.sayHello("aaaa"));
    }
}

