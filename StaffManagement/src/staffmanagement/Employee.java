package staffmanagement;

//Parent Class
public abstract class Employee {

    int emp_no;
    String name;
    String gender;
    int age;
    String role;
    double salary;

    static int idCounter = 1;

    public Employee(int emp_no,String name, String gender, int age,
            String dept, double salary) {
        
        this.emp_no = idCounter++;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.role = dept;
        this.salary = salary;
    }

    public abstract void workRoleDetails();

    public int getEmp_no() {
        return emp_no;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String dept) {
        this.role = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp_no= " + emp_no + ", Name= " + name + ", Gender= " + gender + ", Age= " + age + ", Role = " + role;
    }

}
