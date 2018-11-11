package lt.vtvpmc.ems.akademijait.egzaminas;

import lt.itakademija.exam.Currency;
import lt.itakademija.exam.CurrencyConversionException;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.Money;

public class CurrencyConverterImpl implements CurrencyConverter {
    private final CurrencyRatesProvider currencyRatesProvider;

    public CurrencyConverterImpl(CurrencyRatesProvider currencyRatesProvider){
        this.currencyRatesProvider = currencyRatesProvider;
    }

    @Override
    public Money convert(Currency from, Currency to, Money amount) {
        Money rate = currencyRatesProvider.getRate(from, to);
        if(rate == null) {
            throw new CurrencyConversionException("Could not convert currency...");
        }

        return amount.multiply(rate);
    }

}