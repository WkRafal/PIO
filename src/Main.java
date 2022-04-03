import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int throwDice;
        int playerChoice;

        do {
            throwDice = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + throwDice);
            playerChoice = rand.nextInt(6) + 1;
            System.out.println("Gracz wybiera " + playerChoice);
            if(throwDice != playerChoice)
                System.out.println("Nie zgadłeś");
            else
                System.out.println("Zgadłeś");
        }
        while(throwDice != playerChoice);

    }

}

