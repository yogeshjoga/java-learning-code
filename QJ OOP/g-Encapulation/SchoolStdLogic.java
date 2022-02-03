import java.util.Scanner;

public class SchoolStdLogic {
       String studentName;
       String fatherName;
       String address;
       int phoneNumber;
    public void stdInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Student Name ");
        this.studentName = sc.next();
        System.out.println("\nEnter the Student PhoneNumber ");
        this.phoneNumber = sc.nextInt();
        System.out.println("\nEnter the Student Address ");
        this.address = sc.next();
        System.out.println("\nEnter the Student Fathers Name ");
        this.fatherName = sc.next();
        sc.close();
    }

    void stdDisplay(){
        SchoolStd obj = new SchoolStd();
        obj.setStdName(this.studentName);
        obj.setSonOf(this.fatherName);
        obj.setPhNo(this.phoneNumber);
        obj.setAddr(this.address);
        //obj.logic();
    }
    public static void main(String[] args) {
        SchoolStdLogic obj1 = new SchoolStdLogic();
        SchoolStd obj = new SchoolStd();
        obj1.stdInfo();
        obj1.stdDisplay();
        obj.logic();
    }
}



