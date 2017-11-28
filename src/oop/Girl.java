package oop;

/**
 * Created by Lena on 11/19/2017.
 */
public class Girl {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 18 && age < 25) {
            this.age = age;
        }
    }

    //конструктор класса Girl для задания свойств обьекта (Alt + Insert - сгенериь автоматически), метод иммект такое же имя как и класс
    public Girl(String name, int age) {
        this(); //ссылается на другой конструктор текущего обьекта в рамках данного классаб в данном случае на дефолтный
        this.name = name;
        setAge(age);
    }

    //дефолтный конструктор, для того чтобы иметь возможность сощдавать обькты без параметров
    public Girl() {
        System.out.println("Hi");
    }

    //метод void ничего не возвращает
    void goToCinema() {
        System.out.println("Go");
    }

    String goToRest(String rest) {
        if ("Mac".equals(rest)) {
            return String.format("Girl name - %s says NO", name);
        }
        return "Yes";
    }

    //медот преобразовывает обьект в строку
    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Goodbye!");
    }
}
