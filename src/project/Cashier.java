package project;

public class Cashier {
    private int incomeAccount;

    public Cashier(int incomeAccount) {
        this.incomeAccount = incomeAccount;
    }
    public int getIncomeAccount(){
        incomeAccount++;
        return incomeAccount;
    }
    public void setIncomeAccount(int incomeAccount) {
        this.incomeAccount = incomeAccount;
    }
}
