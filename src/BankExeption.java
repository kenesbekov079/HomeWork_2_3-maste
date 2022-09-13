public class BankExeption {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount();
        bank.deposit(20000.00);
        while (true) {
            try {
                bank.withDraw(6000);
            } catch (LimitException e) {
                try {
                    bank.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;
            }
        }
    }
}