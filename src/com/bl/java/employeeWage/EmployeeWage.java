package com.bl.java.employeeWage;

public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int EMP_RATE_PER_HOUR;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;
    private int totalEmpWage;

    // Constructor
    public EmployeeWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH)
    {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
    }

    public void computeWage()
    {
        //Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
        {
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                default:
                    empHrs = 0;

            }

            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);

        }

         totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;

    }

    @Override
    public String toString()
    {
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program");

        // Calling Method for different company

        EmployeeWage dMart = new EmployeeWage("DMart", 20, 2, 10);
        EmployeeWage reliance = new EmployeeWage("Reliance", 10, 4, 20);
        EmployeeWage meta = new EmployeeWage("Meta", 25, 6, 22);

        dMart.computeWage();
        System.out.println(dMart);

        reliance.computeWage();
        System.out.println(reliance);

        meta.computeWage();
        System.out.println(meta);

    }
}
