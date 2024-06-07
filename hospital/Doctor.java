//package hospitalOOP;

public class Doctor extends Person {
    private boolean isSurgeon;

    public Doctor(String name, double salary, boolean isSurgeon) {
        super(name, salary);
        this.isSurgeon = isSurgeon;
    }

    public boolean isSurgeon() {
        return isSurgeon;
    }

}
