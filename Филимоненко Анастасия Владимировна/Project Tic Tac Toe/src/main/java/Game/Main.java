package Game;

public class Main {
    public static void main(String[] args){
        Model model=new Model();
        Controller controller=new Controller(model);
        System.out.println("Начать игру...");
        View view=new View(model,controller);
        view.redraw();
        System.out.println("Завершить игру...");
    }
}
