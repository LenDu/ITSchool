package oop;

/**
 * Created by Lena on 12/16/2017.
 */
public class Week7 {
    IW71 w71;
    IW72 w72;
    IW73 w73;

    public Week7() {

    }

    void print(){
        w71.print();
        w72.print();
        w73.print();
    }

    public Week7(IW71 w71, IW72 w72, IW73 w73) {
        this.w71 = w71;
        this.w72 = w72;
        this.w73 = w73;
    }
}
