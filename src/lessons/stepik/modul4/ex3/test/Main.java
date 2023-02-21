package lessons.stepik.modul4.ex3.test;

import java.util.ResourceBundle;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        // Строковое сообщение
        String stringMessage = "Сообщение";
// Строковое сообщение с параметрами
        String stringMessageFormat ="Сообщение {0}";
// Исключение
        Throwable throwable = new Throwable();
// ResourceBundle хранящий сообщения
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("logging.jul.bundle");
//// Поставщик сообщений
        Supplier<String> stringMessageSupplier = ()->"Сообщение_x";
        System.out.println("Hello fucking world!");
        logger.info(stringMessage);
        logger.info(stringMessageSupplier);
        logger.log(new LogRecord(Level.INFO, stringMessage));
        logger.log(Level.INFO, stringMessage);
        logger.log(Level.WARNING, "hew");
        logger.warning("yea! we dont have a problem! you have a sex five times now!");

    }
}
