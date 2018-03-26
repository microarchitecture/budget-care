package com.dao.item;

import com.model.item.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("expenseDao")
public interface ExpenseDao extends JpaRepository<Expense, Long> {
}
