package dev.patika.library.business.abstracts;

import dev.patika.library.entities.Category;
import org.springframework.data.domain.Page;

public interface ICategoryService {
    Category save(Category category);

    Category get(long id);

    Page<Category> cursor(int page, int pageSize);

}
