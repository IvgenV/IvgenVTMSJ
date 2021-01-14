package Lesson7;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;

public class Lesson7 {

    public static void main(String[] args) throws IOException {

        task4();

    }

    public static void task1() throws IOException {

        BufferedReader bufRead = null;
        BufferedWriter bufWr = null;

        try {
            bufRead = new BufferedReader(new FileReader("notes.txt"));

            String str;
            StringBuilder str2= new StringBuilder();

            while ((str=bufRead.readLine())!=null){
                String reverseWord = new StringBuilder(str).reverse().toString();
                if(str.toLowerCase(Locale.ROOT).equals(reverseWord.toLowerCase(Locale.ROOT))){
                    str2.append(str).append("\n");
                }
            }
            str2.deleteCharAt(str2.length()-1);

            bufWr = new BufferedWriter(new FileWriter("palindromes.txt"));
            bufWr.write(str2.toString());



        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            if(bufRead!=null){
                bufRead.close();
            }
            if(bufWr!=null){
                bufWr.close();
            }
        }


    }

    public static void task2() throws IOException {
        FileInputStream fileIn = null;
        BufferedWriter bufferWr = null;
        boolean threeOrFive;
        boolean isPalindrome;
        StringBuilder temporaryText = new StringBuilder();
        StringBuilder finalText = new StringBuilder();
        try {
            fileIn = new FileInputStream("task2.txt");
            bufferWr = new BufferedWriter(new FileWriter("newTask2.txt"));
            int a;
            while ((a = fileIn.read())!=-1){
                if((char)a=='.'||(char)a=='?'||(char)a=='!'){
                    threeOrFive = TextFormater.countWordInLine(temporaryText.toString());
                    isPalindrome = TextFormater.palindrome(temporaryText.toString());
                    if(threeOrFive||isPalindrome){
                        finalText.append(temporaryText).append('.');
                    }
                    temporaryText.delete(0,temporaryText.length());
                } else {
                    temporaryText.append((char)a);
                }
            }
            System.out.print(finalText);
            bufferWr.write(finalText.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fileIn!=null){
                fileIn.close();
            }
            if(bufferWr!=null){
                bufferWr.close();
            }
        }
    }

    public static void task3(){

        int c;
        int count=0;
        StringBuilder text = new StringBuilder();
        String s="";

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("task3BlackList.txt"));
            BufferedReader br = new BufferedReader(new FileReader("task3Text.txt"));

            while ((c=br.read())!=-1){
                if((char)c=='.'||(char)c=='!'||(char)c=='?'){
                    text.append((char)c).append('\n');
                }else text.append((char) c);
            }


            String[] textMas = text.toString().split("\n");
            StringBuilder temporarySentence = new StringBuilder();
            boolean[] matorno = new boolean[textMas.length];

            while ((s = bufferedReader.readLine()) != null){
                for (int i=0;i<textMas.length;i++){
                    String[] ms2 = textMas[i].split(" ");
                    for (String word:ms2){
                        word = word.replaceAll("[ -?]","");
                        if(matorno[i]){

                        } else if(word.equals(s)& !temporarySentence.toString().equals(textMas[i])){
                            count++;
                            temporarySentence.append(textMas[i]).append(" ");
                            matorno[i]=true;
                        }
                    }
                }
            }

            System.out.println(temporarySentence + " " + count);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task4(){

        try(ObjectOutputStream ou = new ObjectOutputStream(new FileOutputStream("carSeriazsaa.dat"))) {
            CarSerializable car = new CarSerializable("AUDI",250,45000);
            ou.writeObject(car);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("carSeriazsaa.dat"))) {
            CarSerializable car = (CarSerializable) oi.readObject();
            System.out.println(car.getBrand() + " " + car.getCoast() + " " + car.getSpeed());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        ;


    }
}
