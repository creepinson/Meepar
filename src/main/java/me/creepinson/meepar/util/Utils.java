package me.creepinson.meepar.util;

import me.creepinson.meepar.Meepar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by theo on 7/25/17.
 */
public class Utils {

    private static Logger logger;

    public static Logger getLogger() {

        if (logger == null) {
            logger = LogManager.getFormatterLogger(Meepar.MOD_ID);
        }
        return logger;

    }


}
