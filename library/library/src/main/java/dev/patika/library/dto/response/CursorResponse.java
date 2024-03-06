package dev.patika.library.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CursorResponse<T> {
    public int pageNumber;
    public int pageSize;
    private long totalElements;
    private List<T> items;

}
