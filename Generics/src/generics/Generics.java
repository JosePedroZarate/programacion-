/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.lang.reflect.Method;
import javax.rmi.CORBA.Util;



/**
 *
 * @author pipe
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box<Integer> integerBox = new Box<Integer>();
        
        integerBox.setT(10);
        integerBox.inspect(15);
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(1, "orange");
        boolean same = Method.compare(p1, p2);
        System.out.println(same);
        
    }
    
        
}


    

