package Game;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        Model model=new Model();
        Controller controller=new Controller(model);
        View view=new View(model,controller);
        System.out.println("Начать игру...");
        System.out.println("Завершить игру...");
    }
}
