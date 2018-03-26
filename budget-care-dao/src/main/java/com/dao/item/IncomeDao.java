package com.dao.item;

import com.model.item.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("incomeDao")
public interface IncomeDao extends JpaRepository<Income, Long> {
}
