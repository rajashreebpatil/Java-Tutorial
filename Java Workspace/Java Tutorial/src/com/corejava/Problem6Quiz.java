// WRITE PROGRAM FOR STUDENT MARKS IN 5 SUBJET AND FIND PERCENTSGE MUST B TAKEN INPUT FROM KEYBOARDS


package com.corejava;

import java.util.Scanner;

public class Problem6Quiz {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sub1 marks");
        int sub1 = scan.nextInt();
        System.out.println("Enter sub2 marks");
        int sub2= scan.nextInt();
        System.out.println("Enter sub3 marks");
        int sub3 = scan.nextInt();
        System.out.println("Enter sub4 marks");
        int sub4= scan.nextInt();
        System.out.println("Enter sub5 marks");
        int sub5= scan.nextInt();

        float percentage=((sub1+sub2+sub3+sub4+sub5)/500.0f)*100;
        System.out.println("Percentage :"+ percentage);






    }
}
