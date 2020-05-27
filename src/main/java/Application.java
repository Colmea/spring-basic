import org.colmea.model.Speaker;
import org.colmea.service.SpeakerService;
import org.colmea.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]) {
        System.out.println("Starting Spring Application...");

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);

        Speaker firstSpeaker = speakerService.findAll().get(0);

        System.out.println("Speaker 0: " + firstSpeaker.getFirstName() + " " + firstSpeaker.getLastName());
    }
}
