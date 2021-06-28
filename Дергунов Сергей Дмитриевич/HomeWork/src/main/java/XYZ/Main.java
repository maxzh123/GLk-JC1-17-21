package XYZ;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;

public class Main extends JComponent implements KeyListener, ActionListener, MouseListener, MouseMotionListener {
    int x,y,z;

    boolean bBeginDrag = false;
    public int oldX, oldY;


    static class MonitorCord {
        int monitorX, monitorY;
    }

    static class Coordinates3d {
        int x, y, z;

        public Coordinates3d(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    public static final double PI=3.1415926;
    public static double angleVisionAlfa=PI/4, angleVisionBeta=PI/3;

    public static void main(String[] args) {
        Main t = new Main();
        JFrame f = new JFrame("Rotating Cube test");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.addMouseListener(t);
        f.addMouseMotionListener(t);
        f.add(new Main());
        f.add(t);
        f.setVisible(true);
    }

    public void paint(Graphics gr) {
        Graphics2D graphic = (Graphics2D) gr;
        MonitorCord point, pointZero;
        pointZero = new MonitorCord();
        pointZero.monitorX = 300;
        pointZero.monitorY=300;
        Coordinates3d point3d = new Coordinates3d(200, 0, 0);
        point = Convert(point3d);
        gr.drawLine(pointZero.monitorX, pointZero.monitorY,
                pointZero.monitorX + point.monitorX,
                pointZero.monitorY + point.monitorY);
        gr.drawString("X",
                pointZero.monitorX +point.monitorX-20,
                pointZero.monitorY+point.monitorY+20);
        point3d = new Coordinates3d(0, 200, 0);
        point = Convert(point3d);
        gr.drawLine(pointZero.monitorX,pointZero.monitorY,
                pointZero.monitorX + point.monitorX,
                pointZero.monitorY + point.monitorY);
        gr.drawString("Y",
                pointZero.monitorX +point.monitorX-20,
                pointZero.monitorY+point.monitorY+20);
        point3d = new Coordinates3d(0, 0, 200);
        point = Convert(point3d);
        gr.drawLine(pointZero.monitorX, pointZero.monitorY,
                pointZero.monitorX + point.monitorX,
                pointZero.monitorY + point.monitorY);
        gr.drawString("Z",
                pointZero.monitorX +point.monitorX-20,
                pointZero.monitorY+point.monitorY+20);
    }

    public static MonitorCord Convert(Coordinates3d coordinate) {
        double xDx, xDy, yDx, yDy, zDx, zDy;
        MonitorCord monitorCord = new MonitorCord();
        xDx = (Math.sin(angleVisionAlfa) * coordinate.x);
        xDy = (Math.cos(angleVisionAlfa) * (Math.sin(angleVisionBeta)) * coordinate.x);
        yDx = -(Math.cos(angleVisionAlfa) * coordinate.y);
        yDy = (Math.sin(angleVisionAlfa) * (Math.sin(angleVisionBeta)) * coordinate.y);
        zDx = 0;
        zDy = -(Math.cos(angleVisionBeta) * coordinate.z);
        monitorCord.monitorX = -(int) (xDx + yDx + zDx);
        monitorCord.monitorY = (int) (xDy + yDy + zDy);
        return monitorCord;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            angleVisionAlfa -= PI / 24;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            angleVisionAlfa += PI / 24;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            angleVisionBeta += PI / 24;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            angleVisionBeta -= PI / 24;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        bBeginDrag = true;
        oldX= e.getX();
        oldY=e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        bBeginDrag = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int newX, newY;
        double dX = 0, dY=0;
        if (bBeginDrag) {
            newX = e.getX();
            newY = e.getY();
            dX -= newX - oldX;
            dY -= newY- oldY;
            angleVisionAlfa += (dX / 600);
            angleVisionBeta += (dY / 600);
            repaint();
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
