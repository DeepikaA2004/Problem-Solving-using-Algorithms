public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}

/*
 * public static int fact(int n){
 * if (n==0){
 * return 1;
 * }
 * else{
 * int fn1= num1;
 * int fn = num*fact(num-1);
 * return fn ;
 * }
 * }
 * 
 */