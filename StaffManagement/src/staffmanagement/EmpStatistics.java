package staffmanagement;

import java.util.Scanner;

public class EmpStatistics {
    //Display Statistics Management Menu

    public static Scanner sc = new Scanner(System.in);

    public static void averageSalary() {
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < EmployeeManagement.employees.size(); i++) {
            sum = sum + EmployeeManagement.employees.get(i).getSalary();
        }

        avg = sum / EmployeeManagement.employees.size();
        System.out.println("Average Salary of Employees in the Company is : " + avg);

    }

    public static void minSalary() {
        int min = 0;
        for (int i = 0; i < EmployeeManagement.employees.size(); i++) {
            if (EmployeeManagement.employees.get(i).getSalary()
                    < EmployeeManagement.employees.get(min).getSalary()) {
                min = i;
            }
        }
        System.out.println("Minimum Salary in the Company is : "
                + EmployeeManagement.employees.get(min).getSalary());

    }

    public static void maxSalary() {
        int max = 0;
        for (int i = 0; i < EmployeeManagement.employees.size(); i++) {
            if (EmployeeManagement.employees.get(i).getSalary()
                    > EmployeeManagement.employees.get(max).getSalary()) {
                max = i;
            }
        }
        System.out.println("Maximun Salary in the Company is : "
                + EmployeeManagement.employees.get(max).getSalary());

    }

    public static void bonus() {
        double total_bonus = 0, bonus = 0;
        for (int i = 0; i < EmployeeManagement.employees.size(); i++) {
            bonus = EmployeeManagement.employees.get(i).getSalary() * 0.1;
            total_bonus += bonus;
        }
        System.out.println("Total Bonus : " + total_bonus);

    }

    public static void womenPercentage() {
        int counter = 0;
        double w_percent = 0;
        for (int i = 0; i < EmployeeManagement.employees.size(); i++) {
            if (EmployeeManagement.employees.get(i).getGender().equalsIgnoreCase("f")) {
                counter++;
            }
        }

        w_percent = (counter * 100) / EmployeeManagement.employees.size();
        System.out.println("Women Percentage : " + w_percent + "%");
    }

    public static void menPercentage() {
        String work_role = "";
        int counter = 0;
        int work_counter = 0;
        double m_percent = 0;

        System.out.println("\n Enter Work Role to Calculate Men Percentage? ");
        System.out.println("\n1. Tester ");
        System.out.println("2. Web Developer ");
        System.out.println("3. Project Manager");
        System.out.println("4. HR ");
        System.out.println("5. House Keeping ");
        int usersChoice = sc.nextInt();
        sc.nextLine();
        switch (usersChoice) {
            case 1:
                work_role = "tester";
                break;
            case 2:
                work_role = "web developer";

                break;
            case 3:
                work_role = "project manager";
                break;
            case 4:
                work_role = "HR";
                break;
            case 5:
                work_role = "house keeping";
                break;
            default:
                System.out.println("Wrong choice");
        }
        for (int i = 0;
                i < EmployeeManagement.employees.size();
                i++) {
            if (EmployeeManagement.employees.get(i).getRole().
                    equalsIgnoreCase(work_role)) {
                work_counter++;
            }
            if (EmployeeManagement.employees.get(i).getGender().equalsIgnoreCase("m")) {
                counter++;
            }
        }

        if (counter != 0 && work_counter != 0) {
            m_percent = (work_counter * 100) / EmployeeManagement.employees.size();

            System.out.println(
                    "Men Percentage within " + work_role + " is : " + m_percent + "%");

            m_percent = (counter * 100) / EmployeeManagement.employees.size();
            System.out.println(
                    "Men Percentage in the Company is : " + m_percent + "%");
        } else {
            System.out.println("No " + work_role + " Employees found!");
        }
    }
}
