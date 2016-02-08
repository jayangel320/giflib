package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jaybob320 on 2/8/16.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category("Technology", 1),
            new Category("People", 2),
            new Category("Destruction", 3)
    );


    public List<Category> getAllCategories() {
     return ALL_CATEGORIES;
    }

    public Category findById(int id){
        for(Category cat: ALL_CATEGORIES)
        {
            if(id == cat.getId())
            {
                return cat;
            }
        }
        return null;
    }

}

