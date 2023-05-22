package Notebook;

import java.util.Scanner;

import static Notebook.method.*;




public class Main {
    public static void main(String[] args) {
        Base Laptop1 = new Base(1, "HUAWEI", "MATEBOOK D15", "silver", "Windows", "AMD", 16, 128, 0);
        Base Laptop2 = new Base(2, "HUAWEI", "MATEBOOK D16", "silver", "Windows", "INTEL", 16, 512, 0);
        Base Laptop3 = new Base(3, "MSI", "GF76 Katana", "black", "Без OS", "intel core", 16, 512, 0);
        Base Laptop4 = new Base(4, "GIGABYTE", "G5 GE", "black", "Без OS", "intel core", 16, 512, 0);
        Base Laptop5 = new Base(5, "HP", "Laptop 15s-fq2128ur", "silver", "БЕЗ OS", "intel core", 8, 256, 0);
        Base Laptop6 = new Base(6, "Honor", "MagicBook X 15", "black", "Windows", "intel core", 8, 512, 0);
        Base Laptop7 = new Base(7, "Apple", "MacBook pro", "silver", "MacOS", "M1 pro", 16, 512, 0);
        Base Laptop8 = new Base(8, "Apple", "MacBook Air", "silver", "MacOS", "M1", 8, 256, 0);
        Base Laptop9 = new Base(9, "Acer", "Aspire", "black", "Windows", "AMD", 8, 256, 0);
        Base Laptop10 = new Base(10, "Lenovo", "V15 G3", "black", "Без OS", "AMD", 8, 512, 0);

        Base[] Baza = new Base[]{Laptop1, Laptop2, Laptop3, Laptop4, Laptop5, Laptop6, Laptop7, Laptop8, Laptop9, Laptop10};
        Scanner iScanner = new Scanner(System.in);

        System.out.print("\nНиже идёт перечень для выбора ноутбука:\n1 - по названию фирмы производителя; \n2 - по цвету; \n3 - по операционной системе; \n4 - по процессору; \n5 - по оперативной памяти; \n6 - по жесткому диску. \nВведите выбор:  ");


        int VV = iScanner.nextInt();
        if (VV == 1) {
            brand(Baza); //бренд
        } else if (VV == 2) {
            Color(Baza); //цвет
        } else if (VV == 3) {
            getOS(Baza);
        } else if (VV == 4) {
            getprog(Baza); //процессор
        } else if (VV == 5) {
            GETRAM(Baza); //RAM
        } else if (VV == 6) {
            SSD(Baza); //SSD

        }
        System.out.println("Для завершения работы нажмите ENTER ");
    }
}

