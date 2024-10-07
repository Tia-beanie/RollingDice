import java.util.Random;
public class RollingDice {
    public static void main(String[] args){

        Random coolNumSis = new Random();
        int x = coolNumSis.nextInt(6) + 1;

        System.out.println(("you rolled a : " + x));
    }
}
