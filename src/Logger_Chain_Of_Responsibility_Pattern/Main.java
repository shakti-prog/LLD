package Logger_Chain_Of_Responsibility_Pattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new INFOProcessor(new DebugProcessor(new ErrorProcessor(null)));
        logProcessor.log(3,"Nothing");
        logProcessor.log(2,"Nothing just");
        logProcessor.log(1,"Nothing just an incident");
    }
}
