package com.dao.item;

import com.model.item.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("itemCategoryDao")
public interface ItemCategoryDao extends JpaRepository<ItemCategory, Long> {
}
