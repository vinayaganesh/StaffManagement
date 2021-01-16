package staffmanagement;

public class StaffManagement {

    public static void main(String[] args) {
        EmployeeManagement.load();
//        EmployeeManagement.whatDoEachEmployeeDo();
        
        while (UI.loop) {
            UI.mainMenu();
        }
    }

    

}
