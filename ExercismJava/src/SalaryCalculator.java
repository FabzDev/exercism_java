package edu.fabzdev.exercism;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary =  1000.00 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return Math.min(salary, 2000.00);
    }
}
