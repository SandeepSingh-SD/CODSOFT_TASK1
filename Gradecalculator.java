/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradecalculator;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Gradecalculator {

    public static void main(String[] args) {
        System.out.println("_____Student Grade Calculator_____");
        System.out.println("  ");
        Scanner sd = new Scanner(System.in);
        int mark = 0;
       
        // Enter Number of Subjects;
        System.out.print("Enter The Number Of Subjects : ");
        System.out.print(" ");
        int sub=sd.nextInt();
        for(int i =0;i < sub; i++){
            System.out.print("Enter The Marks Obtained in Subject "+(i+1));
            System.out.print(": ");
            int num = sd.nextInt();
            mark += num;   
        }
        
        //Calculation
        int total= mark / sub;
        
         //Display Show...
        System.out.println(" ");
        System.out.println("Total Mark of Obtained : "+mark);
        System.out.println("Average Percentage :"+total+"%");
        
        if(total >=91 && total<=100){
            System.out.print("Grade : A+");
        }
        else if(total >=81&& total<=90){
            System.out.print("Grade : A");  
        }
        else if(total >=71 && total<=80){
            System.out.print("Grade : B+");  
        }
        else if(total >=61 && total<=70){
            System.out.print("Grade : B");  
        }
        else if(total >=51 && total<=60){
            System.out.print("Grade : C+");  
        }
        else if(total >=41 && total<=50){
            System.out.print("Grade : C");  
        }
        else if(total >=31 && total<=40){
            System.out.print("Grade : D");  
        }
        else {
            System.out.print("Grade : F");  
        }
      
    }       
}
