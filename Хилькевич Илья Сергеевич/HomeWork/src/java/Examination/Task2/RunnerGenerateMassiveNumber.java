package Examination.Task2;



public class RunnerGenerateMassiveNumber {
    public static void main(String[] args) {
        GenerateMassiveNumber generate=new GenerateMassiveNumber();
        generate. arrayNumber = new int[10];
        generate.createArray();
        generate.findMinElement();
        generate.findMaxElement();
        generate.shakeNumberElement();


    }
}
