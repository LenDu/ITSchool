package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class CityDemo {
    public static void main(String[] args) {
        Office office = new Office("Igor", 123, City.Kharkiv);
        System.out.println(office);
        office.m(); //метод отмечен как Depricated
    }
}
