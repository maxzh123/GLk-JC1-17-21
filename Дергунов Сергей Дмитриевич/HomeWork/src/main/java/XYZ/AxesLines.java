package XYZ;

import XYZ.Main.Coordinates3d;

import java.util.ArrayList;

public class AxesLines {
    final static Coordinates3d zeroPoint3d = new Coordinates3d(0, 0, 0);
    public static ArrayList<AxesLines> Axes = new ArrayList<>();
    Coordinates3d startPoint, endPoint;

    private AxesLines(Coordinates3d startPoint, Coordinates3d endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    static ArrayList<AxesLines> AxesLines() {
        Axes.add(new AxesLines(zeroPoint3d, new Coordinates3d(300, 0, 0)));
        Axes.add(new AxesLines(new Coordinates3d(300, 0, 0), new Coordinates3d(295,5,0)));
        Axes.add(new AxesLines(new Coordinates3d(300, 0, 0), new Coordinates3d(295,-5,0)));
        Axes.add(new AxesLines(zeroPoint3d, new Coordinates3d(0, 300, 0)));
        Axes.add(new AxesLines(new Coordinates3d(0, 300, 0), new Coordinates3d(5,295,0)));
        Axes.add(new AxesLines(new Coordinates3d(0, 300, 0), new Coordinates3d(-5,295,0)));
        Axes.add(new AxesLines(zeroPoint3d, new Coordinates3d(0, 0, 300)));
        Axes.add(new AxesLines(new Coordinates3d(0, 0, 300), new Coordinates3d(5,0,295)));
        Axes.add(new AxesLines(new Coordinates3d(0, 0, 300), new Coordinates3d(-5,0,295)));
        return Axes;
    }
}
