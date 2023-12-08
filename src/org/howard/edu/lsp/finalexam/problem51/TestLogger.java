package org.howard.edu.lsp.finalexam.problem51;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestLogger {

    @Test
    public void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test message 1");
        logger.logMessage("Test message 2");

        String expectedLog = "Log:\nTest message 1\nTest message 2\n";
        assertEquals(expectedLog, logger.displayLog());
    }

    @Test
    public void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Ensure that logger1 and logger2 refer to the same instance
        assertSame(logger1, logger2);
    }
}
