package staffmanagement;

import java.util.*;

public class EmployeeManagement {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Employee> employees = new ArrayList<>();
    public static int type = 0;
    public static boolean add_loop = true;
    public static boolean update_loop = true;
    public static boolean search_loop = true;
    // Each loop for specific MENU

    public static void load() {

        ProjectMgr pm = new ProjectMgr(1, "Sahil ", "M", 38, "Project Manager",
                34000, 5, "certificated");
        employees.add(pm);
        ProjectMgr pm1 = new ProjectMgr(2, "Gargi ", "F", 55, "Project Manager",
                65000, 25, "non-certificated");
        employees.add(pm1);
        ProjectMgr pm2 = new ProjectMgr(3, "Raj ", "M", 43, "Project Manager",
                55000, 10, "certificated");
        employees.add(pm2);
        HR h = new HR(4, "Vinaya", "F", 45, "HR",
                45000, 14, "Certified");
        employees.add(h);
        HR h1 = new HR(5, "Marie", "F", 37, "HR",
                30000, 8, "non-Certified");
        employees.add(h1);
        HR h3 = new HR(6, "John", "M", 27, "HR",
                25000, 3, "non-Certified");
        employees.add(h3);
        HR h4 = new HR(7, "Ryan", "F", 33, "HR",
                40000, 6, "Certified");
        employees.add(h4);

        HouseKeeping hk = new HouseKeeping(8, "Alexa", "F", 22, "House Keeping",
                10000);
        employees.add(hk);

        Tester t = new Tester(9, "John", "M", 45, "Tester",
                28000, 10, "Certified");
        employees.add(t);
        WebDev wd = new WebDev(10, "Ram", "M", 35, "Web Developer",
                25000, 7, "Not Certified");
        employees.add(wd);
    }

    // POLYMORPHISM IMPLEMENTATION 
    public static void whatDoEachEmployeeDo() {
        for (Employee employee : employees) {
            System.out.println();
            System.out.println(employee.getName());
            employee.workRoleDetails();
        }

    }

    public static void displayEmp() {
        System.out.println("Employee Details..");

        for (int i = 0; i < EmployeeManagement.employees.size(); i++) {
            System.out.println(EmployeeManagement.employees.get(i));
        }
    }

    public static void addEmp() {
        do {
            System.out.println("\n  Add an Employee : ");
            System.out.println("1. Tester");
            System.out.println("2. Project Manager");
            System.out.println("3. HR");
            System.out.println("4. Web Developer");
            System.out.println("5. House Keeping");
            System.out.println("0. Exit Add Employee Menu");
            System.out.println("Select a Type ");

            type = sc.nextInt();
            sc.nextLine();
            if (type > 0 && type < 6) {
                createEmp();
            } else {
                add_loop = false;
            }
        } while (add_loop);
    }

    public static void createEmp() {
        double exp = 0;
        String cert = "";
        System.out.println("Enter Employee Details : ");
        int id = 0;

        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Gender : ");
        String gender = sc.nextLine();

        System.out.println("Enter Employee Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        String role = "";

        if (type != 5) {
            System.out.println("Enter Employee Experience : ");
            exp = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Whether Employee is "
                    + "Certified or Not Certified : ");
            cert = sc.nextLine();
        }

        System.out.println("Enter Employee Salary : ");
        double salary = sc.nextDouble();
        sc.nextLine();

        switch (type) {
            case 0:
                add_loop = false;
                break;
            case 1:
                role = "Tester";
                Tester t = new Tester(id, name, gender, age, role, salary, exp, cert);
                employees.add(t);
                break;
            case 2:
                role = "Project Manager";
                ProjectMgr pm = new ProjectMgr(id, name, gender, age, role, salary, exp, cert);
                employees.add(pm);
                break;
            case 3:
                role = "HR";
                HR h = new HR(id, name, gender, age, role, salary, exp, cert);
                employees.add(h);
                break;
            case 4:
                role = "Web Developer";
                WebDev w = new WebDev(id, name, gender, age, role, salary, exp, cert);
                employees.add(w);
                break;
            case 5:
                role = "House Keeping";
                HouseKeeping hk = new HouseKeeping(id, name, gender, age, role, salary);
                employees.add(hk);
                break;
        }

    }

