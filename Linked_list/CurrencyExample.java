package Linked_list;

import java.util.Currency;
import java.util.Locale;

public class CurrencyExample {
    public static void main(String[] args) {
        // Get currency instance for a specific locale (e.g., US)
        Currency usd = Currency.getInstance(Locale.US);
        System.out.println("Currency Code: " + usd.getCurrencyCode());
        System.out.println("Symbol: " + usd.getSymbol());
        System.out.println("Default Fraction Digits: " + usd.getDefaultFractionDigits());

        // Get currency instance for another locale (e.g., Japan)
        Currency jpy = Currency.getInstance(Locale.JAPAN);
        System.out.println("\nCurrency Code: " + jpy.getCurrencyCode());
        System.out.println("Symbol: " + jpy.getSymbol());
        System.out.println("Default Fraction Digits: " + jpy.getDefaultFractionDigits());

        // Get currency by code directly
        Currency eur = Currency.getInstance("EUR");
        System.out.println("\nCurrency Code: " + eur.getCurrencyCode());
        System.out.println("Symbol: " + eur.getSymbol(Locale.FRANCE));
        System.out.println("Default Fraction Digits: " + eur.getDefaultFractionDigits());
    }
}