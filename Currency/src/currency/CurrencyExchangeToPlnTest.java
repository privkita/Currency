package currency;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class CurrencyExchangeToPlnTest {

	@Test
	void testExchangeToPln() {
		Currency currency = new Currency("USD", "dolar amerykański", "3.4214");
		BigDecimal amount = new BigDecimal("100");
		BigDecimal expected = new BigDecimal("342.14");
		
		BigDecimal actual = currency.exchangeToPln(amount);
		
		assertEquals(expected, actual);
	}
	@Test
	void testExchangeToPln2() {
		Currency currency = new Currency("USD", "dolar amerykański", "3.4214");
		BigDecimal amount = new BigDecimal("10");
		BigDecimal expected = new BigDecimal("34.21");
		
		BigDecimal actual = currency.exchangeToPln(amount);
		
		assertEquals(expected, actual);
	}
	@Test
	void testExchangeToPln3() {
		Currency currency = new Currency("JPY", "jen (Japonia)", "0.032363");
		BigDecimal amount = new BigDecimal("1000000");
		BigDecimal expected = new BigDecimal("32363.00");
		
		BigDecimal actual = currency.exchangeToPln(amount);
		
		assertEquals(expected, actual);
	}
	@Test
	void testExchangeToPln4() {
		Currency currency = new Currency("JPY", "jen (Japonia)", "0.032363");
		BigDecimal amount = new BigDecimal("100");
		BigDecimal expected = new BigDecimal("3.24");
		
		BigDecimal actual = currency.exchangeToPln(amount);
		
		assertEquals(expected, actual);
	}

}
