import java.util.Scanner;
class student{
    String collegeName;
    String stdName;
    long rollNum;
    long phNo;
    String sonOf;
    String addr;
    int postNo;
}
public class ObjectCreation {
    static void idCard(){
    student s1 = new student();
    s1.collegeName = "Centurion University of Technology and Management";
    s1.stdName = "Joga Yogesh ";
    s1.rollNum = 170101161037L;
    s1.phNo = 919110566354L;
    s1.sonOf = "Joga Paparao";
    s1.addr = "golla jaganatha puram, pundi, palasa ,srikakulam, andhra pradesh.";
    s1.postNo = 532218;
    System.out.println("\n ========= UNIVERSITY ID CARD ========== \n");
    System.out.println(s1.collegeName+"\n"+s1.stdName+"\n"+s1.rollNum+"\n"+s1.phNo+"\n"+s1.sonOf+"\n"+s1.addr+"\n"+s1.postNo+"\n");
    System.out.println(" ===== From yogesh joga ==== \n");
    }

    public static void main(String[] args) {
        idCard();
        
    }
   
}
