package Logger_Chain_Of_Responsibility_Pattern;

public abstract class LogProcessor {
    public  static int INFO = 1;
    public  static  int DEBUG = 2;
    public  static  int ERROR = 3;
    LogProcessor nextProcessor;

    LogProcessor(LogProcessor logProcessor){
        nextProcessor = logProcessor;
    }

    public void log(int logLevl,String message){
        if(nextProcessor != null){
            nextProcessor.log(logLevl,message);
        }
    }

}
