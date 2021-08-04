import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JComponent implements KeyListener, ActionListener, MouseListener, MouseMotionListener {
    int x,y,z;

    boolean bBeginDrag = false;
    public int oldX, oldY;
    static MonitorCord pointZero = new MonitorCord(512,400);
    Coordinates3d point3d;
    MonitorCord point, tempPoint;
    double scaleX=1, scaleY=1;
    int waveLength=40, amplitude=30;
    int gridSize = 10;
    public static final double PI=3.1415926;
    public static double angleVisionAlfa=PI/4, angleVisionBeta=PI/3;
    public static ArrayList<AxesLines> axesLinesArrayList;

    static class MonitorCord {
        int monitorX, monitorY;
        public MonitorCord(int x, int y){
            monitorX = x;
            monitorY = y;
        }
    }
    static class line2d {
        MonitorCord start, end;
        public line2d(MonitorCord start, MonitorCord end){
            this.start = start;
            this.end = end;
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

    public static void main(String[] args) {
        PrintInstruction();
        axesLinesArrayList = AxesLines.AxesLines();
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
        DrawGrid(gr, 400, gridSize);
    }

    public void InformationOut(Graphics gr) {
        gr.drawString("Функция Z = sin R (R = sqr(x2+y2))", 20, 20);
        gr.drawString("Амплитуда: " + amplitude, 20, 50);
        gr.drawString("Длина волны: " + waveLength, 20, 80);
    }

    public void XYZaxes(Graphics gr){
        ArrayList<line2d> linesArray = new ArrayList<>();
        axesLinesArrayList.forEach(x -> linesArray.add(new line2d(
                (Convert(x.startPoint)),
                (Convert(x.endPoint)))));
        gr.setColor(Color.RED);
        linesArray.forEach(x -> gr.drawLine(
                x.start.monitorX,x.start.monitorY,x.end.monitorX,x.end.monitorY));
        point = Convert(new Coordinates3d(295, -5, 0));
        gr.drawString("X", point.monitorX - 20, point.monitorY + 20);
        point = Convert(new Coordinates3d(-5, 295, 0));
        gr.drawString("Y", point.monitorX - 20, point.monitorY + 20);
        point = Convert(new Coordinates3d(-5, 0, 295));
        gr.drawString("Z", point.monitorX - 20, point.monitorY + 20);
        gr.setColor(Color.black);
    }

    public void DrawGrid(Graphics gr, int size, int gridSize) {
        for (int x = -size/2; x <= size/2; x += gridSize) {
            int y= -size/2;
            point3d = new Coordinates3d(x, y,Function(x,y));
            tempPoint = point = Convert(point3d);
            for (y = -size/2; y <= size/2; y += gridSize) {
                z= Function(x,y);
                point3d = new Coordinates3d(x, y, z);
                point = Convert(point3d);
                gr.drawLine(tempPoint.monitorX, tempPoint.monitorY, point.monitorX, point.monitorY);
                tempPoint = point;
            }
        }
        for (int y = -size/2; y <= size/2; y += gridSize) {
            x= -size/2;
            point3d = new Coordinates3d(x, y, Function(x,y));
            tempPoint = point = Convert(point3d);
            for (int x = -size/2; x <= size/2; x += gridSize) {
                z= Function(x,y);
                point3d = new Coordinates3d(x, y, z);
                point = Convert(point3d);
                gr.drawLine(tempPoint.monitorX, tempPoint.monitorY, point.monitorX, point.monitorY);
                tempPoint = point;
            }
        }
    }

    public int Function(int x, int y) {
        double r = Math.sqrt(x * x + y * y)/ waveLength;
        z=  (int) (((Math.sin(r)) * amplitude)*(10/(r+2)));
        return z;
    }

    public static void PrintInstruction(){
        System.out.println("Привет. Немного математики)) ");
        System.out.println("Стрелки - вращение модели. Можно также использовать мышь.");
        System.out.println("Изменение размера сетки +/- Numpad 8/2 ");
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
            if (waveLength > 5) waveLength -=1;
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            if (gridSize<200) gridSize +=1;
        }if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            if(gridSize>4)gridSize -=1;
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
