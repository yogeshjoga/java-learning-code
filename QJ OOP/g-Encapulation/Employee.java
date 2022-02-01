public class Employee {
    /* WAP to create the blueprint of employee with any three properties and a behaviour where in the user
    must not initialize the salary the value less thean 10,000. Create a user logic with 3 emplyees
    objects and display their dbehaviours. */
    String empName , empRoleInComp;
    int empId;
    private int sal;
    Employee(String empName , String empRoleInComp, int emId, int sal){
        this.empName =  empName;
        this.empRoleInComp = empRoleInComp;
        this.empId = empId;
        this.sal =  sal;
        if(sal > 10000){
            this.sal = sal;
        }
        else System.out.println(this.sal+"Enter the valid salary the employee ?");
        
    }
    void setSal(int sal){
        if (sal >10000){
            this.sal =  sal;
        }
        else System.out.println("Enter the proper amount to the employee salary below is the  10000");
    }
    void getSal(){
        this.sal;
    }
    void display(){
        System.out.println("The salary of the current employee is : "+this.sal);
    }
}
