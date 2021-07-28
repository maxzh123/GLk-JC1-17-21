package Game;

public class Controller {
    private final Model model;
    private Amount Turn=Amount.X;
    public Controller(Model model) {
        this.model=model;
    }

    public void doStep(int i, int j) throws Exception {
        model.doStep(i, j,Turn);
        if (Turn==Amount.X){Turn=Amount.O;}else{Turn=Amount.X;}
    }

    public void newGame() throws Exception {
        model.newGame();
    }

    public Amount getTurn() {
        return Turn;
    }
}
