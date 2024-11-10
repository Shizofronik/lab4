package lz4;
//Efficiency

class Efficiency extends Financial {
    
    private int min_payroll;
    private int min_index;
    private int max_payroll;
    private int max_index;
    private int max_income;
    private int max_income_id;
    
    public int getMinPayroll() {
        return min_payroll;
    }
    
    public void setMinPayroll(int payroll) {
        this.min_payroll = payroll;
    }
    
    public int getMinIndex() {
        return min_index;
    }
    
    public void setMinIndex(int index) {
        this.min_index = index;
    }
    
    public int getMaxPayroll() {
        return max_payroll;
    }
    
    public void setMaxPayroll(int payroll) {
        this.max_payroll = payroll;
    }
    
    public int getMaxIndex() {
        return max_index;
    }
    
    public void setMaxIndex(int index) {
        this.max_index = index;
    }
    
    public void findMaxIncome() {
    	max_income = 0;
    	max_income_id = 0;
    	
    	for (int i = 1; i < this.getNumberOfCars(); i++) {
    		if(this.getCarsArray()[i].getCarIncome() > max_income) {
    			max_income = this.getCarsArray()[i].getCarIncome();
    			max_income_id = i;
    		} 
    	}    	
    	System.out.println("За все дни водитель " + this.getCarsArray()[max_income_id].getName() + " заработал больше всего, а именно: " + max_income + " рублев"); 
    }
    
    public void findMaxPayroll() {
    	 max_index = 0;
         max_payroll = this.getDailyIncome()[0];
         
         for (int i = 1; i < this.getNumberOfCars(); i++) {
             if (this.getDailyIncome()[i] > max_payroll) {
                 max_index = i; max_payroll = this.getDailyIncome()[i];
             }  
         }
         System.out.println("За день " + (max_index + 1) + "-й водитель заработал больше всего \n");  
    	
    }
    
    public void findMinPayroll() {
        min_index = 0;
        min_payroll = this.getDailyIncome()[0];
        
        for (int i = 1; i < this.getNumberOfCars(); i++) {
            if (this.getDailyIncome()[i] < min_payroll) {
                min_index = i; min_payroll = this.getDailyIncome()[i];
            }  
        }
        
        System.out.println( + (min_index + 1) + "-й водитель заработал меньше всего \n");  
    }
    
    public void DeleteDriver() {
        setCarsArray(ArraysCar.remove(this.getCarsArray(), min_index));
        this.setNumberOfCars(this.getNumberOfCars() - 1);
    }
}