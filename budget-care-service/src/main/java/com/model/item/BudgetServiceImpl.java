package com.model.item;

import com.dao.item.ExpenseDao;
import com.dao.item.IncomeDao;
import com.dao.item.ItemCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private IncomeDao incomeDao;

    @Autowired
    private ExpenseDao expenseDao;

    @Autowired
    private ItemCategoryDao itemCategoryDao;

}
