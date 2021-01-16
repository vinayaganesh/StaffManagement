package staffmanagement;

public class HouseKeeping extends Employee {

    public HouseKeeping(int emp_no, String name, String gender, int age,
            String role, double salary) {
        super(emp_no, name, gender, age, role, salary);

    }

    @Override
    public String toString() {
        return super.toString() + ", Salary = " + salary;
    }

    @Override
    public void workRoleDetails() {
        System.out.println(" Works as for the Company");

    }

}
