package oop;

import com.sun.org.apache.xml.internal.security.c14n.implementations.Canonicalizer11;

/**
 * Created by Lena on 12/10/2017.
 */
public class CA extends CA1 implements IA, IAIa{
    void n(){
        System.out.println("not static +A");
    }

    void n1(){
        throw new UnsupportedOperationException();
    }

    @Override
    public void m1() {
        System.out.println("Override method");
    }

    @Override
    public void m2() {
        IAIa.super.m2();
    }
}
