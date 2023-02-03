//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

package seminar_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream ("result.txt", true);
            Scanner iScanner = new Scanner(System.in);
            byte num = iScanner.nextByte();
            fileOut.write(num);
        } catch (IOException e) {
            System.out.println("Error:" + e);
        }

        Logger logger = Logger.getLogger(task2_1.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);
        logger.info("информация");

    }
}
