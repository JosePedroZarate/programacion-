/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author pipe
 */
public class Box<T>{
    private T t;

  public T get() { return t; }
  public void set(T t) { this.t = t; }
    
    public <U extends Number> void inspect(U u){
        System.out.println("A: " + t.getClass().getName());
        System.out.println("B: " + u.getClass().getName());
    
}

    void setT(int i) {
        
    }
}
