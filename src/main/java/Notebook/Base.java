package Notebook;


import java.util.Objects;

public class Base {
    int id;
    String brand, model, color, os, prog;
    int RAM, SSD, HDD;

    public Base(int id, String brand, String model, String color, String os, String prog, int RAM, int SSD, int HDD) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.os = os;
        this.prog = prog;
        this.RAM = RAM;
        this.SSD = SSD;
        this.HDD = HDD;

    }

    /**
     * Метод фильтра по бренду
     */
    public static StringBuilder getloptopBrandFULL(Base[] Baza, String brand) {
        StringBuilder result = new StringBuilder();
        for (Base c : Baza) {
            if (Objects.equals(c.brand, brand)) {
                result.append("Бренд: ").append(c.brand);
                result.append("\nМодель: ").append(c.model);
                result.append("\nЦвет: ").append(c.color);
                result.append("\nСистема: ").append(c.os);
                result.append("\nПроцессор: ").append(c.prog);
                result.append("\nОЗУ: ").append(c.RAM);
                result.append("\nSSD: ").append(c.SSD);
                result.append("\n");
            }
        }
        return result;
    }

    /**
     * Метод фильтра по цвету
     */
    public static StringBuilder getColore(Base[] Baza, String color) {
        StringBuilder result = new StringBuilder();
        for (Base c : Baza) {
            if (Objects.equals(c.color, color)) {
                result.append("Бренд: ").append(c.brand);
                result.append("\nМодель: ").append(c.model);
                result.append("\nЦвет: ").append(c.color);
                result.append("\nСистема: ").append(c.os);
                result.append("\nПроцессор: ").append(c.prog);
                result.append("\nОЗУ: ").append(c.RAM);
                result.append("\nSSD: ").append(c.SSD);
                result.append("\n");
            }
        }
        return result;
    }

    /**
     * Метод фильтра по системе
     */
    public static StringBuilder getOS(Base[] Baza, String os) {
        StringBuilder result = new StringBuilder();
        for (Base c : Baza) {
            if (Objects.equals(c.os, os)) {
                result.append("Бренд: ").append(c.brand);
                result.append("\nМодель: ").append(c.model);
                result.append("\nЦвет: ").append(c.color);
                result.append("\nСистема: ").append(c.os);
                result.append("\nПроцессор: ").append(c.prog);
                result.append("\nОЗУ: ").append(c.RAM);
                result.append("\nSSD: ").append(c.SSD);
                result.append("\n");


            }
        }
        return result;
    }

    /**
     * Метод фильтра по процессору
     */
    public static StringBuilder getprog(Base[] Baza, String prog) {
        StringBuilder result = new StringBuilder();
        for (Base c : Baza) {
            if (Objects.equals(c.prog, prog)) {
                result.append("Бренд: ").append(c.brand);
                result.append("\nМодель: ").append(c.model);
                result.append("\nЦвет: ").append(c.color);
                result.append("\nСистема: ").append(c.os);
                result.append("\nПроцессор: ").append(c.prog);
                result.append("\nОЗУ: ").append(c.RAM);
                result.append("\nSSD: ").append(c.SSD);
                result.append("\n");


            }
        }
        return result;
    }

    /**
     * Метод фильтра по ram
     */
    public static StringBuilder getRAM(Base[] Baza, Integer RAM) {
        StringBuilder result = new StringBuilder();
        for (Base c : Baza) {
            if (c.RAM == RAM) {
                result.append("Бренд: ").append(c.brand);
                result.append("\nМодель: ").append(c.model);
                result.append("\nЦвет: ").append(c.color);
                result.append("\nСистема: ").append(c.os);
                result.append("\nПроцессор: ").append(c.prog);
                result.append("\nОЗУ: ").append(c.RAM);
                result.append("\nSSD: ").append(c.SSD);
                result.append("\n");

            }
        }
        return result;
    }

    /**
     * Метод фильтра по SSD
     */
    public static StringBuilder getSSD(Base[] Baza, Integer RAM) {
        StringBuilder result = new StringBuilder();
        for (Base c : Baza) {
            if (c.RAM == RAM) {
                result.append("Бренд: ").append(c.brand);
                result.append("\nМодель: ").append(c.model);
                result.append("\nЦвет: ").append(c.color);
                result.append("\nСистема: ").append(c.os);
                result.append("\nПроцессор: ").append(c.prog);
                result.append("\nОЗУ: ").append(c.RAM);
                result.append("\nSSD: ").append(c.SSD);
                result.append("\n");

            }
        }
        return result;
    }
}


