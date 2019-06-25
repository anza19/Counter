public class FooCorporation{
    public static void main(String[] args) {
        totalPay(100,60);
    }

    /**
     * The following method computes the salary of a employee based on the following rules
     * #1. An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours. 
     * #2. For every hour over 40, they get overtime = (base pay) × 1.5. 
     * #3. The base pay must not be less than the minimum wage ($8.00 an hour). If it is, print an error. 
     * #4. If the number of hours is greater than 60, print an error message. 
     */

     public static void totalPay(double basePay, int totalHoursWorked){
        
        int normalWorkWeek = 40;
        int hardWorkWeek = 60;
        double minimumWage = 8.00;
        double weeklySalary = 0.0;
        double overtimeMultiplier = 1.5;

        //firstly, we handle the case where the base case is less then $8.00
        if(basePay < minimumWage){
            System.out.println("ERROR: Employee is underpaid!");
        }

        //now we handle the case where the employee earns more then the minimum wage and works upto 40 hours weekly
        if(basePay > minimumWage && totalHoursWorked <= normalWorkWeek){
            weeklySalary = (basePay * totalHoursWorked);
            System.out.println("The employee earned = $" + weeklySalary);
        }

        //now we handle the overtime case
        else if(basePay > minimumWage && (totalHoursWorked > normalWorkWeek && totalHoursWorked <= hardWorkWeek)){
            weeklySalary = ((basePay * overtimeMultiplier) * totalHoursWorked);
            System.out.println("The employee earned = $" + weeklySalary);
        }

        //the case where the number of hours exceed 60
        else{
            System.out.println("ERROR: Worked more then 60 hours!");
        }

     }
}