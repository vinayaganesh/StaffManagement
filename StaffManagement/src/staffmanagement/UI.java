package staffmanagement;

import java.util.Scanner;
import static staffmanagement.EmpStatistics.*;
import static staffmanagement.EmployeeManagement.*;

public class UI {

    public static boolean loop = true;
    public static boolean emp_mgmt_loop = true;
    public static boolean stats_loop = true;

    // Each loop for specific MENU
    static Scanner sc = new Scanner(System.in);

    //Display Main menu for Employee Management & Statistics related to employee
    public static void mainMenu() {
        System.out.println("\n Staff Management Main Menu ");
        System.out.println("    1. Employee Management");
        System.out.println("    2. Employee Statistics");
        System.out.println("    0. Exit");
        System.out.println("\n  Make a Choice : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 0:
                System.out.println("\nProgram Exits...");
                loop = false;
                break;
            case 1:
                employeeMenu();
                break;
            case 2:
                statisticsMenu();
                break;
            default:
                System.out.println("Invalid Choice...");
        }

    }

    //Display Employee Management Menu
    public static void employeeMenu() {

        do {
            System.out.println("\n    Employee Menu");
            System.out.println("   1. Register Employee");
            System.out.println("   2. Delete Employee");
            System.out.println("   3. Update Employee");
            System.out.println("   4. Search");
            System.out.println("   5. Display all Employees ");
            System.out.println("   6. Display Employee Work Role");
            System.out.println("   0. Back to Main Menu");
            System.out.println("\n  Make a Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    //System.out.println("\nBack to Main Menu...");
                    emp_mgmt_loop = false;
                    break;
                case 1:                    
                    addEmp();
                    break;
                case 2:
                    deleteEmp();
                    break;
                case 3:
                    updateEmpDetails();
                    break;
                case 4:
                    searchEmpDetails();
                    break;
                case 5:
                    displayEmp();
                    break;
                case 6:
                    whatDoEachEmployeeDo();
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
            System.out.println("Do you want to continue in Employee Management"
                    + " Menu ? (Y/N): ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("n")) {
                emp_mgmt_loop = false;
            } else if (ans.equalsIgnoreCase("y")) {

            } else {
                System.out.println("Felaktig Inmatning!");
                emp_mgmt_loop = false;
            }
        } while (emp_mgmt_loop);
    }

    public static void statisticsMenu() {

        do {
            System.out.println("\n    Statistics Menu");
            System.out.println("   1. Average Wage of the Company");
            System.out.println("   2. Maximum Salary in the Company");
            System.out.println("   3. Minimum Salary in the Company");
            System.out.println("   4. Total Bonus");
            System.out.println("   5. Women in Percentage in the Company");
            System.out.println("   6. Men in Percentage of various work role Category");
            System.out.println("   0. Back to Main Menu");
            System.out.println("\n  Make a Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    //System.out.println("Back to Main Menu..");
                    stats_loop = false;
                    break;
                case 1:
                    averageSalary();
                    break;
                case 2:
                    maxSalary();
                    break;
                case 3:
                    minSalary();
                    break;
                case 4:
                    bonus();
                    break;
                case 5:
                    womenPercentage();
                    break;
                case 6:
                    menPercentage();
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
            
            System.out.println("Do you want to continue in Employee Statistics "
                    + "Menu ? (Y/N): ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("n")) {
                stats_loop = false;
            } else if (ans.equalsIgnoreCase("y")) {

            } else {
                System.out.println("Felaktig Inmatning!");
                stats_loop = false;
            }
        } while (stats_loop);
    }
}
