import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


public class LoggingExample {


    // Create logger object for this class
    private static final Logger logger =
            LoggerFactory.getLogger(
                    LoggingExample.class
            );


    public static void main(String[] args) {


        // Error level log message
        logger.error(
                "This is an error message"
        );


        // Warning level log message
        logger.warn(
                "This is a warning message"
        );


    }


}
