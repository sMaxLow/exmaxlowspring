class ConsoleEventLogger implements EventLogger{

    private ConsoleEventLogger() {
    }

    public void logEvent(String msg) {
        System.out.println(msg);
    }

}
