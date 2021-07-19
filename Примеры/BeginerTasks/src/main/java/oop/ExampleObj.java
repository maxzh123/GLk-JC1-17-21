package oop;

import java.io.Serializable;
import java.util.Objects;

public class ExampleObj implements if1,if2, Serializable,Comparable<ExampleObj> {
    private final int val;
    private final String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleObj that = (ExampleObj) o;
        return val == that.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }


    public ExampleObj(int val,String name) {
        this.val = val;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Наш супер "+name+" №"+val;
    }


    @Override
    public int getRate() {
        return 0;
    }

    @Override
    public int compareTo(ExampleObj o) {
        int res=-name.compareTo(o.name);
        if (res!=0) return res;
        return -Integer.compare(this.val,o.val);
    }
}
