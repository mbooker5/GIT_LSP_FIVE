package org.howard.edu.lsp.finalexam.problem51;

public class Logger {
    private static Logger logger;
    private String log;

    private Logger() {
        this.log = "";
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void logMessage(String message) {
        this.log += message + "\n";
    }

    public String displayLog() {
        return "Log:\n" + log;
    }
}
