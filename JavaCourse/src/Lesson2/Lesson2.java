package Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {


    }

    static void clock() {
        byte  maxHour = 23;
        byte  maxMinute = 59;
        int counter = 0;
        // цикл по i - часы, цикл по j - минуты
        for (int i = 0; i <= maxHour; i++) {
            for (int j = 0; j <= maxMinute; j++) {
                if ((j % 10 == i / 10 ) && (i % 10 == j / 10 )) {
                    counter++;
                    //System.out.println("hours: " + i + " minutes: " + j);
                }
            }
        }
        System.out.println("counter = " + counter);
    }

    static void printHourglass(){
        //Scanner in = new Scanner(System.in);
        int i = 0;
        int b = 10;
        int c = 0;

        for (i = 0; i < 10; i++){

            if (i<5) {
                for (int h = 0; h <= c; h++) {
                    System.out.print(" ");
                }
                for (int j = b; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println(" ");
                b-=2;
                c++;
            }
            else
            if (i>5){
                b+=2;
                c--;
                for (int h = 0; h <= c; h++) {
                    System.out.print(" ");
                }
                for (int j = b; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            else {
                b+=2;
                c--;}
        }
    }
}

