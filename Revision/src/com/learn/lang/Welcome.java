package com.learn.lang;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Program");
        Scanner sc = new Scanner(System.in);   //Scanner class belong to java.util package so we have to import it
//	    
//        float f1 =sc.nextFloat();
//        double d1 = sc.nextDouble();
//        byte b1 = sc.nextByte();
//        short s1 = sc.nextShort();
//        int n1 = sc.nextInt();
//        boolean res = sc.nextBoolean();
//        String s2 = sc.next(); // get a single word
//        System.out.println(s2);
//        String s3 = sc.nextLine();// get a whole line
//        System.out.println(s3); 
//----------------------difference between println and print-----------------------------------------------------------------------------
        System.out.println("welcome");  //println means print + new line
        System.out.print(" To ");  //print will not move the cursor to new line
        System.out.println(" Java ");
//----------------------printf formatting-------------------------------------------------------------------------------------        
        int n = 10;
        float f1=23.4f;
        String name= "San";
        System.out.printf("%d %f %s",n,f1,name);
        
	}

}
