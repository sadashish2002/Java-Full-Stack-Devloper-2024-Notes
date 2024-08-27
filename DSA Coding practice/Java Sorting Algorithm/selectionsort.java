public class selectionsort {
    
        public static void main(String[] args) {
            int num[] = {3,1,5,2,7,4};
            int size = num.length;
            int temp=0;
            int minindex = -1;
    
            System.out.println("before sorting ");
            for(int a: num){
    System.out.print(a+ " ");
            }
    
            for(int i = 0; i<size-1;i++){
                minindex =i;
                for(int j = i+1;j<size;j++){
                 if(num[minindex] > num[j]){
                    minindex = j;
                 }
                 temp = num[minindex];
                 num[minindex]= num[i];
                 num[i] = temp;
            }
            }
           
           
            System.out.println("after sorting ");
            for(int a: num){
    System.out.print(a+ " ");
            }
        }
    
    
}
