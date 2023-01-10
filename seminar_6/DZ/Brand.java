package Seminars.seminar_6.DZ;

public class Brand {
    private String brand;
    private String country;

    public Brand(String brand, String country){
        this.brand = brand;
        this.country = country;
        }

    public String getBrand() {return brand;}
    public String getCountry() {return country;}

    @Override
    public String toString() {
        return brand + ", Страна производства: " + country;
    }
}
