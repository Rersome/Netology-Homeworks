package taxes;

public class USNDebitMinusCreditTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int difference = debit - credit;
        int tax = (int) (difference * 0.15);
        return tax > 0 ? tax : 0;
    }
}
