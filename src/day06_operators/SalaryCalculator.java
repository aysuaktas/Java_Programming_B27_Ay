package day06_operators;

public class SalaryCalculator {

    /*
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
     */

    public static void main(String[] args) {

        double salary = 100_000; // for money things, use 'double'.
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;

        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate; // state tax'i hesaplamak icin salary multiplies stateTaxRate yapariz. // todo: practice

        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "Salary: " + salary + " | State tax rate: " + stateTaxRate + " | Federal tax rate " + federalTaxRate + "\nState tax: " + stateTax + " | Federal tax: $" + federalTax + " | Total tax: $" + totalTax + "\nTotal salary after taxes: $" + salaryAfterTax ; // dik cizgiyi " | " bilgileri ayirmak icin kullandi Saim.
        System.out.println(taxReport);

    }
}
