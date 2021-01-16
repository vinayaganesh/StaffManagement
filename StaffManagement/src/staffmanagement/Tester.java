package staffmanagement;

public class Tester extends Employee {

    private double experience;
    private String certificate;

    public Tester(int emp_no, String name, String gender, int age,
            String role, double salary, double experience, String certificate) {
        
        super(emp_no, name, gender, age, role, salary);
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

    public void setCertificate(String Certificate) {
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Experience = " + experience + ", Certificate = " + certificate + ", Salary = " + salary;
    }

    @Override
    public void workRoleDetails() {
        System.out.println(" Works as Tester to test Software");
    }

}
