package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
public static void main(String [] args){
    System.out.println(" Welcome to Line Comparison Computation Program ");
    Scanner scan = new Scanner(System.in);
    System.out.println("x1");
    System.out.println("x2");
    System.out.println("y1");
    System.out.println("y2");

    float x1 =scan.nextInt();
    float x2 =scan.nextInt();
    float y1 =scan.nextInt();
    float y2 =scan.nextInt();

    float a =((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
    float b= (float) Math.sqrt(a);
    System.out.println("Length of the line = " +b);
}
}
