package dev.patika.library.business.concrete;

import dev.patika.library.business.abstracts.ICategoryService;
import dev.patika.library.core.exception.NotFoundException;
import dev.patika.library.core.utilies.Msg;
import dev.patika.library.dao.ICategoryRepo;
import dev.patika.library.entities.Category;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
@Repository
public class CategoryManager implements ICategoryService {
    private final ICategoryRepo categoryRepo;

    public CategoryManager(ICategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    @PostMapping
    @ResponseStatus
    public Category save(@Valid @RequestBody Category category) {
        return this.categoryRepo.save(category);
    }

    @Override
    public Category get(long id) {
        return this.categoryRepo.findById((int) id).orElseThrow(() ->  new NotFoundException(Msg.NOT_FOUND));
    }

    @Override
    public Page<Category> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page , pageSize);
        return this.categoryRepo.findAll(pageable);
    }
}
