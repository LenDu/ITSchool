package oop;

/**
 * Created by Lena on 11/27/2017.
 */
class Test1{
    int a;

    public Test1(int i) {
        a = i;
    }

    Test1 incrByTen(){
        Test1 temp = new Test1(a + 10);
        return temp;
    }
}
