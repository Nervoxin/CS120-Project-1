/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DillanAsbury
 */
public class SalariedEmployee extends Employee
{
    double basePay;
    public SalariedEmployee()
    {
        
    }
    public SalariedEmployee(int empID, String empName, double basePay)
    {
        super(empID,empName);
        this.basePay = basePay;
    }   
//-----------------------Accessors and Mutators-----------------------
    public void setBasePay(double basePay)
    {
        this.basePay = basePay;
    }
    public void setEmpID(int empID)
    {
        this.empID = empID;
    }
    public void setEmpName(String name)
    {
        this.empName = name;
    }
    public double getBasePay()
    {
        return basePay;
    }
    public double getEmpID()
    {
        return this.empID;
    }
    public String getEmpName()
    {
        return this.empName;
    }
//--------------------------------------------------------------------
    public double findPay()
    {
        return basePay;
    }
    public String toString()
    {
        return super.toString() + "\tBase Pay : " + this.basePay;
    }
    public boolean equals(SalariedEmployee other)
    {
        return super.equals(other) && this.empID == other.empID && this.basePay == other.basePay;
    }
    

    
}