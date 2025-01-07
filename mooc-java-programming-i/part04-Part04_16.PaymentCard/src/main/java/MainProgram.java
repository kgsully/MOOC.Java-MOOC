
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        // Test Code - Part 1
        // PaymentCard card = new PaymentCard(50);
        // System.out.println(card);

        // Test Code - Part 2
        // PaymentCard card = new PaymentCard(50);
        // System.out.println(card);

        // card.eatAffordably();
        // System.out.println(card);

        // card.eatHeartily();
        // card.eatAffordably();
        // System.out.println(card);

        // Test Code - Part 3
        // PaymentCard card = new PaymentCard(5);
        // System.out.println(card);

        // card.eatHeartily();
        // System.out.println(card);

        // card.eatHeartily();
        // System.out.println(card);

        // Test Code - Part 4
        // PaymentCard card = new PaymentCard(10);
        // System.out.println(card);

        // card.addMoney(15);
        // System.out.println(card);

        // card.addMoney(10);
        // System.out.println(card);

        // card.addMoney(200);
        // System.out.println(card);

        // Test Code - Part 5
        // PaymentCard card = new PaymentCard(10);
        // System.out.println("Paul: " + card);
        // card.addMoney(-15);
        // System.out.println("Paul: " + card);

        // Code - Part 6
        PaymentCard cardPaul = new PaymentCard(20.0);
        PaymentCard cardMatt = new PaymentCard(30.0);

        cardPaul.eatHeartily();
        cardMatt.eatAffordably();

        System.out.println("Paul: " + cardPaul);
        System.out.println("Matt: " + cardMatt);

        cardPaul.addMoney(20.0);

        cardMatt.eatHeartily();

        System.out.println("Paul: " + cardPaul);
        System.out.println("Matt: " + cardMatt);

        cardPaul.eatAffordably();
        cardPaul.eatAffordably();

        cardMatt.addMoney(50.0);

        System.out.println("Paul: " + cardPaul);
        System.out.println("Matt: " + cardMatt);

    }
}
