package currency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Currency {
	
	private final String currencyName;
	private final String currencyCode;
	private final BigDecimal currencyRate;
	
	public Currency(String currencyName, String currencyCode, BigDecimal currencyRate) {
		this.currencyName = currencyName;
		this.currencyCode = currencyCode;
		this.currencyRate = currencyRate;
	}
	
	public Currency(String currencyName, String currencyCode, String currencyRate) {
		this(currencyName, currencyCode, new BigDecimal(currencyRate));
	}

	public String getName() {
		return currencyName;
	}

	public String getCode() {
		return currencyCode;
	}

	public BigDecimal getRate() {
		return currencyRate;
	}
	
	public BigDecimal exchangeToPln(BigDecimal amount) {
		return amount.multiply(currencyRate).setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal exchangeFromPln(BigDecimal amount) {
		return amount.divide(currencyRate, 2, RoundingMode.HALF_UP);
	}

	@Override
	public String toString() {
		return currencyCode + " (" + currencyName + ") " + currencyRate;
	}
}
