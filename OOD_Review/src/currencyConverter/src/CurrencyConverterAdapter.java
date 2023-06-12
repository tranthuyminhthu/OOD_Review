public class CurrencyConverterAdapter implements CurrencyMeasureTarget{
    private OtherCurrencyMeasureAdaptee otherCurrencyMeasureAdaptee;

    public CurrencyConverterAdapter(OtherCurrencyMeasureAdaptee otherCurrencyMeasureAdaptee) {
        this.otherCurrencyMeasureAdaptee = otherCurrencyMeasureAdaptee;
    }


    @Override
    public CurrencyMeasure convert(CurrencyMeasure measure, CurrencyUnit target) {
        return otherCurrencyMeasureAdaptee.reciveCurrencyMeasure(measure, target);
    }
}
