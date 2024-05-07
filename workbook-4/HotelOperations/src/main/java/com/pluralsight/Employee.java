package com.pluralsight;

public class Employee

{
    // normal hours
    final int regularHours = 40;

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    // derived getters
    public boolean isOverTime()
    {
        return hoursWorked > regularHours;
    }

    public double getTotalPay()
    {
        return getRegularHours() + getOverTimeHours();
    }

    public double getRegularHours()
    {
        return isOverTime() ? regularHours * payRate : hoursWorked * payRate;
    }

    public double getOverTimeHours()
    {
        return isOverTime() ? (hoursWorked - regularHours) * payRate : 0;
    }


}
