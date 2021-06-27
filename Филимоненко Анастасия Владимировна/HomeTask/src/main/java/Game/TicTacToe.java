package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe extends JComponent {
    public static final int EMPTY_FIELD=0;
    public static final int X_FIELD=10;
    public static final int O_FIELD=200;
    int[][] field;
    boolean isXturn;
    public TicTacToe() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field= new int[3][3];
        initGame();
    }

    private void initGame() {
        for (int i=0; i<3; ++i){
            for (int j=0; j<3; ++j){
                field[i][j]= EMPTY_FIELD;
            }
        }
        isXturn=true;
    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent){
        super.processMouseEvent(mouseEvent);
        int getButton;
        if(MouseEvent.getButton() == MouseEvent.BUTTON1){
            int x = mouseEvent.getX();
            int y = mouseEvent.getY();
            int i = (int) ((float) x / getWidth() * 3);
            int j = (int) ((float) y / getHeight() * 3);
            if (field[i][j]) == EMPTY_FIELD) {
    field[i][j] = isXturn?X_FIELD:O_FIELD;
    isXturn =!isXturn;
    repaint();
            }
        }
    }
    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        drawGrid(graphics);
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

}
