package latasha.CurrencyConverter;

/**
 * Created by latashawatson on 2/21/17.
 */
public class Controller {
    CurrencyConverter cc;
    Display d;

    public Controller() {
        cc = new CurrencyConverter();
        d = new Display();
    }

    public void runCurrencyConverter() {
        d.println("Welcome to WuTang Financial Currency Converter!");
        String baseCurrency = baseCurrencyPrompt();
        String desiredCurrency = desiredCurrencyPrompt();
        double baseAmount = d.getDoubleInput("How much would you like to convert?");
        double desiredAmount = cc.convert(baseCurrency, desiredCurrency, baseAmount);
        System.out.println("Your converted amount is" + desiredAmount);
    }

    public String baseCurrencyPrompt() {
        String baseCurrency = d.getStringInput("Please enter the currency type you will be converting from in the following format:" + '\n' +
                "[ Us Dollar ] [ Euro ] [ British Pound ] [ Indian Rupee ] [ Australian Dollar ] [ Canadian Dollar ] [ Singapore Dollar ] " + '\n' +
                "[ Swiss Franc ] [ Malaysian Ringgit ] [ Japanese Yen ] [ Chinese Yuan ] ");
        if (!(cc.conversionRates.containsKey(baseCurrency))) {
            System.out.println("Invalid Entry");
            baseCurrencyPrompt();
        }
        return baseCurrency;
    }

    public String desiredCurrencyPrompt() {
        String desiredCurrency = d.getStringInput("Please enter the desired currency in the following format:" + '\n' +
                "[ Us Dollar ] [ Euro ] [ British Pound ] [ Indian Rupee ] [ Australian Dollar ] [ Canadian Dollar ] [ Singapore Dollar ] " + '\n' +
                "[ Swiss Franc ] [ Malaysian Ringgit ] [ Japanese Yen ] [ Chinese Yuan ] ");
        if (!(cc.conversionRates.containsKey(desiredCurrency))) {
            System.out.println("Invalid Entry");
            desiredCurrencyPrompt();
        }
        return desiredCurrency;
    }

}
