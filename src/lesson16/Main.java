package lesson16;

import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.trace("Наше сообщение trace");
        LOGGER.debug("Наше сообщение debug");
        LOGGER.warn("Наше сообщение warn");
        LOGGER.info("Наше сообщение info");
        LOGGER.error("Наше сообщение error");
        LOGGER.fatal("Наше сообщение fatal");


    }
}
