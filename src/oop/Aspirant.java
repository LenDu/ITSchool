package oop;

/**
 * Created by Lena on 11/27/2017.
 */
public class Aspirant extends Student {
    private String work;
    private String name; //перекрытие переменной класса-родителя, в таком случае обратиться к переменной базового класса можно через ключ слово super

    public Aspirant(String name, int age, String work) {
        super(name, age); //super - ключевое слово для обращения к классу-родителю
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                "} " + super.toString();
    }
}
