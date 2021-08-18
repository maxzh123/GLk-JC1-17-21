package project2;

public interface GameView {
    /**
     * Ввод хода
     *
     * @return Ход игрока
     */
    Move inputMove();

    void reportError(UserException e);
}
