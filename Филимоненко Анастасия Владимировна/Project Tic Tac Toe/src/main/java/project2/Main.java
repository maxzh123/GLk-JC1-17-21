package project2;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        // Если указан ключ "gui" => графический интерфейс
        boolean gui = false;
        for (String s : args)
            if (s.equals("gui")) {
                gui = true;
            }
        GameView gameView = new ConsoleView(game);
        GameView gameView2 = (GameView) new SwingView(game);
        while (!game.isOver()) {
            try {
                Move move = gameView.inputMove();
                game.move(move);
            } catch (UserException e) {
                gameView.reportError(e);
            }
        }
    }
}
