import org.colmea.repository.HibernateSpeakerRepositoryImpl;
import org.colmea.repository.SpeakerRepository;
import org.colmea.service.SpeakerService;
import org.colmea.service.SpeakerServiceImpl;
import org.colmea.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({ "org.colmea" })
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);

        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
//        //speakerService.setRepository(getSpeakerRepository());
//
//        return speakerService;
//    }
//
//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository() {
//        return  new HibernateSpeakerRepositoryImpl();
//    }
}
