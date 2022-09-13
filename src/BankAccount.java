public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы сняли со счета " + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("на вашем  счету недостаточно средств: ", amount);
        } else {
            System.out.println("Ввы можете снять со счета: "+sum);
            amount -= sum;
            System.out.println("Вы сняли со счета: " + sum);
        }


    }



}
