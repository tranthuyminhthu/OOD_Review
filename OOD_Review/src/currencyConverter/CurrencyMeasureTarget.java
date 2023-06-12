package currencyConverter;

public interface CurrencyMeasureTarget {
    CurrencyMeasure convert(CurrencyMeasure measure, CurrencyUnit target);
}
