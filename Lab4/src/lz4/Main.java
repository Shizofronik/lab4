package lz4;


public class Main {
   public static void main(String[] arg) {
       Efficiency t1 = new Efficiency();
       t1.createTaxi();
       t1.getNumberOfCars();
       
       for (int day = 1; day <= 5; day++) {
    	   System.out.println("- - - День №" + day + " - - -");
           t1.countDailyIncome();
           t1.findMinPayroll();
           t1.findMaxPayroll();
           t1.DeleteDriver();
       }
       
       t1.findMaxIncome();
   }
}