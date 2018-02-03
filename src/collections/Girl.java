package collections;

/**
 * Created by Lena on 2/3/2018.
 */
public class Girl implements Comparable<Girl> {
    String fname;
    String lname;
    int age;

    public Girl(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Girl girl = (Girl) o;

        if (age != girl.age) return false;
        if (fname != null ? !fname.equals(girl.fname) : girl.fname != null) return false;
        return lname != null ? lname.equals(girl.lname) : girl.lname == null;
    }

    @Override
    public int hashCode() {
        int result = fname != null ? fname.hashCode() : 0;
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Girl o) {
        return age-o.age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
