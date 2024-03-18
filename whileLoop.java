public class whileLoop {
    
    public static int number = 1; // initialize to 1, the first odd number
    public static int sum = 0;

    public static void main(String[] args){
        System.out.println("The sum of odd numbers between 1 and 150 is");
        sumOfOddNumbers();
    }

    public static void sumOfOddNumbers() {

        // While loop to iterate through odd numbers between 1 and 150 and compute the sum
       while(number <= 150) {
            if(number % 2 != 0) { // check if odd number(not divisible by 0)
                sum += number; // iterate as you sum each value to the previous sum
            }
            number++;
       }

       System.out.println(sum);
        
    }
}
