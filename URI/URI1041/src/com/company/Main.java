package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
	double x=scan.nextDouble();
    double y=scan.nextDouble();
        if (x==0) {System.out.println("Eixo X");}
        if (y==0) {System.out.println("Eixo Y");}
        if (x>0 && y>0) {System.out.println("Q1");}
        if (x>0 && y<0) {System.out.println("Q4");}
        if (x<0 && y>0) {System.out.println("Q2");}
        if (x<0 && y>0) {System.out.println("Q3");}
        if (x==0 && y==0) {System.out.println("Origem");}

        // write your code here
    }
}
