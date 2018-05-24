import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    private void logEvent(String msg) {
        String messege = msg.replaceAll(String.valueOf(client.getId()), client.getFullName());
        eventLogger.logEvent(messege);
    }
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) context.getBean("app");

       app.logEvent("Какое то сообщение для 1");
       app.logEvent("Какое то сообщение для 2");

    }

}
