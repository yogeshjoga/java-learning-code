import java.util.Scanner;
public class NewConstructor {
    // Im creaging the students id card deatils by using constructor methods
    //Now i take the varibales for student id cards it will changing every student so i will choose instance variables
    static String collegeName = "Centrurion_University_Of_Techonology_And_Management";
    static String collegeAddr = "Oddisha_Pkd";
    String studentName;
    int rollNo;
    int classNam;
    char section;
    String fatherName;
    long phNo;
    String studentAddr;
    // passing variables into constructor its declaration
    NewConstructor(String newCollegeName, String newCollegeAddr, String newStudentName, int newRollNo, int newClassName, char newSection,String newFatherName,long newPhNo,String newStudentAddr ){
        collegeName = newCollegeName;
        collegeAddr = newCollegeAddr;
        studentName = newStudentName;
        rollNo = newRollNo;
        classNam = newClassName;
        section = newSection;
        fatherName = newFatherName;
        phNo = newPhNo;
        studentAddr = newStudentAddr;
    }
    public void idCard(){
        System.out.println("\n            WECOME TO STUDENT ID CARDS           \n");
        System.out.println("College Name is                : "+collegeName);
        System.out.println("College Address is             : "+collegeAddr);
        System.out.println("Student Name is                : "+studentName);
        System.out.println("Roll No of the Student         : "+rollNo);
        System.out.println("Class of the Student is        : "+classNam);
        System.out.println("Section of the Student is      : "+section);
        System.out.println("Father Name of the Student is  : "+fatherName);
        System.out.println("Phone Number of the Student is : "+phNo);
        System.out.println("Student addrs is               : "+studentAddr+"\n\n");
    }

    public static void main(String[] args) {
    //object creation and passing values to student no 1 im taken stud1 as a student1 as a variable
    NewConstructor stud1 = new NewConstructor(NewConstructor.collegeName, NewConstructor.collegeAddr,"Joga Yogesh",0001,5,'B',"Joga Paparao",9110566354L,"GollajaganathaPuram");
    stud1.idCard();
    //2nd object for 2nd Student
    NewConstructor stud2 = new NewConstructor(NewConstructor.collegeName, NewConstructor.collegeAddr, "Billa", 0002, 5, 'B', "Srinivas rao", 8500123104L, "pundi/palasa");
    stud2.idCard();
    

    }

}
