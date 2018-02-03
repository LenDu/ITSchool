package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public enum City {
    Kharkiv (12, 123), Kiev(123, 1234), Dnepr(125, 123);
    int population;
    double square;

    City(int population, double square) {
        this.population = population;
        this.square = square;
    }

    public void setPeople(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}