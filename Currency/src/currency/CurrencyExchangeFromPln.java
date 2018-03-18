package currency;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class CurrencyExchangeFromPln {

	@Test
	void testExchangeFromPln() {
		Currency currency = new Currency("USD", "dolar amerykański", "3.4214");
		BigDecimal amount = new BigDecimal("100");
		BigDecimal expected = new BigDecimal("29.23");
		
		BigDecimal actual = currency.exchangeFromPln(amount);
		
		assertEquals(expected, actual);
	}
	@Test
	void testExchangeToPln2() {
		Currency currency = new Currency("USD", "dolar amerykański", "3.4214");
		BigDecimal amount = new BigDecimal("10");
		BigDecimal expected = new BigDecimal("2.92");
		
		BigDecimal actual = currency.exchangeFromPln(amount);
		
		assertEquals(expected, actual);
	}
	@Test
	void testExchangeToPln3() {
		Currency currency = new Currency("JPY", "jen (Japonia)", "0.032363");
		BigDecimal amount = new BigDecimal("1000000");
		BigDecimal expected = new BigDecimal("30899483.98");
		
		BigDecimal actual = currency.exchangeFromPln(amount);
		
		assertEquals(expected, actual);
	}
	@Test
	void testExchangeToPln4() {
		Currency currency = new Currency("JPY", "jen (Japonia)", "0.032363");
		BigDecimal amount = new BigDecimal("100");
		BigDecimal expected = new BigDecimal("3089.95");
		
		BigDecimal actual = currency.exchangeFromPln(amount);
		
		assertEquals(expected, actual);
	}

}
