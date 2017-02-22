/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DillanAsbury
 */
public abstract class Employee 
{
    
    protected int empID;
    protected String empName;
    
    public Employee()
    {
        
    }
    public Employee(int empID, String empName)
    {
        this.empID = empID;
        this.empName = empName;
    }
//----------------------Accessors and Mutators----------------------------------
    public void setEmpID(int empID)
    {
        this.empID = empID;
    }
    public void setEmpName(String name)
    {
        this.empName = name;
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
    public abstract double findPay();
    
    public String toString()
    {
        return "Name : " + this.empName + "\tEmployee ID : " + this.empID;
    }
    public boolean equals(Employee other)
    {
        return this.empName.equals(other.empName) && this.empID == other.empID;
    }
    
}
