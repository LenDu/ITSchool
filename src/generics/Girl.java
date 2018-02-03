package generics;

/**
 * Created by Lena on 1/27/2018.
 */
public class Girl implements Comparable<Girl> {
    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Girl o){
        return age - o.age;
    }
}
