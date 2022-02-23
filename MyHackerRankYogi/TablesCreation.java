import java.util.scanner;
public class TablesCreation {
    Scanner sc = new Scanner(System.in);
    public int tableOutput(int whichTable){
        int mult;
        for(int i =1; i <=10; i++){
            mult = whichTable * i;
            System.out.println(whichTalbe+""+i+""+mult);
           
        }
      return mult;
    }
    public static void mian(String[] args){
        TablesCreation obj = new TablesCreation();
        int inputTable = obj.sc.nextInt();
        obj.tableOutput(inputTable);

        
    }
    
    
}






