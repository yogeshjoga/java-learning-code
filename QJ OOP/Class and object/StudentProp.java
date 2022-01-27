public class StudentProp {
     /* WAP to create the blue print of student with the properties name 10th percentage, 12th percentage and degree percetnage.
     some students have completed upto 10th some upto 12th and reamaining upto degree with  a behavior display with display the 
     properties of the student object. create a user logic with 4 students objects where in 2 ompleted upto 10th and one upto 12th 
     and reamining upto degree. Display therir behaviour also. */
    String studentName;
    int rollNum;
    double ten10thPercentage;
    double interPercentage;
    double degreePercentage;
    StudentProp(String studentName, int rollnum, double ten10thPercentage, double interPercentage, double degreePercentage ){
        this.studentName = studentName;
        this.rollNum = rollnum;
        this.ten10thPercentage = ten10thPercentage;
        this.interPercentage = interPercentage;
        this.degreePercentage = degreePercentage;
        System.out.println(this.studentName+"\n"+this.rollNum+"\n"+this.ten10thPercentage+"\n"+this.interPercentage+"\n"+this.degreePercentage);
    }
    StudentProp(String studentName, int rollnum, double ten10thPercentage, double interPercentage){
        this.studentName = studentName;
        this.rollNum = rollnum;
        this.ten10thPercentage = ten10thPercentage;
        this.interPercentage = interPercentage;
        System.out.println(this.studentName+"\n"+this.rollNum+"\n"+this.ten10thPercentage+"\n"+this.interPercentage+"\n");
    }
    StudentProp(String studentName, int rollnum, double ten10thPercentage){
        this.studentName = studentName;
        this.rollNum = rollnum;
        this.ten10thPercentage = ten10thPercentage;
        System.out.println(this.studentName+"\n"+this.rollNum+"\n"+this.ten10thPercentage+"\n");
    }
    public static void diplay(){
        System.out.println("\n\n-----------------------------------");
        System.out.println(" 1 : Enter the Student Name "+this.);
        System.out.println(" 2 : Enter the Student Roll Number");
        System.out.println(" 3 : Enter the Student 10th Percentage ");
        System.out.println(" 4 : Enter the Student Inter Percentage");
        System.out.println(" 5 : Enter the Student Degree Percentage ");
        System.out.println("-----------------------------------\n\n");
        
    }


}
