package Logger_Chain_Of_Responsibility_Pattern;

public class DebugProcessor extends  LogProcessor{
    DebugProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevl, String message) {
        if(logLevl == DEBUG) System.out.println("DEBUG: " + message);
        else super.log(logLevl,message);

    }
}
