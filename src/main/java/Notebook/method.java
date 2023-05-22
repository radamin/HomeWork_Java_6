package Notebook;

import java.util.Objects;
import java.util.Scanner;

public class method {
    /**
     * Метод фильтра по бренду
     */
    public static void brand(Base[] Baza) { // фильтр бренда
        while (true) {
            System.out.print("\nДоступны: Apple, HUAWEI, MSI, GIGABYTE, HP, Honor, Acer, Lenovo\nКакого бренда интересует вас ноутбук: ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Apple")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "Apple"));
                break;
            } else if (Objects.equals(vibor, "HUAWEI")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "HUAWEI"));
                break;
            } else if (Objects.equals(vibor, "MSI")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "MSI"));
                break;
            } else if (Objects.equals(vibor, "GIGABYTE")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "GIGABYTE"));
                break;
            } else if (Objects.equals(vibor, "HP")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "HP"));
                break;
            } else if (Objects.equals(vibor, "Honor")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "Honor"));
                break;
            } else if (Objects.equals(vibor, "Acer")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "Acer"));
                break;
            } else if (Objects.equals(vibor, "Lenovo")) {
                System.out.print(Base.getloptopBrandFULL(Baza, "Lenovo"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще!\n");
            }
        }
    }

    /**
     * Метод фильтра по цвету
     */
    public static void Color(Base[] Baza) { //фильтр цвета
        while (true) {

            System.out.print("Доступные цвета: silver, black\nКакого цвета интересует вас ноутбук: ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "silver")) {
                System.out.print(Base.getColore(Baza, "silver"));
                break;
            } else if (Objects.equals(vibor, "black")) {
                System.out.print(Base.getColore(Baza, "black"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще!\n");
            }
        }
    }

    /**
     * Метод фильтра по системе
     */

    public static void getOS(Base[] Baza) {
        while (true) {
            System.out.print("\nДоступные системы: Windows, Без OS, MacOS\nКакая система вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Windows")) {
                System.out.print(Base.getOS(Baza, "Windows"));
                break;
            } else if (Objects.equals(vibor, "Без OS")) {
                System.out.print(Base.getOS(Baza, "Без OS"));
                break;
            } else if (Objects.equals(vibor, "MacOS")) {
                System.out.print(Base.getOS(Baza, "MacOS"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще!\n");
            }
        }
    }

    /**
     * Метод фильтра по процессору
     */
    public static void getprog(Base[] Baza) {
        while (true) {
            System.out.print("\nДоступные процессоры: AMD, Intel, M1 pro, M1\nКакой процессор вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "AMD")) {
                System.out.print(Base.getprog(Baza, "AMD"));
                break;
            } else if (Objects.equals(vibor, "Intel")) {
                System.out.print(Base.getprog(Baza, "Intel"));
                break;
            } else if (Objects.equals(vibor, "M1 pro")) {
                System.out.print(Base.getprog(Baza, "M1 pro"));
                break;
            } else if (Objects.equals(vibor, "M1")) {
                System.out.print(Base.getprog(Baza, "M1"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще!\n");

            }
        }
    }


    /**
     * Метод фильтра по ram
     */
    public static void GETRAM(Base[] Baza) {
        while (true) {
            System.out.print("\nДоступные варианты: 8,16\nКакое количество RAM вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            Integer vibor = iScanner.nextInt();
            if (Objects.equals(vibor, 16)) {
                System.out.print(Base.getRAM(Baza, 16));
                break;
            } else if (Objects.equals(vibor, 8)) {
                System.out.print(Base.getRAM(Baza, 8));
                break;
            } else {
                System.out.print("Нет такого попробуй еще!\n");
            }
        }
    }

    /**
     * Метод фильтра по SSD
     */
    public static void SSD(Base[] Baza) { //фильтр ОС
        while (true) {
            System.out.print("\nДоступные варианты: 128, 256, 512 \nКакого размера SSD вас интересует? : ");
            Scanner iScanner = new Scanner(System.in);
            Integer vibor = iScanner.nextInt();
            if (Objects.equals(vibor, 128)) {
                System.out.print(Base.getSSD(Baza, 128));
                break;
            } else if (Objects.equals(vibor, 256)) {
                System.out.print(Base.getSSD(Baza, 256));
                break;
            } else if (Objects.equals(vibor, 512)) {
                System.out.print(Base.getSSD(Baza, 512));
                break;
            } else {
                System.out.print("Нет такого попробуй еще!\n");
            }
        }
    }

}
