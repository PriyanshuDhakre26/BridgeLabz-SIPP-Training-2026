package Secenario_based_questions;
/*A kingdom's tax system charges 5% for income <10K, 15% for 10K–
50K, 30% above 50K. Read a citizen's income, print tax bracket and
amount. Extend: loop over an array of 10 citizens and tally total tax
collected.*/

import java.util.*;
public class tax_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double []arr = new double[10];
        System.out.println("Enter 10 citizens income:");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextDouble();
        }
        int total_tax=0;
        for(double i:arr){
            if(i<10000){
                System.out.println("amout:"+i+"tax:"+(int)(0.05*i));
                total_tax+=(int)(0.05*i);
            }
            else if(i>=10000 && i<=50000){
                System.out.println("amout:"+i+"tax:"+(int)(0.15*i));
                 total_tax+=(int)(0.15*i);
            }
            else{
                 System.out.println("amout:"+i+"tax:"+(int)(0.3*i));
                  total_tax+=(int)(0.3*i);
            }
        }
        System.out.println(total_tax);
    }
}
