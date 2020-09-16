package javatraining2;

import java.util.*; 
import java.io.*; 
  
class one 
{ 
    public void print_A() 
    { 
        System.out.println("A"); 
    } 
} 
  
class two extends one 
{ 
    public void print_B() 
    { 
        System.out.println("B"); 
    } 
} 
  
class three extends two
{ 
    /*............*/
} 
  
// Drived class 
public class inheritanceexmple 
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.print_A(); 
        g.print_B();
        two t = new two(); 
        t.print_B(); 
        g.print_A(); 
    } 
} 