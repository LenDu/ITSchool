package collections;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by Lena on 2/3/2018.
 */
public class Maps {
    public static void main(String[] args) {
        //create a hash map
        HashMap<String, Double> hm = new HashMap<String, Double>();

        //put elements to the map
        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Lane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        //get a set of the entries
        java.util.Set<Map.Entry<String, Double>> set = hm.entrySet();

        //Display the set
        for (Map.Entry<String, Double> me:set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Deposit 1000 into Jon Doe's account
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balanve:  " + hm.get("John Doe"));


    }
}
