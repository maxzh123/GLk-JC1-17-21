package Game.mvc;

import Game.Значение;

public class Controller {
    private final Model model;
    private Значение сейчасХодит=Значение.Крестик;
    public Controller(Model model) {
        this.model=model;
    }

    public void doStep(int i, int j) throws Exception {
         model.doStep(i, j,сейчасХодит);
         if (сейчасХодит==Значение.Крестик){сейчасХодит=Значение.Нолик;}else{сейчасХодит=Значение.Крестик;}
    }

    public void newGame() throws Exception {
        model.newGame();
    }

    public Значение getСейчасХодит() {
        return сейчасХодит;
    }

}
