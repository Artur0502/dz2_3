public class BankAccount {
    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }

    public Double deposit(Double sum){
        amount = amount + sum;
        System.out.println("Ваш счет пополнен на " + sum);
        return amount;
    }

    public Double withDraw(Double sum) throws LimitException {
        if (amount - sum < 0){
            throw new LimitException("На вашем балансе не достаточно средств", amount);
        }
        amount = amount - sum;
        System.out.println("С вашего баланса было снято " + sum);
        return amount;
    }


}
