package files.serializable;

import java.io.Serializable;

public class TestObject implements Serializable {

    private String name;
    private int number;

    public TestObject() {
    }

    public TestObject(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
