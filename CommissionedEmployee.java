/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DillanAsbury
 */
public class CommissionedEmployee extends Employee 
{
    protected double basePay, weeklySales;
    
    public CommissionedEmployee()
    {
        
    }
    
    public CommissionedEmployee(int empID, String empName, double basePay, double weeklySales)
    {
        super(empID, empName);
        this.basePay = basePay;
        this.weeklySales = weeklySales;
    }
//-----------------------------Accessors and Mutators---------------------------
    public void setBasePay(double basePay)
    {
        this.basePay = basePay;
    }
    public void setWeeklySales(double weeklySales)
    {
        this.weeklySales = weeklySales;
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
        return this.basePay;
    }
    public double getWeeklySales()
    {
        return this.weeklySales;
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
        return basePay + (.20 * weeklySales);
    }
    
    public String toString()
    {
        return super.toString() + "\tBase Pay : " + this.basePay;
    }
}
