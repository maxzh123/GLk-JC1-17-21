package XYZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JComponent implements KeyListener, ActionListener, MouseListener, MouseMotionListener {
    int x,y,z;

    boolean bBeginDrag = false;
    public int oldX, oldY;
    static MonitorCord pointZero = new MonitorCord(512,400);
    Coordinates3d point3d;
    MonitorCord point, tempPoint, pointStart;
    double scaleX=1, scaleY=1;
    int waveLength=40, amplitude=30;

    static class MonitorCord {
        int monitorX, monitorY;
        public MonitorCord(int x, int y){
            monitorX = x;
            monitorY = y;
        }
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
        PrintInstruction();
        Main t = new Main();
        JFrame f = new JFrame("Rotating Cube test");
        f.setSize(1024, 768);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.addMouseListener(t);
        f.addMouseMotionListener(t);
        f.add(new Main());
        f.add(t);
        f.setVisible(true);
    }

    public void paint(Graphics gr) {
        ((Graphics2D) gr).scale(scaleX, scaleY);
        InformationOut(gr);
        XYZaxes(gr);
        Function(gr);
    }

    public void InformationOut(Graphics gr) {
        gr.drawString("Функция Z = sin R (R = sqr(x2+y2))", 20, 20);
        gr.drawString("Амплитуда: " + amplitude, 20, 50);
        gr.drawString("Длина волны: " + waveLength, 20, 80);
    }

    public void XYZaxes(Graphics gr){
        Coordinates3d point3d = new Coordinates3d(300, 0, 0);
        point = Convert(point3d);
        pointStart = point;
        gr.setColor(Color.RED);
        gr.drawLine(pointZero.monitorX, pointZero.monitorY, point.monitorX, point.monitorY);
        point = Convert(new Coordinates3d(295, 5, 0));
        gr.drawLine(pointStart.monitorX, pointStart.monitorY, point.monitorX, point.monitorY);
        point = Convert(new Coordinates3d(295, -5, 0));
        gr.drawLine(pointStart.monitorX, pointStart.monitorY, point.monitorX, point.monitorY);
        gr.drawString("X", point.monitorX - 20, point.monitorY + 20);
        point = Convert(new Coordinates3d(0, 300, 0));
        pointStart = point;
        gr.drawLine(pointZero.monitorX, pointZero.monitorY, point.monitorX, point.monitorY);
        point = Convert(new Coordinates3d(5, 295, 0));
        gr.drawLine(pointStart.monitorX, pointStart.monitorY, point.monitorX, point.monitorY);
        point = Convert(new Coordinates3d(-5, 295, 0));
        gr.drawLine(pointStart.monitorX, pointStart.monitorY, point.monitorX, point.monitorY);
        gr.drawString("Y", point.monitorX - 20, point.monitorY + 20);
        point = Convert(new Coordinates3d(0, 0, 300));
        gr.drawLine(pointZero.monitorX, pointZero.monitorY, point.monitorX, point.monitorY);
        pointStart = point;
        point = Convert(new Coordinates3d(5, 0, 295));
        gr.drawLine(pointStart.monitorX, pointStart.monitorY, point.monitorX, point.monitorY);
        point = Convert(new Coordinates3d(-5, 0, 295));
        gr.drawLine(pointStart.monitorX, pointStart.monitorY, point.monitorX, point.monitorY);
        gr.drawString("Z", point.monitorX - 20, point.monitorY + 20);
        gr.setColor(Color.black);
    }

    public void Function(Graphics gr) {
        for (int x = -200; x <= 200; x += 10) {
            point3d = new Coordinates3d(x, -200, (int) (Math.sin(Math.sqrt(x * x + 200 * 200) / waveLength) * amplitude));
            tempPoint = point = Convert(point3d);
            for (int y = -200; y <= 200; y += 10) {
                z = (int) (Math.sin(Math.sqrt(x * x + y * y) / waveLength) * amplitude);
                point3d = new Coordinates3d(x, y, z);
                point = Convert(point3d);
                gr.drawLine(tempPoint.monitorX, tempPoint.monitorY, point.monitorX, point.monitorY);
                tempPoint = point;
            }
        }
        for (int y = -200; y <= 200; y += 10) {
            point3d = new Coordinates3d(-200, y, (int) (Math.sin(Math.sqrt(y * y + 200 * 200) / waveLength) * amplitude));
            tempPoint = point = Convert(point3d);
            for (int x = -200; x <= 200; x += 10) {
                z = (int) (Math.sin(Math.sqrt(x * x + y * y) / waveLength) * amplitude);
                point3d = new Coordinates3d(x, y, z);
                point = Convert(point3d);
                gr.drawLine(tempPoint.monitorX, tempPoint.monitorY, point.monitorX, point.monitorY);
                tempPoint = point;
            }
        }
    }

    public static void PrintInstruction(){
        System.out.println("Привет. Немного математики)) ");
        System.out.println("Стрелки - вращение модели. Можно также использовать мышь.");
        System.out.println("Изменение амплитуды +/- Numpad 1/7 ");
        System.out.println("Изменение длины волны +/- Numpad 3/9");
        System.out.println("Изменение масштаба +/- PAGE UP/PAGE DOWN");
        System.out.println("Развлекайтесь.");
    }

    public static MonitorCord Convert(Coordinates3d coordinate) {
        double xDx, xDy, yDx, yDy, zDx, zDy;
        MonitorCord monitorCord = new MonitorCord(0, 0);
        xDx = (Math.sin(angleVisionAlfa) * coordinate.x);
        xDy = (Math.cos(angleVisionAlfa) * (Math.sin(angleVisionBeta)) * coordinate.x);
        yDx = -(Math.cos(angleVisionAlfa) * coordinate.y);
        yDy = (Math.sin(angleVisionAlfa) * (Math.sin(angleVisionBeta)) * coordinate.y);
        zDx = 0;
        zDy = -(Math.cos(angleVisionBeta) * coordinate.z);
        monitorCord.monitorX = -(int) (xDx + yDx + zDx);
        monitorCord.monitorY = (int) (xDy + yDy + zDy);
        monitorCord.monitorX = CorrectXToZero(monitorCord.monitorX);
        monitorCord.monitorY = CorrectYToZero(monitorCord.monitorY);
        return monitorCord;
    }

    public static int CorrectXToZero(int x) {
        return x += pointZero.monitorX;
    }

    public static int CorrectYToZero(int y) {
        return y += pointZero.monitorY;
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
        if (e.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            scaleX += 0.1;
            scaleY +=0.1;
        }
        if (e.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            scaleX -= 0.1;
            scaleY -=0.1;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            amplitude -= 1;
            }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            amplitude += 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            waveLength +=1;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            waveLength -=1;
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
            angleVisionAlfa += (dX / 1200);
            angleVisionBeta += (dY / 1200);
            repaint();
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
