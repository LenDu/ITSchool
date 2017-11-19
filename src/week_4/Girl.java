package week_4;

/**
 * Created by Lena on 11/19/2017.
 */
public class Girl {
    String name;
    int age;
//конструктор класса Girl для задания свойств обьекта (Alt + Insert - сгенериь автоматически), метод иммект такое же имя как и класс
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
//дефолтный конструктор, для того чтобы иметь возможность сощдавать обькты без параметров
    public Girl() {
    }

    //метод void ничего не возвращает
    void goToCinema(){
        System.out.println("Go");
    }

    String goToRest(String rest){
        if("Mac".equals(rest)){
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
}
