package lz4;
import java.util.Random;

class Financial extends TaxiService {
    
    private int[] daily_income = new int[this.getNumberOfCars()]; // доход за день по каждому авто
    private int income = 0; // доход за весь период
    
    public int[] getDailyIncome() {
        return daily_income;
    }
    
    public void setDailyIncome(int[] income) {
        this.daily_income = income;
    }
    
    public int getIncome() {
        return income;
    }
    
    public void setIncome(int sum) {
        this.income = sum;
    }
    
    public void countDailyIncome() {
        for (int i = 0; i < this.getNumberOfCars(); i++) {
            Random rand = new Random();
            int rand_hours = rand.nextInt(9);
            daily_income[i] = this.getCarsArray()[i].getPrice() * rand_hours;
            this.getCarsArray()[i].addCarIncome(daily_income[i]);
            income += daily_income[i];
            System.out.println((i + 1) + ". " + this.getCarsArray()[i].getName() + " - " + daily_income[i] + " рублев");
        }
        
        System.out.println("Итоговая выручка: " + income + "рублев \n");
        this.setDailyIncome(daily_income);
        this.setIncome(income);
    }
}
