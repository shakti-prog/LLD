package Logger_Chain_Of_Responsibility_Pattern;

public class ErrorProcessor extends  LogProcessor{
    ErrorProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevl, String message) {
        if(logLevl == ERROR) System.out.println("ERROR: " + message);
        else super.log(logLevl,message);

    }
}