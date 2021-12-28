
import java.util.*;

class Guess_the_number {
    static Scanner sc = new Scanner(System.in);
    static int num, ran, count = 1;

    public static void main(String[] args) {
        Guess_the_number obj = new Guess_the_number();
    
        for (int i = 1; i <= 6; i++) {
            obj.acceptor();
           Boolean result = obj.checker(i);
           if(result == true){
            System.exit(0);
           }
           
            if (i == 6) {
                System.out.println("You lose NOOB");
                System.out.println("The entered was "+ran); 
                System.exit(0);
            }
        }
    }

    public Guess_the_number() {
        Random random = new Random();
        System.out.println("Gererate a random number");
        ran = random.nextInt(100);
        System.out.println("random number generated between 1 and 100" + ran);
        System.out.println("Your total chances are 6");

    }

    public void acceptor() {
        System.out.println("Guess the random number between 1 and 100");
        num = sc.nextInt();

    }

    public Boolean checker(int i) {
        if (num == ran) {
            System.out.println("Congratulations!! , Your entered number is correct");
            System.out.println("Your Rank is " + i);
            return true;
        }
        if (num > ran) {
            System.out.println("Your entered number is higher than the random number, Try again");
            return false;
        }
        if (num < ran) {
            System.out.println("Your entered number is lower than the random number, Try again");
            return false;
        }
        return null;
    }
}
