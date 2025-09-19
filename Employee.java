/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
    return (currentYear - yearOfBirth);
    Get calculateAge Amount;
    if (calculateAge > 16) Then;
     return message("employee is below age 16");
    else
     return message ("employee is age 16 or above");
    }

    /**
     * 
     */
    private void setAge(){
      
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (calculateAge >16) then
        print message ("Not of age to drive");
        else 
        print message ("you are of age")
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        Total = (hourlywage + unpaid hours)
        calculate pay = (Total x 30%)
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        Get calculate pay then
        print message ("private string fullname has received a wire transfer")
        set unpaid hours = 0
    }
}


        


            

