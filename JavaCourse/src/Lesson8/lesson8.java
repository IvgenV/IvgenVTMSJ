package Lesson8;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class lesson8 {

    public static void main(String[] args) throws IOException {

        ticTacToe();

    }


    public static void OneDimensionalArrays1(){
        int[] mas = {2,4,6,8,10,12,14,16,18,20};
        for (int number:mas){
            System.out.print(number + " ");
        }
        for (int number:mas){
            System.out.println(number);
        }
    }

    public static void OneDimensionalArrays2(){

        int[] mas = new int [50];
        int odd = 1;

        for (int i=0;i<50;i++){
            mas[i] = odd;
            odd+=2;
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i=mas.length-1;i>=0;i--){
            System.out.print(mas[i] + " ");
        }
    }

    public static void OneDimensionalArrays3(){

        int[] mas = new int[15];
        int count=0;

        for (int i=0;i<mas.length;i++){
            mas[i] = (int)(Math.random()*100);
            System.out.print(mas[i] + " ");
        }

       System.out.println("");

        for (int number:mas){
            if(number%2==0){
                count++;
            }
        }

        System.out.println(count);

    }

    public static void OneDimensionalArrays4(){

        int[] mas = new int[20];

        for (int i=0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*21);
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i=0;i<mas.length;i++){
            if(i%2!=0){
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }

    }

    public static void OneDimensionalArrays5(){

        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        double average = 0;
        double average2 = 0;

        for (int i=0;i<mas1.length;i++){
            mas1[i] = (int) (Math.random()*16);
            average += mas1[i];
            System.out.print(mas1[i] + " ");
        }

        System.out.println();

        for (int i=0;i<mas1.length;i++){
            mas2[i] = (int) (Math.random()*16);
            average2 += mas2[i];
            System.out.print(mas2[i] + " ");
        }

        System.out.println();

        average /= 5;
        average2 /= 5;

        if(average>average2){
            System.out.println("Массив 1 больше массива 2");
        } else if (average<average2){
            System.out.println("Массив 2 больше массива 1");
        } else System.out.println("Они равны");

    }

    public static void OneDimensionalArrays6(){

        int[] mas = new int[4];

        for (int i = 0;i<mas.length;i++){
            mas[i] = (int)(Math.random()*11);
            System.out.print(mas[i] + " ");
        }

        System.out.println("");

        int count=1;
        int lengthMas = mas.length;


        for (int i=0;i<mas.length;i++){
            if(i==0){

            } else if(mas[i]>mas[i-1]) {
                count++;
            }
        }

       if(count==lengthMas){
            System.out.println("Increasing sequence");
        }else System.out.println("Nope");

    }

    public static void OneDimensionalArrays7(){

        int[] mas = new int[12];
        int max=0;
        int index=0;

        for(int i =0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*16);
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for(int i =0;i<mas.length;i++){
           if(mas[i]>=max){
               max = mas[i];
               index = i;
           }
        }

        System.out.println("Index " + index + " value " + max);
    }

    public static void OneDimensionalArrays8(){

        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        double[] realNumbers = new double[10];
        double fractionalPart;
        int count=0;

        for(int i=0;i<mas1.length;i++){
            mas1[i] = (int)(Math.random()*10);
            System.out.print(mas1[i] + " ");
        }

        System.out.println();

        for(int i=0;i<mas1.length;i++){
            mas2[i] = (int)(Math.random()*10);
            System.out.print(mas2[i] + " ");
        }

        System.out.println();

        for (int i=0;i<realNumbers.length;i++){
            realNumbers[i] = (double) (mas1[i]) / (double) (mas2[i]);
            System.out.print(realNumbers[i] + " ");
        }

        System.out.println();

        for (int i=0;i<realNumbers.length;i++){
            fractionalPart = realNumbers[i]%1;
            if(fractionalPart==0){
                System.out.print((int)realNumbers[i] + " ");
                count++;
            }
        }
        System.out.println(" count of whole numbers = " + count);

    }

    public static void OneDimensionalArrays9(){

        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int firstHalf = 0;
        int secondHalf = 0;

        do {
            System.out.println("Input even positive number:");
            inputNumber = scanner.nextInt();
            if(inputNumber%2!=0||inputNumber<=0){
                System.out.println("it's not even or it's not positive! Try again!");
            }
        }while (inputNumber%2!=0||inputNumber<=0);

        scanner.close();

        int[] mas = new int[inputNumber];
        for (int i=0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*16);
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i=0;i<mas.length;i++){
            if(i<inputNumber/2){
                firstHalf+=mas[i];
            } else {
                secondHalf += mas[i];
            }
        }

        if(firstHalf>secondHalf){
            System.out.println("First half bigger than second half");
        }else if(firstHalf<secondHalf){
            System.out.println("Second half bigger than first half");
        } else System.out.println("It's equals");

    }

    public static void OneDimensionalArrays10(){

        int n;
        int masEvenNumberLength=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input number bigger than 3");
            n = scanner.nextInt();
            if (n<=3){
                System.out.println(" Number less or equals 3.Try again.");
            }
        }while (n<=3);

        int[] mas = new int[n];

        for (int i=0;i<mas.length;i++){
            mas[i] = (int) (Math.random()*(n+1));
            if(mas[i]%2==0){
                masEvenNumberLength++;
            }
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        int[] masEvenNumber = new int[masEvenNumberLength];
        int masEvenNumberElement = 0;

        if(masEvenNumberLength==0){
            System.out.println("There are no even elements");
        }else {
            for(int i:mas){
                if(i%2==0){
                    masEvenNumber[masEvenNumberElement] = i;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void additionalOneDimensionalArrays1(){

        int[] mas = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int element = 1;

        for (int i : mas) {
            if (i % 3 == 0) {
                element *= i;
            }
        }

        if(element==1){
            System.out.println("There are no elements multiples of three");
        }else System.out.println(element);

    }

    public static void additionalOneDimensionalArrays2(){

        int[] mas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int count = 0;
        int sum=0;
        double finalNumber;

        for (int i=1;i<mas.length;i+=2){
                sum+=mas[i];
                count++;
        }

        finalNumber = (double) sum/count;

        System.out.println(finalNumber);

    }

    public static void additionalOneDimensionalArrays3(){

        int[] mas = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int c = 6;
        int count = 0;
        int sum=0;
        double finalNumber;

        if(c<= mas.length){
            for (int i = c;i<mas.length;i++){
                sum+=mas[i];
                count++;
            }
            finalNumber = (double) sum/count;
            System.out.println(finalNumber);
        }else System.out.println("Length of the massive is less than C");

    }

    public static void additionalOneDimensionalArrays4(){

        int[] mas = {123,2,3,-4,5,12,3,6,7,1,92,99,12,68,3};
        int minElement = 0;

        for(int i=1;i<mas.length;i+=2){
            if(i==1){
                minElement = mas[i];
            }else {
                if(mas[i]<minElement){
                    minElement = mas[i];
                }
            }
        }

        System.out.println(minElement);

    }

    public static void additionalOneDimensionalArrays5(){

        int[] mas = {0,1,2,3,4,5,6,7,8,9};

        for(int i=0;i<mas.length;i+=2){
            mas[i] = 0;
        }

        for (int i:mas){
            System.out.println(i);
        }

    }

    public static void additionalOneDimensionalArrays6(){

        int[] mas = {0,1,2,3,15,7,6,81,-5,27,35,9};
        int lastNumber = 0;
        boolean equals = true;

        for(int i = mas.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( mas[j] > mas[j+1] ){
                int tmp = mas[j];
                mas[j] = mas[j+1];
                mas[j+1] = tmp;
                }
            }
        }

        for(int i=0;i<mas.length;i++){
            if(i==0){
                lastNumber = mas[i];
            } else {
                if(lastNumber==mas[i]){
                    equals = false;
                    break;
                }else{
                    lastNumber = mas[i];
                }
            }
        }

        if(equals){
            System.out.println("Elements are different");
        } else System.out.println("Some elements are not equals");

    }

    public static void additionalOneDimensionalArrays7() {

        int[] mas = {0,1,2,3,4,4,5,6,7,8,4,9,10};
        int number = 4;
        int count = 0;

        for(int i=0;i<mas.length;i++){
            if(mas[i]==number){
                count++;
            }
        }

        System.out.println(count);

    }

    public static void additionalOneDimensionalArrays8(){

        int[] mas = {0,1,2,3,38,3,4,7,19,38,38,38,-5,17,21,39,39,39};
        int maxElement = 0;
        int predMax = 0;

        for(int i=0;i<mas.length;i++){
            if(i==0){
                maxElement = mas[i];
            }else if(mas[i]>maxElement){
                predMax = maxElement;
                maxElement = mas[i];
            }
        }

        System.out.println(predMax);

    }

    public static void additionalOneDimensionalArrays9(){

        int[] mas = {0,1,-23,46,78,3,-20,9,-5,-20,185,-20,21};
        int smallestElement = 0;

        if(mas.length>2){
            for(int i=2;i<mas.length;i+=2){
                if(i==2){
                    smallestElement = mas[i];
                }else {
                    if(mas[i]<smallestElement){
                        smallestElement = mas[i];
                    }
                }
            }
            System.out.println(smallestElement);
        } else {
            System.out.println("There are no even elements in the array");
        }

    }

    public static void additionalOneDimensionalArrays10(){

        int[] mas = {3,0,0,0,6,6,6,7,25,99,250,6,6,179,250};
        int temp = mas[0];
        int maxElement = 0;
        int positionMaxElement=0;

        for(int i=0;i<mas.length;i++){
            if(i==0){
                maxElement = mas[i];
            }else {
                if(mas[i]>maxElement){
                    maxElement = mas[i];
                    positionMaxElement = i;
                }
            }
        }

        mas[0] = maxElement;
        mas[positionMaxElement] = temp;

        for(int i:mas){
            System.out.println(i);
        }

    }

    public static void multiDimensionalArrays1(){

        boolean check=true;
        int line;
        int column;
        int diagonal = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input count of line:");
            line = scanner.nextInt();
            System.out.println("Input count of column:");
            column = scanner.nextInt();
            if(line>=2&line==column){
                check=false;
            }else System.out.println("You input wrong!");
        }while (check);

        int[][] mas  = new int[line][column];

        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j] = (int) (Math.random()*51);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=2;i<mas.length;i+=2){
            diagonal+=mas[i][i];
        }

        System.out.println(diagonal);

    }

    public static void multiDimensionalArrays2(){

        boolean check=true;
        int line;
        int column;
        int diagonal = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input count of line:");
            line = scanner.nextInt();
            System.out.println("Input count of column:");
            column = scanner.nextInt();
            if(line>=2&line==column){
                check=false;
            }else System.out.println("You input wrong!");
        }while (check);

        int[][] mas  = new int[line][column];

        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j] = (int) (Math.random()*51);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<mas.length;i++){
            for(int j=0;j<=diagonal;j++){
                if(j%2!=0||j==0){
                    System.out.print(mas[i][j] + " ");
                }
            }
            diagonal++;
            System.out.println();
        }

    }

    public static void multiDimensionalArrays3(){

        boolean check=true;
        int line;
        int column;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input count of line:");
            line = scanner.nextInt();
            System.out.println("Input count of column:");
            column = scanner.nextInt();
            if(line>=2&line==column){
                check=false;
            }else System.out.println("You input wrong!");
        }while (check);

        int[][] mas = new int[line][column];
        int mainDiagonal = 0;
        int secondaryDiagonal = mas.length-1;
        int sumMainDiagonal = 1;
        int sumSecondaryDiagonal = 1;

        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j] = (int) (Math.random()*51);
                System.out.print(mas[i][j] + " ");
            }
            sumMainDiagonal *= mas[i][mainDiagonal];
            mainDiagonal++;
            sumSecondaryDiagonal *= mas[i][secondaryDiagonal];
            secondaryDiagonal--;
            System.out.println();
        }

        System.out.println(sumMainDiagonal + " " + sumSecondaryDiagonal);

    }

    public static void multiDimensionalArrays4(){

        boolean check=true;
        int line;
        int column;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input count of line:");
            line = scanner.nextInt();
            System.out.println("Input count of column:");
            column = scanner.nextInt();
            if(line>=3&line==column){
                check=false;
            }else System.out.println("You input wrong!");
        }while (check);
        
        int[][] mas = new int[line][column];

        int sideDiagonal = mas.length-1;
        int sum=0;

        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j] = (int) (Math.random()*51);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<mas.length;i++){
            for(int j=0;j<sideDiagonal;j++){
                if(j%2==0&j!=0){
                    sum+=mas[i][j];
                }
            }
            sideDiagonal--;
        }

        System.out.println(sum);

    }

    public static void multiDimensionalArrays5() {

        boolean check=true;
        int line;
        int column;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input count of line:");
            line = scanner.nextInt();
            System.out.println("Input count of column:");
            column = scanner.nextInt();
            if(line>=3&line==column){
                check=false;
            }else System.out.println("You input wrong!");
        }while (check);

        int[][] mas = new int[line][column];

        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j] = (int) (Math.random()*51);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] transportMas = new int[mas[0].length][mas.length];

        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                transportMas[i][j] = mas[j][i];
                System.out.print(transportMas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ticTacToe(){

        String[][] mas = new String[3][3];
        boolean contin = true;
        boolean outOfBound;
        boolean equalsVertical = false;
        boolean equalsHorizontal = false;
        boolean equalsMainDiagonal = false;
        boolean equalsSecondaryDiagonal = false;
        boolean draw = false;
        int player1 = 1;
        int player2 = 2;
        int currentPlayer = 1;
        int line ;
        int column ;
        String symbolPlayer1 = " X ";
        String symbolPlayer2 = " 0 ";
        String whosHasWon = "";
        String lastIndexVertical;
        String lastIndexHorizontal;
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i< mas.length;i++){
            Arrays.fill(mas[i], " - ");
        }

        do {

            for (int i=0;i< mas.length;i++){
                for (int j=0;j<mas[i].length;j++){
                    System.out.print(mas[i][j]);
                }
                System.out.println();
            }

            outOfBound = false;

            if(currentPlayer == player1){
                System.out.println("Player1 turn. Input line:");
                    line = scanner.nextInt()-1;
                    System.out.println("Input column:");
                    column = scanner.nextInt()-1;
                    if(column >2 || column < 0){
                        System.out.println("It's wrong column! Try again!");
                        outOfBound = true;
                    }
                    if (line >2 || line<0) {
                        System.out.println("It's wrong line! Try again!");
                        outOfBound = true;
                    }

                    if(outOfBound){

                    }else if(mas[line][column].equals(" - ")){
                        mas[line][column] = symbolPlayer1;
                        currentPlayer = player2;
                    }else{
                        System.out.println("This field s taken by Player2. Try another one.");
                    }
            } else {
                System.out.println("Player2 turn. Input line:");
                    line = scanner.nextInt()-1;
                    System.out.println("Input column:");
                    column = scanner.nextInt()-1;

                    if(column >2 || column < 0){
                        System.out.println("It's wrong column! Try again!");
                        outOfBound = true;
                    }
                    if (line >2 || line<0) {
                        System.out.println("It's wrong line! Try again!");
                        outOfBound = true;
                    }

                    if(outOfBound){

                    } else if(mas[line][column].equals(" - ")){
                        mas[line][column] = symbolPlayer2;
                        currentPlayer = player1;
                    } else {
                        System.out.println("This field s taken by Player1. Try another one.");
                    }
            }

            for(int i=0;i<mas.length;i++){
                lastIndexHorizontal = mas[i][mas[i].length-1];

                for(int j=mas.length-1;j>=0;j--){

                    if(lastIndexHorizontal.equals(" - ")){
                        equalsHorizontal = false;
                        break;
                    }

                    if(mas[i][j].equals(" - ")){
                        equalsHorizontal = false;
                        break;
                    }else if(!lastIndexHorizontal.equals(mas[i][j])){
                        equalsHorizontal = false;
                        break;
                    } else if(lastIndexHorizontal.equals(symbolPlayer1)){
                        equalsHorizontal = true;
                        whosHasWon = "Player1 win! horizontal";
                    } else {
                        equalsHorizontal = true;
                        whosHasWon = "Player2 win! horizontal";
                    }

                }

                if(equalsHorizontal){
                    contin = false;
                    break;
                }
            }

            for(int i=0;i<mas.length;i++){
                lastIndexVertical = mas[mas[i].length-1][i];
                for(int j=mas.length-1;j>=0;j--){

                    if(lastIndexVertical.equals(" - ")){
                        equalsVertical = false;
                        break;
                    }

                    if(mas[j][i].equals(" - ")){
                        equalsVertical = false;
                        break;
                    }else if(!lastIndexVertical.equals(mas[j][i])){
                        equalsVertical = false;
                        break;
                    } else if(lastIndexVertical.equals(symbolPlayer1)){
                        equalsVertical = true;
                        whosHasWon = "Player1 win! horizontal";
                    } else {
                        equalsVertical = true;
                        whosHasWon = "Player2 win! horizontal";
                    }
                }
                if(equalsVertical){
                    contin = false;
                    break;
                }
            }

           for(int i=0;i<mas.length-1;i++) {
               if (mas[0][0].equals(" - ")) {
                   equalsMainDiagonal = false;
                   break;
               } else if (mas[i][i].equals(mas[i + 1][i + 1]) & mas[0][0].equals(symbolPlayer1) &
                       !mas[i][i].equals(" - ")) {
                   equalsMainDiagonal = true;
                   whosHasWon = "Player1 win! main diagonal";
               } else if (mas[i][i].equals(mas[i + 1][i + 1]) & mas[0][0].equals(symbolPlayer2) &
                       !mas[i][i].equals(" - ")) {
                   equalsMainDiagonal = true;
                   whosHasWon = "Player2 win! main diagonal";
               } else {
                   equalsMainDiagonal = false;
               }
           }

           for(int i=0;i<mas.length-1;i++){
               if(mas[0][mas.length-1].equals(" - ")){
                   break;
               }else if(mas[i][mas.length-1-i].equals(mas[i+1][(mas.length-1)-(i+1)])&mas[0][mas.length-1].
                       equals(symbolPlayer1)&!mas[i][mas.length-1-i].equals(" - ")){
                   equalsSecondaryDiagonal = true;
                   whosHasWon = "Player1 win! Secondary diagonal";
               }else if(mas[i][mas.length-1-i].equals(mas[i+1][(mas.length-1)-(i+1)])&mas[0][mas.length-1].
                       equals(symbolPlayer2)&!mas[i][mas.length-1-i].equals(" - ")){
                   equalsSecondaryDiagonal = true;
                   whosHasWon = "Player2 win! Secondary diagonal";
               }else {
                   equalsSecondaryDiagonal = false;
               }
           }

            if (equalsMainDiagonal) {
                contin = false;
            }
            if(equalsSecondaryDiagonal){
                contin = false;
            }

            for(int i=0;i<mas.length;i++){////????????
                 draw = Arrays.asList(mas[i]).contains(" - ");
                 break;
            }
            if (!draw & contin) {
                contin = false;
                whosHasWon = "Draw!";
            }

        }while (contin);

        System.out.println("Finish! " + whosHasWon);
        for (int i=0;i< mas.length;i++){
            for (int j=0;j<mas[i].length;j++){
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }


    }

}
