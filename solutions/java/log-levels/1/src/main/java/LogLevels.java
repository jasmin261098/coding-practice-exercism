public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf("]:");
        return logLine.substring(index + 2).trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String logLevel = "";

        if (start != -1 && end != -1 && end > start) {
            logLevel = logLine.substring(start + 1, end);
        }

        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
        int index = logLine.indexOf("]:");
        String message = logLine.substring(index + 2).trim();

        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String level = "";

        if (start != -1 && end != -1 && end > start) {
            level = logLine.substring(start + 1, end).toLowerCase();
        }

        String reformat = message + " (" + level + ")"; 

        return reformat;
    }
}
