package staffmanagement;

public class HR extends Employee {

    private double experience;
    private String certificate;

    public HR(int emp_no, String name, String gender, int age, String dept,
            double salary, double experience, String certificate) {

        super(emp_no, name, gender, age, dept, salary);
        this.experience = experience;
        this.certificate = certificate;

    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String toString() {
        return super.toString() + ", Experience = " + experience + ", Certificate = " + certificate + ", Salary = " + salary;
    }

    @Override
    public void workRoleDetails() {
        System.out.println(" Works as HR to manage recruitments");
    }

}
