package com.model.item;

import com.model.amount.CurrencyAmount;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.model.budget.Budget;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity(name = "Income")
@Table(name = "income")
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class Income extends Item {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "budget_id")
    private Budget budget;

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private Income instance;

        private Builder() {
            this.instance = new Income();
        }

        public Builder setCurrencyAmount(CurrencyAmount currencyAmount) {
            instance.amount = currencyAmount;
            return this;
        }

        public Builder setOperationTime(ZonedDateTime operationTime) {
            instance.operationTime = operationTime;
            return this;
        }

        public Builder setDescription(String description) {
            instance.description = description;
            return this;
        }

        public Builder setItemCategory(ItemCategory category) {
            instance.category = category;
            return this;
        }

        public Builder setBudget(Budget budget) {
            instance.budget = budget;
            return this;
        }

        public Income build() {
            return instance;
        }

    }

}