    public static void deleteEmp() {
        displayEmp();

        System.out.println("Enter Employee Number to be Deleted");

        int num = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmp_no() == num) {
                employees.remove(i);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Employee not Found");
        }

    }

    public static void updateEmpDetails() {
        displayEmp();

        System.out.print("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmp_no() == id) {
                System.out.println(employees.get(i));
                found = true;
                do {
                    System.out.println("\nWhat do you want to update? ");
                    System.out.println("\n1.Update Employee Name ");
                    System.out.println("2.Update Employee Age ");
                    System.out.println("3.Update Employee Dept ");
                    System.out.println("4.Update Employee Salary ");
                    System.out.println("0.Exit Update Menu ");

                    int usersChoice = sc.nextInt();
                    sc.nextLine();
                    switch (usersChoice) {

                        case 0:
                            System.out.println("Exiting Update Menu....");
                            update_loop = false;
                            break;
                        case 1:
                            System.out.println("New Employee Name: ");
                            String newName = sc.nextLine();
                            employees.get(i).setName(newName);
                            break;
                        case 2:
                            System.out.print("New Employee Age: ");
                            int newAge = sc.nextInt();
                            sc.nextLine();
                            employees.get(i).setAge(newAge);
                            break;
                        case 3:
                            System.out.print("New Employee Dept: ");
                            String newDept = sc.nextLine();
                            employees.get(i).setRole(newDept);
                            break;
                        case 4:
                            System.out.print("New Employee Salary: ");
                            double newsalary = sc.nextDouble();
                            employees.get(i).setSalary(newsalary);
                            break;
                        default:
                            System.out.println("Invalid Choice..");
                    }

                    System.out.println("Do you want to Continue ?(Y/N) ");
                    String ans = sc.nextLine();
                    if (ans.equalsIgnoreCase("n")) {
                        update_loop = false;

                    } else if (ans.equalsIgnoreCase("y")) {

                    } else {
                        System.out.println("Incorrect Input!");
                    }
                } while (update_loop);

            }
        }
        if (!found) {
            System.out.println("Employee not Found");
        }
    }

    public static void searchEmpDetails() {
        displayEmp();

        do {
            System.out.println("\nWhat do you want to Search? ");
            System.out.println("\n1.Search Employee Name ");
            System.out.println("2.Search Employee ID ");
            System.out.println("3.Search Employee Dept ");
            System.out.println("0.Exit Menu ");
            int usersChoice = sc.nextInt();
            sc.nextLine();
            switch (usersChoice) {
                case 0:
                    System.out.println("Exiting Search Meanu...");
                    search_loop = false;
                    break;
                case 1:
                    searchByName();
                    break;
                case 2:
                    searchByEmpNo();
                    break;
                case 3:
                    searchByDept();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you want to Continue ?(Y/N) ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("n")) {
                search_loop = false;
            } else if (ans.equalsIgnoreCase("y")) {
            } else {
                System.out.println("Incorrect Input!");
            }
        } while (search_loop);
    }

    public static void searchByName() {
        System.out.println("Which Name do you want to search :");
        String name = sc.nextLine();
        name = name.toLowerCase();
        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().toLowerCase().contains(name)) {
                System.out.println("Employee Found: Details are; ");
                System.out.println(employees.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not Found");
        }

        String name2 = "vinaya";
        if (name2.contains(name)) {
            System.out.println("found");
        }
    }

    public static void searchByEmpNo() {
        System.out.println("Which Employee ID details you want to search :");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = true;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmp_no() == id) {
                System.out.println("Employee Found: Details are ");
                System.out.println(employees.get(i));
            }
        }
        if (!found) {
            System.out.println("Employee ID not Found");
        }
    }

    public static void searchByDept() {
        System.out.println("Which Department Employee details you want to search :");
        String dept = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getRole().equalsIgnoreCase(dept)) {
                System.out.println("Employee Found: Details are ");
                System.out.println(employees.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee Department not Found");
        }
    }

}
