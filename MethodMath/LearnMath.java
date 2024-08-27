package MethodMath;
public class LearnMath {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println(Math.pow(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.abs(-5));
        System.out.println(Math.random());

        System.out.println(getRandom());

        System.out.println(getRandom(10 , 20));
        System.out.println(Math.floor(6.8));
        System.out.println(Math.floor(6.8));
        System.out.println(Math.ceil(6.1));
        System.out.println(Math.round(6.5));


    }
// to get random number between 1 and 6
    public static int getRandom() {
        return (int) (Math.random()*6 + 1) ;
    }

    // to get random number betwween user choice number
    public static int getRandom(int a , int b) {
        return (int)(Math.random()*(b-a+1) + a);
    }
}
