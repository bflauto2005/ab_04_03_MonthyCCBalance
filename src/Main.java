public class Main {
    public static void main(String[] args)
    {
        double cardBalance = 5000.00;
        double interestRate = 0.17;

        double firstMonthInterest = cardBalance * interestRate;
        double balanceAfterAMonth = cardBalance + firstMonthInterest;

        double secondMonthInterest = balanceAfterAMonth * interestRate;
        double balanceAfterTwoMonths = balanceAfterAMonth +secondMonthInterest;

        System.out.println("Balance after 1 month is " + balanceAfterAMonth + " $ ");
        System.out.println("Interest after 1 month is " + firstMonthInterest + " $ ");
        System.out.println("Balance after 2 months is " + balanceAfterTwoMonths + " $ ");
        System.out.println("Interest after 2 months is " + secondMonthInterest + " $ ");

    }
}