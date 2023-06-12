public class DistanceConverterAdapter implements CurrencyMeasureTarget{
    private UnitConverter unitConverter;

    public DistanceConverterAdapter(UnitConverter unitConverter) {
        this.unitConverter = unitConverter;
    }

    @Override
    public CurrencyMeasure convert(CurrencyMeasure measure, CurrencyUnit target) {
        double convertedValue = unitConverter.convert(measure.getValue());
        return new CurrencyMeasure(convertedValue, target);
    }
}
