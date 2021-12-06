package by.bsu.triangle;

import java.util.Scanner;

public class triangle {

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        System.out.println("first");
        double a = scan.nextDouble();
        System.out.println("second");
        double b = scan.nextDouble();
        System.out.println("third");
        double c = scan.nextDouble();

        if (a>0 && b>0 && c>0) {
            if (a + b > c && a + c > b && c + b > a) {
                double area = heron(a,b,c);
                double Circumference = (a+b+c);
                System.out.println("area is:"+ area);
                System.out.println("Circumference is:"+ Circumference);
            }
            else {
                System.out.println("it's not triangle");
            }
        }
        else{
            System.out.println("it's not triangle");
        }


    }

    public static double heron(double a,double b,double c){
        double p = (a+b+c)/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}
