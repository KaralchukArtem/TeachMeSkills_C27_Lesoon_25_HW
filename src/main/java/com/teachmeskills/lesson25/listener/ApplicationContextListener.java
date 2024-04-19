package com.teachmeskills.lesson25.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.logging.log4j.*;

@WebListener
public class ApplicationContextListener implements ServletContextListener {
    private static final Logger logger = LogManager.getLogger(ApplicationContextListener.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ApplicationContextListener");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.error("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.debug("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.error("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.fatal("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.debug("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
        logger.info("Logger work - ApplList");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
