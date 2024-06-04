package taxes;

public class USNCreditTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) (debit * 0.06);
        return tax > 0 ? tax : 0;
    }
}
