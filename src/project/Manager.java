package project;

public class Manager {
    private Stock stock;
    private Customer customer;
    private double price;
    private int money;

    public Manager(double price, int money, Customer customer) {
        this.price = price;
        this.money = money;
        this.customer = customer;
    }

    public Manager saleCarCustomer(){
        if(price == customer.getMoney()){

        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
