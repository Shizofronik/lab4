package lz4;

public abstract class Car {
    private String name;
    private int price;
    private int car_income;
    public abstract int calculate(int hours);
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCarIncome() {
        return car_income;
    }
    
    public void addCarIncome(int num) {
        this.car_income += num;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
