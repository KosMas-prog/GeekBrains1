package lesson01;

import sun.awt.geom.AreaOp;

public class HomeWork1 {
    public static void main(String[] args) {
        int a=1;
        byte b=2;
        short c=3;
        long d=4L;
        double e=5;
        float f=1.05f;
        System.out.println(total(2,3,4,5));
        System.out.println(between(10));
        plusminus(0);
        minus(-1);
        hello("Константин");
        leapYear(2020);

    }
    public static double total(double a, double b, double c, double d){
        return a*(b+(c/d));
    }
    public static boolean between(int a){
        boolean b=false;
        b=(a>=10 && a<=20)? true: false;
        return b;
    }
    public static void plusminus(int a) {
        String b = a<0 ? "Число отрицательное" : "Число положительное";
        System.out.println(b);
    }
    public static boolean minus(int a) {
        boolean b = a<0 ? true : false;
        return (b);
    }
    public static void hello (String  name) {
        System.out.println("Привет, " + name +"!");
    }
    public static void leapYear(int year){
        String leap = (year%4==0 && year%100 != 0 || year%400==0)? "Год високосный": "Год Не високосный";
        System.out.println(leap);
    }
}
