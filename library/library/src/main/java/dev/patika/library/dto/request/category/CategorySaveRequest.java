package dev.patika.library.dto.request.category;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorySaveRequest {
    @NotNull(message = "Kategori Boş Olamaz")
    @NotEmpty
    private String name;

}
