public class Player extends Game{
    // экземпляр нашего поля
    Field gameField;
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
        gameField = Field.getInstance();
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
        gameField = Field.getInstance();
        return gameField.checkWin(this.sign);
    }
}
