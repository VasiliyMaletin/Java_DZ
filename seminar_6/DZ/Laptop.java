package Seminars.seminar_6.DZ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private List<Brand> brands;
    private static Scanner iScanner = null;

    private String model;
    private String diagonal;
    private String screenResolution;
    private String processor;
    private int SSD;
    private String operativeMemory;
    private String operatingSystem;
    private String color;

    public Laptop() {
    }

    public Laptop(String model, String diagonal, String screenResolution, String processor, int SSD,
            String operativeMemory, String operatingSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.diagonal = diagonal;
        this.screenResolution = screenResolution;
        this.processor = processor;
        this.SSD = SSD;
        this.operativeMemory = operativeMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {return model;}
    public String getDiagonal() {return diagonal;}
    public String getScreenResolution() {return screenResolution;}
    public String getProcessor() {return processor;}
    public int getSSD() {return SSD;}
    public String getOperativeMemory() {return operativeMemory;}
    public String getOperatingSystem() {return operatingSystem;}
    public String getColor() {return color;}
    
    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public List<Laptop> filter(Set<Laptop> laptop) {
        iScanner = new Scanner(System.in);
        System.out.println("Здрасвуйте, укажите параметры для поиска подходящего ноутбука." +
                "\nУкажите производителя процессора\nВ наличии: Intel, AMD, Apple");
        String enterProcessor = iScanner.nextLine();
        System.out.println("Укажите объём SSD накопителя в Gb\nВналичии: 512, 1024, 2000");
        String enterSSD = iScanner.nextLine();
        int intParseEnterSSD = Integer.parseInt(enterSSD);
        System.out.println("Укажите объём оперативной памяти в Gb\nВналичии: 8, 16, 32, 64");
        String enterOperativeMemory = iScanner.nextLine();
        System.out.println("Укажите операционную систему\nВналичии: Linux, macOS, Windows");
        String enterOperatingSystem = iScanner.nextLine();
        System.out.println("Укажите цвет\nВналичии: Black, Gray, Gold");
        String enterColor = iScanner.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : laptop) {
            if (enterProcessor.equals(tempLaptop.processor)) {
                if (intParseEnterSSD == tempLaptop.SSD) {
                    if (enterOperativeMemory.equals(tempLaptop.operativeMemory)) {
                        if (enterOperatingSystem.equals(tempLaptop.operatingSystem)) {
                            if (enterColor.equals(tempLaptop.color)) {
                                listLaptop.add(tempLaptop);
                            }
                        }
                    }
                }
            }
        }
        return listLaptop;
    }

    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Set<Laptop> listLaptop = new HashSet<>(laptop);
        System.out.println("Здравствуйте, укажите номера характеристик для подбора ноутбука." +
        "\n1. Производитель процессора\n2. Объём SSD накопителя" +
        "\n3. Объём опреативной памяти\n4. Операционная система\n5. Цвет");
        String userRequest = iScanner.nextLine();
            
        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите производителя процессора\nВ наличии: Intel, AMD, Apple");
                String enterProcessor = iScanner.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterProcessor.equals(tempLaptop.processor)) == false) { 
                        listLaptop.remove(tempLaptop);
                    }
                }
                System.out.println();          
            }

            if(2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите объём SSD накопителя в Gb\nВналичии : 512, 1024, 2000");
                String enterSSD = iScanner.nextLine();
                int intParseEnterSSD = Integer.parseInt(enterSSD);
                for (Laptop tempLaptop : laptop) {
                    if (intParseEnterSSD != tempLaptop.SSD){ 
                        listLaptop.remove(tempLaptop);
                    }
                }
                System.out.println();          
            }
            
            if(3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите объём оперативной памяти в Gb\nВналичии : 8, 16, 32, 64");
                String enterOperativeMemory = iScanner.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperativeMemory.equals(tempLaptop.operativeMemory)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
                System.out.println();
            }   

            if(4 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите операционную систему\nВналичии : Linux, macOS, Windows");
                String enterOperatingSystem = iScanner.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperatingSystem.equals(tempLaptop.operatingSystem) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
                System.out.println();
            }
        
            if(5 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите цвет\nВналичии : Black, Gray, Gold");
                String enterColor = iScanner.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColor.equals(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
                System.out.println();
            }
        }
        return listLaptop;
    }

    @Override
    public String toString() {
        return "\nНоутбук  ->  " + model + "\nПроизводитель: " + brands + "\nДиагональ: " + diagonal
                + "\nРазрешение экрана: " + screenResolution + "\nПроцессор: " + processor
                + "\nSSD: " + SSD + "\nОперативная память: " + operativeMemory
                + "\nОперационная система: " + operatingSystem + "\nЦвет: " + color + "\n";
    }
}
