package oop;

/**
 * Created by Lena on 12/16/2017.
 */
public class Week7Main {
    public static void main(String[] args) {
//        new Week7(new IW71() {
//            @Override
//            public void print() {
//                System.out.println("IW71 realisation");
//            }
//        }, new ClassIW72(), new ClassIW73()).print();
       // new Week7(new ClassIW712(), new ClassIW72(), new ClassIW73()).print();

        IW71 var = new IW71() {
            @Override
            public void print() {

            }
        };
        var.print();

        new Week7(){
            int ad = 123;

            @Override
            void print() {
                System.out.println("ffffffffffff");
                sdd();
            }

            void sdd(){
                System.out.println(ad);
            }
        };

    }
}

