public class Player extends AGamer{
    // экземпляр нашего поля
    MainGameField gameField;
    // готовность к стрельбе, если = 0
    // то ходит другой игрок
    int isShotReady = 1;

    // Конструктор
    public Player(String sign)
    {
        this.sign = sign;
    }

    // Выстрел игрока
    boolean shot(int x, int y)
    {
        gameField = MainGameField.getInstance();
        if (!gameField.isCellBusy(x, y))
        {
            gameField.cell[x][y] = sign;
            return true;
        }
        return false;
    }
    // Проверка победы
    boolean win()
    {
        gameField = MainGameField.getInstance();
        return gameField.checkWin(this.sign);
    }
}
