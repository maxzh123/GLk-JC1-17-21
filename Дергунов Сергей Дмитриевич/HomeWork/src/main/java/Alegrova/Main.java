package Alegrova;

public class Main {

    public static void main(String[] args) {
	Human Serj = new YoungBoy();
    Serj.grade = new MladshiyLeitenant();
    Human Natali = new Human();
    Human Maxim = new Boy();
    Entertainment ent = new Dance();
        System.out.println(Serj.DoIt(ent, Natali));
       // System.out.println(Maxim.DoIt(ent, Natali));
    }
}
