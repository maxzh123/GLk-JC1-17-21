package Task38;

import java.util.ArrayList;
import java.util.List;

public class Garage <T extends Vehicle>{

    private List<T> transports=new ArrayList<T>();

    void addTransport(T... transport) {
        if (transport != null && transport.length > 0) {
            for (T v : transport) {
                transports.add(v);
            }
        }
    }
    @Override
    public String toString() {
        return String.valueOf(transports);
    }
}
