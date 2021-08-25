package Game.mvc;

//import Game.TicTacToe;
// Видимо уехало из проекта.
import javax.swing.*;
import java.awt.*;
//Не работает и работать не будет.
public class View {
//    private final TicTacToe game;
    JFrame window= new JFrame("TicTacToe");

    public View(Model model,Controller controller) {
//        game= new TicTacToe(model,controller,this);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
//        window.add(game);
        window.setVisible(true);
        model.newGame();
//        game.redraw();
        setTitle("Сейчас ходит:"+controller.getСейчасХодит());
    }

    public void redraw(){
  //      game.redraw();

        window.repaint();
    }

    public void setTitle(String s) {
        window.setTitle(s);redraw();
    }
}
