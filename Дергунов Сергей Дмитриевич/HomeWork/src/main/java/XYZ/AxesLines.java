package XYZ;


import java.util.ArrayList;
//Пользовать чужой внутренний класс это адова порнография
public class AxesLines {
    final static Main.Coordinates3d zeroPoint3d = new Main.Coordinates3d(0, 0, 0);
    public static ArrayList<AxesLines> Axes = new ArrayList<>();
    Main.Coordinates3d startPoint, endPoint;

    private AxesLines(Main.Coordinates3d startPoint, Main.Coordinates3d endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    static ArrayList<AxesLines> AxesLines() {
        Axes.add(new AxesLines(zeroPoint3d, new Main.Coordinates3d(300, 0, 0)));
        Axes.add(new AxesLines(new Main.Coordinates3d(300, 0, 0), new Main.Coordinates3d(295,5,0)));
        Axes.add(new AxesLines(new Main.Coordinates3d(300, 0, 0), new Main.Coordinates3d(295,-5,0)));
        Axes.add(new AxesLines(zeroPoint3d, new Main.Coordinates3d(0, 300, 0)));
        Axes.add(new AxesLines(new Main.Coordinates3d(0, 300, 0), new Main.Coordinates3d(5,295,0)));
        Axes.add(new AxesLines(new Main.Coordinates3d(0, 300, 0), new Main.Coordinates3d(-5,295,0)));
        Axes.add(new AxesLines(zeroPoint3d, new Main.Coordinates3d(0, 0, 300)));
        Axes.add(new AxesLines(new Main.Coordinates3d(0, 0, 300), new Main.Coordinates3d(5,0,295)));
        Axes.add(new AxesLines(new Main.Coordinates3d(0, 0, 300), new Main.Coordinates3d(-5,0,295)));
        return Axes;
    }
}
