package LeetCode.beginner;

public class PalindromeChecker {

    private int number;

    private PalindromeChecker(int number) {
        this.number = number;
    }

    public static boolean checkIfPalindromeNumber (int number){
        return new PalindromeChecker(number).isPalindromeNUmber();
    }

    public boolean isPalindromeNUmber(){
        int copy = number, reverse = 0;

        while(copy >= 1){
            int lastDigit = copy % 10;
            reverse = reverse * 10 + lastDigit;
            copy /= 10;
        }

        return reverse == number;
    }

    public static void main (String [] args){
        int number = 122;
        if(PalindromeChecker.checkIfPalindromeNumber(number))
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
    }
}
