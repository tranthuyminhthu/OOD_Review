package currencyConverter;
import java.util.HashMap;
import java.util.Map;

public class OtherCurrencyMeasureAdaptee{
    private Map<CurrencyUnit, Double> exchangeRates;
    public OtherCurrencyMeasureAdaptee() {
        exchangeRates = new HashMap<>();
        exchangeRates.put(new CurrencyUnit("VND"), 22505.0);
        exchangeRates.put(new CurrencyUnit("JPY"), 111.8);
        exchangeRates.put(new CurrencyUnit("EUR"), 0.89);
        exchangeRates.put(new CurrencyUnit("GBP"), 0.77);
        exchangeRates.put(new CurrencyUnit("USD"), 1.0);
    }
    public CurrencyMeasure reciveCurrencyMeasure(CurrencyMeasure measure , CurrencyUnit targetUnit){
        //  Chuyển đổi lượng tiền MA của đơn vị tiền tệ measure thành lượng tiền MS của đơn vị tiền tệ cơ sở
        double baseValue = measure.getValue() / exchangeRates.get(measure.getUnit());
        // Chuyển đổi lượng tiền MS của đơn vị tiền tệ cơ sở thành lượng tiền MB của đơn vị tiền tệ targetUnit
        double targetValue = baseValue * exchangeRates.get(targetUnit);
        return new CurrencyMeasure(targetValue, targetUnit);
    }


}
