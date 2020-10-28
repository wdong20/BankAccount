public class Tester {
    public static void main(String[] ahhh) {
        BankAccount account = new BankAccount(123, "VeryGoodPassword");

        printAccountInfo(account);

        System.out.println("\nDesposit Tests:");
        System.out.println("Expected True and $20.2:");
        System.out.println(account.deposit(20.2)); // True
        printAccountInfo(account); // 0 -> 20.2

        System.out.println("Expected True and $44.53:");
        System.out.println(account.deposit(24.33)); // True
        printAccountInfo(account); // 20.2 -> 44.53

        System.out.println("\nExpected False and $44.53:");
        System.out.println(account.deposit(-3)); // False
        printAccountInfo(account); // 44.53

        System.out.println("\nWithdraw Tests:");
        System.out.println("Expected False and $44.53:");
        System.out.println(account.withdraw(83)); // False
        printAccountInfo(account); // 44.53

        System.out.println("\nExpected True and $10:");
        System.out.println(account.withdraw(34.53)); // True
        printAccountInfo(account); // 44.53 -> 10

        System.out.println("\nExpected False and $10:");
        System.out.println(account.withdraw(-9999)); // False
        printAccountInfo(account); // 10
    }

    public static void printAccountInfo(BankAccount account) {
        System.out.print(account.toString());
    }
}