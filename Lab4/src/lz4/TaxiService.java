package lz4;
import java.util.Scanner;

class TaxiService {
	private int number_of_cars = firstNumberOfCars(); // 16 машин из которых 8 бизнес, 8 эконом
    private Car[] cars_array; // весь таксопарк
    
    public int getNumberOfCars() {
        return number_of_cars;
    }
    
    //Наверное можно это сделать адекватней, но мне лень переписывать остальной код
    public int firstNumberOfCars() {
    	Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во машин(учтите, каждая 2я машина будет машиной бизнес-класса): ");
        int number = in.nextInt();
        in.close();
        return number;
    }
    
    public void setNumberOfCars(int number) {
        this.number_of_cars = number;
    }
    
    public Car[] getCarsArray() {
        return cars_array;
    }
    
    public void setCarsArray(Car[] array) {
        this.cars_array = array;
    }
    
    public void createTaxi() {

        Car[] cars_array = new Car[number_of_cars];
        for (int i = 0; i < number_of_cars; i++) {
            cars_array[i++] = new EconomCar();
            cars_array[i] = new BusinessCar();
        }
        this.setCarsArray(cars_array);
    }
}