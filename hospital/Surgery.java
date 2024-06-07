//package hospitalOOP;
import java.util.List;

public class Surgery {
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private int materialCount;
    private double materialCost;
    private static final int maxSurgeryNurse= 5; //ameliyata girebilecek max hemşire sayısı
    private static final int minSurgeryDoctor= 1; //ameliyata girebilecek min doktor sayısı


    public Surgery(List<Doctor> doctors, List<Nurse> nurses, int materialCount, double materialCost) {
        if(doctors.size() < minSurgeryDoctor)
            throw new IllegalArgumentException("Ameliyatta en az 1 doktor olmalı");
        else
            this.doctors = doctors;

        if(nurses.size() > maxSurgeryNurse)
            throw new IllegalArgumentException("Ameliyatlarda 5ten fazla hemşire giremez");
        else
            this.nurses = nurses;

        this.materialCost = materialCost;
        this.materialCount = materialCount;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public double getCost() {
        double doctorSalary = 0;
        for (Doctor doctor : doctors) {
            doctorSalary += doctor.getSalary();
        }
        return (materialCount * materialCost) + doctorSalary;
    }
}
