package ConclusionOfTheNumberInWords;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Runner {
    //сюда добавила Таск 69
    //создала логгер, вывожу сведения об ошибках, плюс о старте и завершении программы

    public static final Logger logger = Logger.getLogger(
            Runner.class.getName());
     static Scanner scanner=new Scanner(System.in);
     private static final String [] units={"ноль", "один","два","три","четыре","пять","шесть","семь","восемь","девять"};
    private static final String []dozens={"двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдесят","восемьдесят","девяносто"};
    private static final String [] hundreds={"сто", "двести","триста","четыреста","пятьсот","шестьсот","семьсот","восемьсот","девятьсот"};
    private static final String [] teens={"десять", "одиннадцать", "двеннадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"};

    public static void main(String[] args)  {
        FileHandler fh;
        try {
            fh = new FileHandler("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\ConclusionOfTheNumberInWords\\MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.setUseParentHandlers(false);
        } catch (SecurityException e) {
            logger.log(Level.SEVERE, "Ошибка", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка", e);
        }

        logger.log(Level.INFO,"Программа стартовала");
        System.out.println("Введите число до 999");
        try {
            int number=scanner.nextInt();
            determineTheNumber(number);
            if ( number>=999) {
            }
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            logger.log(Level.SEVERE, "Пользователь ввел число выходящее за рамки или пользователь ввел не число", e);
        }
        logger.log(Level.INFO,"Программа закончена");
    }

    private static void determineTheNumber(int number) {
        if (number<10 )  {
            chooseUnits(number);
        } if (number>=10 && number<20) {
           chooseTeens(number);
        } if (number>=20 && number<=99) {
            chooseDozens(number);
        } if (number>=100) {
            chooseHundreds(number);
        }
    }

    private static void chooseUnits(int number) {
            System.out.println(units[number]); }

    private static void chooseTeens(int number) {
        System.out.println(teens[number-10]); }

    private static void chooseDozens(int number) {
        int temp1=number%10;
        int temp=number/10;
        if(temp1==0) {
            System.out.println(dozens[temp-2]);
        } else {
            System.out.println(dozens[temp-2]+" "+units[temp1]);
        }
    }

    private static void chooseHundreds(int number) {
        int temp1=number%100;
        int temp=number/100;
        if (temp1==0) { System.out.println(hundreds[temp - 1]);
         }
        if (temp1>19){
            System.out.print(hundreds[temp - 1]+" ");
           chooseDozens(temp1);
        } if (temp1<=19 && temp1>10) {
            System.out.print(hundreds[temp - 1]+" ");
            chooseTeens(temp1);
        } if (temp1<=10 && temp1>0){
            System.out.print(hundreds[temp - 1]+" ");
            chooseUnits(temp1);
        }
}
}




