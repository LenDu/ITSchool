package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class Girl implements Comparable<Girl> {
    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Girl o) {
        //return age - o.age;
       // return name.compareTo(o.name);
        return name.length()-o.name.length();
    }
}
