public class ArrayLogic1 {
    int[] arr = new int[9];
    int temp = 0;
    void arrayAsc(int arra[]){
     for(int i=0;i<=this.arr.length;i++){
        for(int j=0; j<=this.arr.length;j++){
            this.temp=arr[i];
            arr[i]=arr[j];
            arr[j]=this.temp;
        }
      }
    }


    public static void main(String[] args) {
        ArrayLogic1 obj = new ArrayLogic1();
       int arr[]={1,5,4,3,2,6,8,9,7};
        int arr1[]= arr;
        obj.arrayAsc(arr1);
    }
}
