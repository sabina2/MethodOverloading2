package com.Loading;
import java.util.Scanner;
public class Main {
    Scanner scanner=new Scanner(System.in);
    public static String Greet(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your message");
        String a=scanner.nextLine();
        return a;
    }
    public static String Greet(String a,String b){
        return a+b;
    }
    public static String Greet(String a,String b,String c){
        return a+b+c;
    }


    public static void main(String[] args) {
        System.out.println(Greet());
        System.out.println(Greet("Hello"," Ram"));
        System.out.println(Greet("Hello"," Everyone!!"));

    }
}
