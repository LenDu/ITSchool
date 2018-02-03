package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class Office {

    private final String ceo;
    private final int count;
    private final City city;

    public Office(String ceo, int count, City city) {

        this.ceo = ceo;
        this.count = count;
        this.city = city;
    }

    @Deprecated
    public void m(){

    }

    @Override
    public String toString() {
        return "Office{" +
                "ceo='" + ceo + '\'' +
                ", count=" + count +
                ", city=" + city +
                '}';
    }
}
