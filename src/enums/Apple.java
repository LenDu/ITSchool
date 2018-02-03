package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public enum Apple implements Comparable<Apple> {
    A("a", 12), B("b", 22), C("C", 11), D("d", 4), E("e", 44);
    String name;
    int price;

    Apple(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Apple() {
    }

}
