package com.dao.item;


import com.dao.DaoTestConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.model.amount.CurrencyAmount;
import com.model.budget.Budget;
import com.model.item.Expense;
import com.model.item.ItemCategory;
import com.model.item.ItemGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Currency;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DaoTestConfiguration.class)
@DataJpaTest
public class ExpenseDaoTest {

    @Autowired
    private ExpenseDao expenseDao;

    @Test
    public void testSave() {
        Budget budget = Budget.getBulider().setMonth(Month.NOVEMBER).build();
        ItemCategory category = prepareItemCategory();
        Expense expense = prepareExpense(budget, category);

        expenseDao.save(expense);

        assertThat(expenseDao.findAll()).containsExactly(expense);
    }

    private Expense prepareExpense(Budget budget, ItemCategory category) {
        return Expense.getBuilder()
                .setBudget(budget)
                .setCurrencyAmount(new CurrencyAmount(Currency.getInstance("USD"), BigDecimal.TEN))
                .setDescription("Monthly salary")
                .setItemCategory(category)
                .setOperationTime(ZonedDateTime.of(2017, 1, 12, 12, 0, 0, 0, ZoneId.of("UTC")))
                .build();
    }

    private ItemCategory prepareItemCategory() {
        return ItemCategory.getBuilder()
                .setItemGroup(ItemGroup.INCOME)
                .setCathegoryName("Salary")
                .build();
    }
}
