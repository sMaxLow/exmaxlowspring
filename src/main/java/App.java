public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    private void logEvent(String msg) {
        String messege = msg.replaceAll(String.valueOf(client.getId()), client.getFullName());
        eventLogger.logEvent(messege);
    }
    public static void main(String[] args){
        App app = new App();

       app.client = new Client( "Владимир Путин");

       app.eventLogger = new ConsoleEventLogger();

       app.logEvent("Жил был 1 и было у него имя 1 3, а потом сместил его 2");

    }

}
