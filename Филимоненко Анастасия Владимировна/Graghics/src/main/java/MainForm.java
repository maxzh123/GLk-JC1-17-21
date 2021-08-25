import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    public MainForm()
    {
        // Заголовок формы
        setTitle("XO game GUI");
        // Границы формы
        setBounds(300, 300, 455, 525);
        setResizable(false);
        // При закрытии - форма и программа закрываются
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Создаём экземпляр нашего игрового поля
        MainGameField gameField = MainGameField.getInstance();
        // Создаём панель для кнопок
        JPanel buttonPanel = new JPanel(new GridLayout());
        // Добавляем игровок поле в центр нашей формы
        add(gameField, BorderLayout.CENTER);
        // Панель для кнопок добавляем вниз формы
        add(buttonPanel, BorderLayout.SOUTH);
        JButton btnStart = new JButton("New game");
        JButton btnEnd = new JButton("Exit");
        buttonPanel.add(btnStart);
        buttonPanel.add(btnEnd);
        // Добавляем обработчик событий для закрытия формы
        btnEnd.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        // Добавляем обработчик событий для создания новой игры
        btnStart.addActionListener(new ActionListener()
        {
            @Override

            public void actionPerformed(ActionEvent e)
            {
                System.out.println(btnStart.getText());
                // Загружаем новую форму (с настройками игры)
                GameSettingsForm gameSettingsForm = new GameSettingsForm();
            }
        });
        // Показываем форму
        setVisible(true);
    }
}
