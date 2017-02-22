/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DillanAsbury
 */
public class HourlyEmployee extends Employee
{
    protected double hoursWorked;
    protected double hourlyRate;
    
    public HourlyEmployee()
    {
        
    }
    
    public HourlyEmployee(int empID, String empName, double hoursWorked, double hourlyRate)
    {
        super(empID, empName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        
    }
//---------------------------Accessors and Mutators-----------------------------
    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }
    public void setHoursWorked()
    {
        this.hoursWorked = hoursWorked;
    }
    public void setEmpID(int empID)
    {
        this.empID = empID;
    }
    public void setEmpName(String name)
    {
        this.empName = name;
    }
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    public double getEmpID()
    {
        return this.empID;
    }
    public String getEmpName()
    {
        return this.empName;
    }
    
//------------------------------------------------------------------------------
    public double findPay()
    {
        if(hoursWorked <= 40)
        {
            return hoursWorked * hourlyRate;
        }
        else
        {
            return (40 * hourlyRate) + (1.5 * hourlyRate * (hoursWorked - 40));
        }
    }
    
    public String toString()
    {
        return super.toString() + "\tHourly Rate : " + this.hourlyRate;
    }
    
    public boolean equals(HourlyEmployee other)
    {
        return super.equals(other) && this.hourlyRate == other.hourlyRate && 
                this.hoursWorked == other.hoursWorked;
    }


}
