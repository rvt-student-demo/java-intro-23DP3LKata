package lv.rvt;

public class App 
{
    public static void main( String[] args )
    {

        // Payment Card (6 parts)

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

    }
}       