public class bubblesort {
    public static void main(String[] args) {
        int num[] = {3,1,5,2,7,4};
        int size = num.length;
        int temp;

        System.out.println("before sorting ");
        for(int a: num){
System.out.print(a+ " ");
        }

        for(int i = 0; i<size;i++){
            for(int j = 0;j<size-i-1;j++){
             if(num[j]>num[j+1]){
                temp = num[j];
             num[j] = num[j+1];
             num[j+1] = temp;
            }  
        }
        }
        System.out.println("after sorting ");
        for(int a: num){
System.out.print(a+ " ");
        }
    }
}
