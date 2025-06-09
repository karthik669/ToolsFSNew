package com.nt.test;

import com.nt.service.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) { 
    	Arithmetic ar = new Arithmetic();
    	long result1= ar.sum(30, 40);
    	long result2 = ar.sum(50, 80);
    	System.out.println("result: " +result1+"..."+result2);
    	
    }
}
