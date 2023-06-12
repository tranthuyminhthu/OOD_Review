package currencyConverter;

public class DistanceConverterMeterToYard implements UnitConverter{
    @Override
    public double convert(double value) {
        return value/ 0.9144;
    }
}
