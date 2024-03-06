package dev.patika.library.api;

import dev.patika.library.business.abstracts.ICategoryService;
import dev.patika.library.core.config.modelMapper.IModelMapperService;
import dev.patika.library.core.result.ResultData;
import dev.patika.library.core.utilies.ResultHelper;
import dev.patika.library.dto.request.category.CategorySaveRequest;
import dev.patika.library.dto.request.category.CategoryUpdateRequest;
import dev.patika.library.dto.response.CursorResponse;
import dev.patika.library.dto.response.category.CategoryResponse;
import dev.patika.library.entities.Category;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {
    private final ICategoryService categoryService;
    private final IModelMapperService modelMapper;

    public CategoryController(ICategoryService categoryService, IModelMapperService modelMapper) {
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<CategoryResponse> save(@Valid @RequestBody CategorySaveRequest CategorySaveRequest) {
        Category saveCategory = this.modelMapper.forRequest().map(CategorySaveRequest, Category.class);
      this.categoryService.save(saveCategory);
        return ResultHelper.created(this.modelMapper.forRequest().map(saveCategory, CategoryResponse.class));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CategoryResponse> get(@PathVariable("id")int id){
        Category category = this.categoryService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(category, CategoryResponse.class));
    }
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<CategoryResponse>> cursor(
            @RequestParam(name = "page",required = false,defaultValue = "0")int page,
            @RequestParam(name = "pageSize",required = false,defaultValue = "2")int pageSize
    ){
        Page<Category> categoryPage = this.categoryService.cursor(page, pageSize);
        Page<CategoryResponse> categoryResponsePage =  categoryPage
                .map(category -> this.modelMapper.forRequest().map(category ,CategoryResponse.class));
        return ResultHelper.cursor(categoryResponsePage);
    }
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CategoryResponse> update(@Valid @RequestBody CategoryUpdateRequest categoryUpdateRequest) {
        Category updateCategory = this.modelMapper.forRequest().map(categoryUpdateRequest, Category.class);
        this.categoryService.save(updateCategory);
        return ResultHelper.success(this.modelMapper.forRequest().map(updateCategory, CategoryResponse.class));
    }
}
