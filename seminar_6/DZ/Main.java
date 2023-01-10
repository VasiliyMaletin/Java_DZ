// Подумать над структурой класса Ноутбук для магазина техники
// выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий
// (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
// соответствующую необходимому критерию: 1 - ОЗУ
// Объем ЖД
// Операционная система
// Цвет …
// Далее нужно запросить минимальные значения для указанных критериев
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и
// вывести проходящие по условиям.
package Seminars.seminar_6.DZ;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Brand brandMSI = new Brand("MSI", "Taiwan");
        Laptop MSI_CreatorPro_x17 = new Laptop("MSI_CreatorPro_x17", "17.3", "3840x2160", 
        "Intel", 2000, "64", "Windows", "Black");
        MSI_CreatorPro_x17.addBrand(brandMSI); 
        Laptop MSI_GT77_Titan = new Laptop("MSI_GT77_Titan", "17.3", "3840x2160", 
        "Intel", 2000, "32", "Windows", "Black");
        MSI_GT77_Titan.addBrand(brandMSI);
        Brand brandApple = new Brand("Apple", "U.S.A.");
        Laptop Apple_MacBook_Pro = new Laptop("Apple_MacBook_Pro", "16.2", "3456x2234", 
        "Apple", 1024, "32", "macOS", "Gray");
        Apple_MacBook_Pro.addBrand(brandApple);
        Laptop Apple_MacBook_Air = new Laptop("Apple_MacBook_Air", "13.6", "2560x1664", 
        "Apple", 512, "8", "macOS", "Gold");
        Apple_MacBook_Air.addBrand(brandApple);
        Brand brandASUS = new Brand("ASUS", "Taiwan");
        Laptop ASUS_TUF_Gaming_F17 = new Laptop("ASUS_TUF_Gaming_F17", "17.3", "1920x1080", 
        "Intel", 512, "16", "Windows", "Black");
        ASUS_TUF_Gaming_F17.addBrand(brandASUS);
        Laptop ASUS_VivoBook_PRO_16X = new Laptop("ASUS_VivoBook_PRO_16X", "16", "3840x2400", 
        "AMD", 512, "8", "Windows", "Black");
        ASUS_VivoBook_PRO_16X.addBrand(brandASUS);
        Brand brandLenovo = new Brand("Lenovo", "Taiwan");
        Laptop Lenovo_ThinkPad_T16 = new Laptop("Lenovo_ThinkPad_T16", "16", "1920x1200", 
        "Intel", 512, "16", "Windows", "Black");
        Lenovo_ThinkPad_T16.addBrand(brandLenovo);
        Laptop Lenovo_Legion_5_Pro = new Laptop("Lenovo_Legion_5_Pro", "16", "2560x1600", 
        "AMD", 512, "16", "Linux", "Gray");
        Lenovo_Legion_5_Pro.addBrand(brandLenovo);
        Brand brandAcer = new Brand("Acer", "Taiwan");
        Laptop Acer_Nitro_5 = new Laptop("Acer_Nitro_5", "17.3", "1920x1080", 
        "Intel", 512, "16", "Windows", "Black");
        Acer_Nitro_5.addBrand(brandAcer);
        Laptop Acer_Aspire_7 = new Laptop("Acer_Aspire_7", "15.6", "1920x1080", 
        "AMD", 512, "8", "Linux", "Black");
        Acer_Aspire_7.addBrand(brandAcer);

        Set <Laptop> laptop = new HashSet<>();
        laptop.add(MSI_CreatorPro_x17);      
        laptop.add(MSI_GT77_Titan);
        laptop.add(Apple_MacBook_Pro);
        laptop.add(Apple_MacBook_Air);
        laptop.add(ASUS_TUF_Gaming_F17);
        laptop.add(ASUS_VivoBook_PRO_16X);
        laptop.add(Lenovo_Legion_5_Pro);
        laptop.add(Lenovo_ThinkPad_T16);
        laptop.add(Acer_Nitro_5);
        laptop.add(Acer_Aspire_7);

        Laptop FilterLaptop = new Laptop();
        System.out.println("По Вашему запросу найдено: " + FilterLaptop.filter(laptop));
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
