
public class forLoop {


    public static void main(String[] args){
        System.out.println("This class outputs values held in an array");
        displayArrayNumbers();
    }

    public static void displayArrayNumbers(){

        int[] numbers = {12, 14, 16, 18, 20, 22, 24, 26, 28};

        for(int iterator = 0; iterator < numbers.length; iterator++) {
            System.out.println(numbers[iterator]);
        }
    }
}
