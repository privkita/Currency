package currency;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Table {
	
	private final String TableNumber; 
	private final LocalDate TableDate;
	private Map<String, Currency> currencies = new TreeMap<String, Currency>();
	private static final String[] EMPTY_TABLE = new String[0];
	
	public Table() {
		TableNumber = null;
		TableDate = null;
	}
	
	public Table(String tableNumber, LocalDate tableDate) {
		TableNumber = tableNumber;
		TableDate = tableDate;
	}

	public String getTableNumber() {
		return TableNumber;
	}

	public LocalDate getTableDate() {
		return TableDate;
	}

	@Override
	public String toString() {
		return "Tabela nr: " + TableNumber + ", z dnia: " + TableDate + 
				"(liczba walut: " + currencies.size() + ")";
	}
	
	public void addCurrency(Currency currency) {
		currencies.put(currency.getCode(), currency);
	}
	
	public Currency findCurrency(String code) {
		return currencies.get(code);
	}
	
	public Collection<Currency> getAllCurrencies() {
		return currencies.values();
	}
	
	public String[] getCurrenciesCodes() {
		return currencies.keySet().toArray(EMPTY_TABLE);
	}
	
	public String[] getCurrenciesSet() {
		int i = 0;
		String[] currenciesSet = new String[currencies.size()];
		for (Entry<String, Currency> currency : currencies.entrySet())
			currenciesSet[i++] = currency.getKey() + "   " + (currency.getValue().getName());
		return currenciesSet;
	}
}
