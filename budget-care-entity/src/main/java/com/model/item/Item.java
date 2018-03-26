package com.model.item;

import com.model.amount.CurrencyAmount;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.model.CoreEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.ZonedDateTime;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter @NoArgsConstructor
public class Item extends CoreEntity {

    @Embedded
    protected CurrencyAmount amount;

    @Column(name = "operation_time")
    protected ZonedDateTime operationTime;

    @Column(name = "description")
    protected String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    protected ItemCategory category;

}
