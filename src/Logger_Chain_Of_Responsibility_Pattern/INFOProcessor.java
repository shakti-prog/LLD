package Logger_Chain_Of_Responsibility_Pattern;

public class INFOProcessor extends  LogProcessor{
    INFOProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevl, String message) {
        if(logLevl == INFO) System.out.println("INFO: " + message);
        else super.log(logLevl,message);

    }
}
