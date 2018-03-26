package com.dao.item;

import com.dao.DaoTestConfiguration;
import com.model.item.ItemCategory;
import com.model.item.ItemGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DaoTestConfiguration.class)
@DataJpaTest
public class ItemCategoryDaoTest {

    @Autowired
    private ItemCategoryDao itemCategoryDao;

    @Test
    public void testSaveItemCategory() {
        ItemCategory itemCategory = ItemCategory.getBuilder()
                .setCathegoryName("New category")
                .setItemGroup(ItemGroup.INCOME)
                .build();

        itemCategoryDao.save(itemCategory);

        assertThat(itemCategoryDao.findAll()).containsExactly(itemCategory);
    }
}
