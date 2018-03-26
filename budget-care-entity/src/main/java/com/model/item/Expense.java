package com.model.item;

import com.model.amount.CurrencyAmount;
import com.model.budget.Budget;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity(name = "Expence")
@Table(name = "expence")
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class Expense extends Item {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "budget_id")
    private Budget budget;

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private Expense instance;

        private Builder() {
            this.instance = new Expense();
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

        public Expense build() {
            return instance;
        }

    }

}
