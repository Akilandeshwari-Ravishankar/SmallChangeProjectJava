package com.fidelity.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TradeHistoryTest {
	
	TradeHistory tradeHistory;

	@BeforeEach
	void setUp() throws Exception {
		tradeHistory = new TradeHistory("123ab", BigDecimal.TEN, BigDecimal.ONE, "1234", "1234", "td123", LocalDate.now());
	}
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testObjectCreation() {
		
		assertNotNull(tradeHistory);
		
	}
	
	@Test
	void testObjectCreation_passing_null_throws_Exception() {
		assertThrows(IllegalArgumentException.class,()-> {
			new TradeHistory(null, BigDecimal.TEN, BigDecimal.ONE, "1234", "1234", "td123", LocalDate.now());
		});
		}
	
	
	@Test
	void testObjectEquality() {
		TradeHistory tradeHistory1 = new TradeHistory("123ab", BigDecimal.TEN, BigDecimal.ONE, "1234", "1234", "td123", LocalDate.now());
		assertEquals(tradeHistory, tradeHistory1);
		
	}
	@Test
	void testObjectInquality() {
		TradeHistory tradeHistory1 = new TradeHistory("13ab", BigDecimal.TEN, BigDecimal.ONE, "1234", "1234", "td123", LocalDate.now());
		assertNotEquals(tradeHistory, tradeHistory1);
	}
	
	@Test
	void testHashCode() {
		TradeHistory tradeHistory1 = new TradeHistory("123ab", BigDecimal.TEN, BigDecimal.ONE, "1234", "1234", "td123", LocalDate.now());
		assertEquals(tradeHistory.hashCode(), tradeHistory1.hashCode());
	}
	
	
}
