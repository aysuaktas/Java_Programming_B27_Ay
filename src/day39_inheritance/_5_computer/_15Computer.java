package day39_inheritance._5_computer;

public class _15Computer {

    String os;
    int memory;

    // create constructor: (automatically yaptik right click -> Generate uzerinden):
    public _15Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }


    // create toString() method: (automatically yaptik right click -> Generate uzerinden):
    @Override
    public String toString() {
        return "_15Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
