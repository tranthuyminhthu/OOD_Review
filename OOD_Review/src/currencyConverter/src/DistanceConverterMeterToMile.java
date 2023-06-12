public class DistanceConverterMeterToMile implements UnitConverter{
    @Override
    public double convert(double value) {
        return value/1609.344;
    }
}
