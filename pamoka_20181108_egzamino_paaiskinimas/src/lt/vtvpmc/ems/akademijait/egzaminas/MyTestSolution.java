package lt.vtvpmc.ems.akademijait.egzaminas;

import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;

public class MyTestSolution extends BaseTest {

    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {
        return new BankImpl(currencyConverter);
    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return new CurrencyConverterImpl (currencyRatesProvider) {
        };
    }
}
