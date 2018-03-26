package com.model.budget;

import com.model.item.Income;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.model.CoreEntity;
import com.model.item.Expense;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Month;
import java.util.List;


@Entity(name = "Budget")
@Table(name = "budget")
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class Budget extends CoreEntity {

    @OneToMany(mappedBy = "budget")
    private List<Income> incomesList;

    @OneToMany(mappedBy = "budget")
    private List<Expense> expencesList;

    @Enumerated
    @Column(name = "budget_period")
    private Month budgetPeriod;

    public static Builder getBulider() {
        return new Builder();
    }

    public static class Builder {

        private Budget instance;

        private Builder() {
            this.instance = new Budget();
        }

        public Builder setMonth(Month budgetPeriod) {
            instance.budgetPeriod = budgetPeriod;
            return this;
        }

        public Builder setIncomesList(List<Income> incomesList) {
            instance.incomesList = incomesList;
            return this;
        }

        public Builder setExpencesList(List<Expense> expencesList) {
            instance.expencesList = expencesList;
            return this;
        }

        public Budget build() {
            return instance;
        }

    }

}
