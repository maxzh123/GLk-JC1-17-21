import java.util.Random;

public class AI extends AGamer{
    // Экземпляр игрового поля
    MainGameField gameField;
    String playerSign = "";
    // Уровень интеллекта
    static int aiLevel = 0;

    // Конструктор
    public AI(String sign, int aiLevel, String playerSign)
    {
        this.sign = sign;
        this.playerSign = playerSign;
        this.aiLevel = aiLevel;
    }

    // Выстрел компьютера
    boolean shot(int x, int y)
    {
        gameField = MainGameField.getInstance();
        x = -1;
        y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        // Находим выигрышный ход
        if (aiLevel == 2)
        {
            for (int i = 0; i < gameField.linesCount; i++)
            {
                for (int j = 0; j < gameField.linesCount; j++)
                {
                    if (!gameField.isCellBusy(i, j))
                    {
                        gameField.cell[i][j] = sign;
                        if (gameField.checkWin(sign))
                        {
                            x = i;
                            y = j;
                            ai_win = true;
                        }
                        gameField.cell[i][j] = gameField.NOT_SIGN;
                    }
                }
            }
        }
        // Блокировка хода пользователя, если он побеждает на следующем ходу
        if (aiLevel > 0)
        {
            if (!ai_win)
            {
                for (int i = 0; i < gameField.linesCount; i++)
                {
                    for (int j = 0; j < gameField.linesCount; j++)
                    {
                        if (!gameField.isCellBusy(i, j))
                        {
                            gameField.cell[i][j] = this.playerSign;
                            if (gameField.checkWin(this.playerSign))
                            {
                                x = i;
                                y = j;
                                user_win = true;
                            }
                            gameField.cell[i][j] = gameField.NOT_SIGN;
                        }
                    }
                }
            }
        }
        if (!ai_win && !user_win)
        {
            do
            {
                Random rnd = new Random();
                x = rnd.nextInt(gameField.linesCount);
                y = rnd.nextInt(gameField.linesCount);
            }
            while (gameField.isCellBusy(x, y));
        }
        gameField.cell[x][y] = sign;
        return true;
    }

    boolean win()
    {
        gameField = MainGameField.getInstance();
        return gameField.checkWin(this.sign);
    }
}
