public class insertionsort {
    
    public static void main(String[] args) {
        int num[] = {3,1,5,2,7,4,8};
        int size = num.length;
        
        
        System.out.println("before sorting ");
        for(int a: num){
        System.out.print(a+ " ");
        }

        for(int i = 1; i<size;i++){
         int  key = num[i];
           int j = i-1;
           while(j>=0 && num[j]>key ){
            num[j+1] = num[j];
            j--;
           }
           num[j+1]= key;
        }
       
       
        System.out.println("after sorting ");
        for(int a: num){
System.out.print(a+ " ");
        }
    }
}
