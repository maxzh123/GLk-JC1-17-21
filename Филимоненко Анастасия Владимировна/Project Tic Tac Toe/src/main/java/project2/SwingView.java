package project2;

import javax.swing.*;

public class SwingView {
    public SwingView(Game game) {
        JFrame frame = new JFrame("Game TicTacToe");
        MainForm mainForm = new MainForm(game);
        frame.setContentPane(mainForm.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Move inputMove() {
        return null;
    }

    public void reportError(UserException e) {
    }
}
