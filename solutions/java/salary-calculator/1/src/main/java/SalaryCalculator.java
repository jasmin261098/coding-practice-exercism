public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5) ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        double totalBonus = productsSold * 10;
        return totalBonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double base = 1000.00;
        double bonus = productsSold * bonusMultiplier(productsSold);
        double salary = base * salaryMultiplier(daysSkipped) + bonus;

        return (salary > 2000.00) ? 2000.00 : salary;
    }
}
