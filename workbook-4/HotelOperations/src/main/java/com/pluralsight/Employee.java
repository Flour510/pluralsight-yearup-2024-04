package com.pluralsight;

import java.time.LocalTime;

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
    private LocalTime punchInTime;
    private LocalTime punchOutTime;

    public Employee(int employeeId, String name, String department, double payRate)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this(employeeId, name, department, payRate);
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
        return getRegularPay() + getOverTimeHours();
    }

    public double getRegularPay()
    {
        return isOverTime() ? regularHours * payRate : hoursWorked * payRate;
    }

    public double getOverTimeHours()
    {
        return isOverTime() ? (hoursWorked - regularHours) : 0;
    }

    public void punchIn(LocalTime time)
    {
        punchInTime = time;
    }

    public void punchOut(LocalTime time)
    {
        punchOutTime = time;
        hoursWorked = calculateHoursWorked(punchInTime, punchOutTime);
    }

    private double calculateHoursWorked(LocalTime punchInTime, LocalTime punchOutTime)
    {
        // calculate total hours worked
        long hoursWorked = punchOutTime.getHour() - punchInTime.getHour();

        if (hoursWorked > regularHours)
        {
            double overTimeHours = hoursWorked - regularHours;

            return regularHours + overTimeHours;
        } else {
            return hoursWorked;
        }
    }

}
