package com.fidelity.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Price {
    
	private BigDecimal bidPrice;
    private BigDecimal askPrice;
    private LocalDate timeStamp;
    private Instrument instrument;


  public Price() {
    }





  public Price(BigDecimal bidPrice, BigDecimal askPrice, LocalDate timeStamp, Instrument instrument) {
        super();
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
        this.timeStamp = timeStamp;
        this.instrument = instrument;
    }

  public BigDecimal getBidPrice() {
        return bidPrice;
    }

  public BigDecimal getAskPrice() {
        return askPrice;
    }

  public LocalDate getTimeStamp() {
        return timeStamp;
    }

  public Instrument getInstrument() {
        return instrument;
    }

  @Override
    public int hashCode() {
        return Objects.hash(askPrice, bidPrice, instrument, timeStamp);
    }

  @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Price other = (Price) obj;
        return Objects.equals(askPrice, other.askPrice) && Objects.equals(bidPrice, other.bidPrice)
                && Objects.equals(instrument, other.instrument) && Objects.equals(timeStamp, other.timeStamp);
    }

  @Override
    public String toString() {
        return "Price [bidPrice=" + bidPrice + ", askPrice=" + askPrice + ", timeStamp=" + timeStamp + ", instrument="
                + instrument + "]";
  }
}