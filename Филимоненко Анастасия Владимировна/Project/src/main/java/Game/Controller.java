package Game;

public class Controller {
    private final Model model;
    private Amount сейчасХодит=Amount.Крестик;
    public Controller(Model model) {
        this.model=model;
    }

    public void doStep(int i, int j) throws Exception {
        model.doStep(i, j,сейчасХодит);
        if (сейчасХодит==Amount.Крестик){сейчасХодит=Amount.Нолик;}else{сейчасХодит=Amount.Крестик;}
    }

    public void newGame() throws Exception {
        model.newGame();
    }

    public Amount getСейчасХодит() {
        return сейчасХодит;
    }

}
