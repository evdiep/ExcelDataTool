public class MyLogger {
    private String logFilePath;
    public MyLogger(){
        setLogFilePath("");
    }
    public MyLogger(String logFilePath){
        setLogFilePath(logFilePath);
    }
    public void setLogFilePath(String filePath){
        logFilePath = filePath;
    }
    public void debug(String s){
        logStatement(s);
    }
    public void info(String s){
        logStatement(s);
    }
    private void logStatement(String s){
        System.out.println(s);
    }
    public String getLogFilePath(){
        return logFilePath;
    }
}
