package project;

public class Cashier {
    private static double TOTAL_INCOMES = 0;
    public void makeOrder(Car car){
        TOTAL_INCOMES += car.getPrice();
    }
    public static void getTotalIncomes(){
        System.out.println("Доходы от всех машин равны " + TOTAL_INCOMES);
    }
}
