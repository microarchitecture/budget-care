package com.model.item;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.model.CoreEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static com.model.item.ItemGroup.*;

@Entity(name = "ItemCategory")
@Table(name = "item_category")
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class ItemCategory extends CoreEntity {

    private static final Set<DefaultItemCategories> INCOME_ITEM_CATEGORIES = DefaultItemCategories.getCategories(INCOME);
    private static final Set<DefaultItemCategories> OUTCOME_ITEM_CATEGORIES = DefaultItemCategories.getCategories(OUTCOME);

    @Column(name = "item_group")
    @Enumerated(value = EnumType.STRING)
    private ItemGroup itemGroup;

    @Column(name = "cathegory_name")
    private String cathegoryName;

    public static Set<DefaultItemCategories> getIncomeItemCategories() {
        return INCOME_ITEM_CATEGORIES;
    }

    public static Set<DefaultItemCategories> getOutcomeItemCategories() {
        return OUTCOME_ITEM_CATEGORIES;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private ItemCategory instance;

        private Builder() {
            this.instance = new ItemCategory();
        }

        public Builder setItemGroup(ItemGroup itemGroup) {
            instance.itemGroup = itemGroup;
            return this;
        }

        public Builder setCathegoryName(String cathegoryName) {
            instance.cathegoryName = cathegoryName;
            return this;
        }

        public ItemCategory build() {
            return instance;
        }

    }

    enum DefaultItemCategories {

        SALARY(INCOME),
        RENT(OUTCOME),
        MORTGAGE(OUTCOME),
        UTILITY_BILLS(OUTCOME);

        private ItemGroup itemGroup;

        DefaultItemCategories(ItemGroup itemGroup) {
            this.itemGroup = itemGroup;
        }

        ItemGroup getItemGroup() {
            return itemGroup;
        }

        public static Set<DefaultItemCategories> getCategories(ItemGroup itemGroup) {
            return Arrays.stream(DefaultItemCategories.values()).filter(category -> category.equals(itemGroup)).collect(Collectors.toSet());
        }
    }

}
