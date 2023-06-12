public class CurrencyMeasure{
    private double value;
    private CurrencyUnit unit;

    public CurrencyMeasure(double value, CurrencyUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public CurrencyUnit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return value + " " + unit
                ;
    }
}
