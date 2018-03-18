package currency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Currency {
	
	private final String name;
	private final String code;
	private final BigDecimal rate;
	
	public Currency(String name, String code, BigDecimal rate) {
		this.name = name;
		this.code = code;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public BigDecimal getRate() {
		return rate;
	}
	
	public BigDecimal exchangeToPln(BigDecimal amount) {
		return amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal exchangeFromPln(BigDecimal amount) {
		return amount.divide(rate, 2, RoundingMode.HALF_UP);
	}

	@Override
	public String toString() {
		return code + " (" + name + ") " + rate;
	}
}
