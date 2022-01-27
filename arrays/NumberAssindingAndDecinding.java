
public class NumberAssindingAndDecinding {
    int temp = 0;
    NumberAssindingAndDecinding(int num[]){
        System.out.println("\n\n\n Given array is :- ");

        for (int i : num) {
            System.out.println(i+" ");
        }
        for(int i=0; i<=num.length; i++){
            for(int j=0; j<=num.length; j++){
                if(num[i]<num[j]){
                this.temp = num[i];
                num[i] = num[j];
                num[j] = this.temp;
                }
            }
        }
        System.out.println("Arrange the array ");
        for (int i : num) {
            System.out.println(i+" ");
        }
    }
    void inPuts(){
        System.out.println("Enter the number");
    }  
}
