import org.colmea.repository.HibernateSpeakerRepositoryImpl;
import org.colmea.repository.SpeakerRepository;
import org.colmea.service.SpeakerService;
import org.colmea.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({ "org.colmea" })
public class AppConfig {

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
