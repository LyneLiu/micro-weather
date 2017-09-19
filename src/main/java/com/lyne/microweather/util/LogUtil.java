package com.lyne.microweather.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nn_liu
 * @Created 2017-09-19-16:33
 */

public class LogUtil {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void trace(String msg){
        logger.trace(msg);
    }

    public void debug(String msg){
        logger.debug(msg);
    }

    public void warn(String msg){
        logger.warn(msg);
    }

    public void info(String msg){
        logger.info(msg);
    }

    public void error(String msg){
        logger.debug(msg);
    }

}
