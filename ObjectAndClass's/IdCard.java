import java.util.Scanner;
class studentInfo{
    String collegeName;
    String stdName;
    long rollNum;
    long phNo;
    String sonOf;
    String addr;
    int postNo;

 void studentReg(){
    studentInfo stdReg = new studentInfo();
    stdReg.collegeName = "Centurion Uninversity of technology and management";
    System.out.println(stdReg.collegeName);
    }
    
}

public class IdCard {
    public static void main(String[] args) {
    studentInfo ss = new studentInfo();
    ss.studentReg();
    }
    
}
