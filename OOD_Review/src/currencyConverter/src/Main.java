public class Main {
    public static void main(String[] args) {
        CurrencyMeasureTarget client = new CurrencyConverterAdapter(new OtherCurrencyMeasureAdaptee());
        CurrencyMeasure currencyMeasure = client.convert(new CurrencyMeasure(10000, new CurrencyUnit("VND")), new CurrencyUnit("JPY"));

        CurrencyMeasureTarget client2 = new DistanceConverterAdapter(new DistanceConverterMeterToYard());
        CurrencyMeasure c1 = client2.convert(new CurrencyMeasure( 0.9144, new CurrencyUnit("M")), new CurrencyUnit("Y"));
        System.out.println(c1);
    }
}