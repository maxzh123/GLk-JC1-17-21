package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe<diag, diag1> extends JComponent {
    private final Model model;
    private final Controller controller;
    private View view = null;

    public TicTacToe(Model model, Controller controller) {
        this.model=model;
        this.controller=controller;
        this.view=view;
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }
    @Override
    protected void processMouseEvent(MouseEvent mouseEvent){
        super.processMouseEvent(mouseEvent);
        if(mouseEvent.getButton() == MouseEvent.BUTTON1){
            int x = mouseEvent.getX();
            int y = mouseEvent.getY();
            int i = (int) ((float) x / getWidth() * 3);
            int j = (int) ((float) y / getHeight() * 3);
            try {
                controller.doStep(i,j);
                view.setTitle("Сейчас ходит:"+controller.getСейчасХодит());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(),"Беда!", JOptionPane.ERROR_MESSAGE);
            }
            redraw();
            Amount win=model.getWinner();
            if (win!=Amount.Пусто){
                JOptionPane.showMessageDialog(this, "Выиграли "+win+"!","Победа!", JOptionPane.INFORMATION_MESSAGE);
            }else if (!model.hasEmptyFields()){
                JOptionPane.showMessageDialog(this, "Ничья!","Ничья!", JOptionPane.INFORMATION_MESSAGE);
            }
            //TODO Получать из модели где победа и рисовать.
            //TODO Сделать кнопку новая игра.
        }
    }


    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.clearRect(0, 0, getWidth(), getHeight());
        drawGrid(graphics);
        drawXO(graphics);
    }

    private void drawXO(Graphics graphics) {
        //TODO Рисовать крестики и нолики
        model.getField();
    }

    void drawGrid(Graphics graphics){
        int w= getWidth();
        int h= getHeight();
        int dw = w/3;
        int dh = h/3;
        graphics.setColor(Color.BLACK);
        for (int i=1; i<3; i++){
            graphics.drawLine(0, dh*i, w, dh*i);
            graphics.drawLine(dw*i, 0, dw*i, h);
        }
    }

    public void redraw() {
        //TODO Тут вы перерисовываете поле. Вся информация есть. Включая кто победил.
        repaint();
    }
}
