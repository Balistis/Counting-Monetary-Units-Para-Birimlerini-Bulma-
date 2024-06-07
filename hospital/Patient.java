//package hospitalOOP;
public class Patient {
    private String name;
    private int examinations;
    private int surgeries;

    public Patient(String name) {
        this.name = name;
        this.examinations = 0;
        this.surgeries = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExaminations() {
        return examinations;
    }

    public void setExaminations() {
        if (examinations < 36)
            examinations++;
    }

    public int getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(int surgeries) {
        if (surgeries < 1)
            surgeries++;
    }
}
