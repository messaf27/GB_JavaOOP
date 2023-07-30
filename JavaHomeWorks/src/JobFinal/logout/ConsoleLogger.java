package JobFinal.logout;

public class ConsoleLogger implements LogInterface{
    private static int counter = 0;
    @Override
    public void log(String logMessage) {
        counter++;
        System.out.printf("LOG: [%d] %s\n", counter, logMessage);
    }
}
