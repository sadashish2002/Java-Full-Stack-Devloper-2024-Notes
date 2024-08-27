public class GenricMethod {
    public static void main(String[] args) {
        printData("Hello Sadashish kumar");
        printData(32355353);
        printData(3.233252);
        printData(346786.269);
        printData('C');

        //bound Genric type for non static method call
        GenricMethod obj = new GenricMethod();
      //  obj.doubleData(custom); // it shows error because we made genric to bound for number(integer , double ,float ..).

        obj.doubleData(123);


    }

    static <E> void printData(E data ){
        System.out.println(data);
    }

    // Bound genric method definition
    // we use extend keyword for bound or put limit on generic type

    <E extends Number> void doubleData(E data) {
        System.out.println(data);
    }
}
