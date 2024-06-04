import taxes.*;

public class Main {
    public static void main(String[] args) {
        TaxSystem usnIncomeTaxSystem = new USNCreditTaxSystem();
        TaxSystem usnIncomeMinusExpensesTaxSystem = new USNDebitMinusCreditTaxSystem();

        Company company1 = new Company("Бобёр", usnIncomeTaxSystem);
        company1.shiftMoney(1000);
        company1.shiftMoney(-500);
        company1.payTaxes();

        Company company2 = new Company("Бобр", usnIncomeMinusExpensesTaxSystem);
        company2.shiftMoney(2000);
        company2.shiftMoney(-1000);
        company2.payTaxes();

        System.out.println("---------------------------------------------------");

        Deal[] deals = {
                new Sale("sale1", 5000),
                new Expenditure("expenditure", 2000),
                new Sale("sale2", 8000)
        };

        int result = company1.applyDeals(deals);
        System.out.println("Разница доходов и расходов после сделок: " + result + " руб.");
    }
}