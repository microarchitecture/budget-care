package com.model.amount;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.util.Currency;

@Embeddable
@Getter @Setter @EqualsAndHashCode
public class CurrencyAmount {

    @Column(name = "currency", nullable = false)
    private Currency currency;
    @Column(name = "amount", nullable = false, precision = 20 , scale = 2 )
    private BigDecimal amount;

    public CurrencyAmount(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }
}
