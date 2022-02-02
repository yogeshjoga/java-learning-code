import java.util.Scanner;

public class EmployeeUserLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee values \n1 Enter the Employee Name \n2 Enter the Employee role \n3 Enter the Empolyee Id \n 4 Enter the Empolyee Salary");
        String empName = sc.next();
        String empRoleComp = sc.next();
        int empId = sc.nextInt();
        int sal = sc.nextInt();
        sc.close();
        Employee obj = new Employee(empName,empRoleComp,empId,sal);
        obj.setSal(sal);
        obj.display();


    }

}