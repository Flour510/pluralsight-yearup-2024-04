package com.pluralsight;

import java.time.LocalTime;
import java.time.LocalDateTime;

public class Employee

{
    // normal hours
    final int regularHours = 40;

    //private variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalTime time;

    // public variables
    public double punchIn;
    public double punchOut;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, LocalTime time)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.time = time;
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

    public LocalTime getTime()
    {
        return time;
    }

    public double punchIn()
    {
        return punchIn = new LocalTime();
    }

    public double punchOut()
    {
        return punchOut = hoursWorked;
    }


}
