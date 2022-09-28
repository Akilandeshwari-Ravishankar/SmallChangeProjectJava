package com.fidelity.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TradeHistory {
	private String instrumentId;
	private BigDecimal quantity;
	private BigDecimal executionPrice;
	private String direction ;
	private String clientId;
	private String tradeId;
	private BigDecimal cashValue ;
	
	
	
	public TradeHistory(String instrumentId, BigDecimal quantity, BigDecimal executionPrice, String direction,
			String clientId, String tradeId, BigDecimal cashValue) {
		if(instrumentId == null || clientId == null || tradeId == null || instrumentId.isEmpty() || clientId.isEmpty() || tradeId.isEmpty())
			throw new IllegalArgumentException("instument id,client id , trade id cannot be null or empty");
		setInstrumentId(instrumentId);
		setQuantity(quantity);
		setExecutionPrice(executionPrice);
		setDirection(direction);
		setClientId(clientId);
		setTradeId(tradeId);
		setCashValue(cashValue);
	}
	
	
	public String getInstrumentId() {
		return instrumentId;
	}
	public void setInstrumentId(String instrumentId) {
		if(instrumentId == null || instrumentId.isEmpty())
			throw new IllegalArgumentException("instrument id cannot be null");
		this.instrumentId = instrumentId;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getExecutionPrice() {
		return executionPrice;
	}
	public void setExecutionPrice(BigDecimal executionPrice) {
		this.executionPrice = executionPrice;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getClientId() {
		
		return clientId;
	}
	public void setClientId(String clientId) {
		if(clientId == null)
			throw new IllegalArgumentException("client id cannot be null");
		this.clientId = clientId;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		if(tradeId == null)
			throw new IllegalArgumentException("trade id cannot be null");
		this.tradeId = tradeId;
	}
	public BigDecimal getCashValue() {
		return cashValue;
	}
	public void setCashValue(BigDecimal cashValue) {
		this.cashValue = cashValue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cashValue == null) ? 0 : cashValue.hashCode());
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + ((executionPrice == null) ? 0 : executionPrice.hashCode());
		result = prime * result + ((instrumentId == null) ? 0 : instrumentId.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TradeHistory other = (TradeHistory) obj;
		if (cashValue == null) {
			if (other.cashValue != null)
				return false;
		} else if (!cashValue.equals(other.cashValue))
			return false;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (direction == null) {
			if (other.direction != null)
				return false;
		} else if (!direction.equals(other.direction))
			return false;
		if (executionPrice == null) {
			if (other.executionPrice != null)
				return false;
		} else if (!executionPrice.equals(other.executionPrice))
			return false;
		if (instrumentId == null) {
			if (other.instrumentId != null)
				return false;
		} else if (!instrumentId.equals(other.instrumentId))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (tradeId == null) {
			if (other.tradeId != null)
				return false;
		} else if (!tradeId.equals(other.tradeId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TradeHistory [instrumentId=" + instrumentId + ", quantity=" + quantity + ", executionPrice="
				+ executionPrice + ", direction=" + direction + ", clientId=" + clientId + ", tradeId=" + tradeId
				+ ", cashValue=" + cashValue + "]";
	}
	
	
	

}
