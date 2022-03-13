package co.com.n5.user.admin.configuration;

import co.com.n5.user.admin.utils.UUIDGenerate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import static org.mockito.Mockito.mock;

@SpringBootApplication
@ComponentScan(basePackages = { "co.com.n5.user.admin"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION)})
public class TestConfiguration {

    public static void main(String[] args) throws Exception {
        new SpringApplication(TestConfiguration.class).run(args);
    }

    @Bean
    public UUIDGenerate uuidGenerate(){ return mock(UUIDGenerate.class); }
}
