package seminar_6;

import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Notebook l1 = new Notebook(1, 2, 128, "Windows 10", "Сиреневый");
        Notebook l2 = new Notebook(2, 4, 256, "Windows 11", "Красный");
        Notebook l3 = new Notebook(3, 32, 512, "Linux", "Серый");
        Notebook l4 = new Notebook(4, 16, 256, "Windows 11", "Черный");
        System.out.println(l1.toString());

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        Scanner sc = new Scanner(System.in, "ibm866");
        int choice = sc.nextInt();
        if (choice == 1) {

            System.out.printf("Введите значение ОЗУ: ");
            int ram = sc.nextInt();
            if (ram >= 32) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l3 + "\n" + l4 + "\n");
            } else if (ram < 32) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l4);
            } else if (ram < 16) {
                System.out.printf(l1 + "\n" + l2);
            } else if (ram < 4) {
                System.out.printf(l1.toString());
            } else System.out.println("Таких ноутбуков нет!");

        } else if (choice == 2) {

            System.out.printf("Введите значение SSD: ");
            int ssd = sc.nextInt();
            if (ssd >= 512) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l3 + "\n" + l4 + "\n");
            } else if (ssd < 512) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l4);
            } else if (ssd < 256) {
                System.out.printf(l1 + "\n" + l2);
            } else if (ssd < 128) {
                System.out.printf(l1.toString());
            } else System.out.println("Таких ноутбуков нет!");

        } else if (choice == 3) {

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            switch (os) {
                case "Windows 10":
                    System.out.printf(l1.toString());
                    break;
                case "Windows 11":
                    System.out.printf(l2 + "\n" + l4);
                    break;
                case "Linux":
                    System.out.printf(l3.toString());
                    break;
                default:
                    System.out.println("Таких ноутбуков нет!");
            }
        }
        sc.close();
    }

}
