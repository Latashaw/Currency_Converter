package latasha.CurrencyConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by latashawatson on 2/16/17.
 */
public class CurrencyConverter {
    Map<String, Double> conversionRates = new HashMap<>();

    public CurrencyConverter(){
        conversionRates.put("Us Dollar", 1.00);
        conversionRates.put("Euro", .94);
        conversionRates.put("British Pound", .82);
        conversionRates.put("Indian Rupee", 68.32);
        conversionRates.put("Australian Dollar", 1.35);
        conversionRates.put("Canadian Dollar", 1.32);
        conversionRates.put("Singapore Dollar", 1.43);
        conversionRates.put("Swiss Franc", 1.01);
        conversionRates.put("Malaysian Ringgit", 4.47);
        conversionRates.put("Japanese Yen", 115.84);
        conversionRates.put("Chinese Yuan", 6.92);
    }

    public double convert(String baseRate, String desiredRate, double amount){
        double desiredAmount= Math.floor((conversionRates.get(desiredRate) * amount)/conversionRates.get(baseRate)*100);
                                return desiredAmount/100;

    }
}
