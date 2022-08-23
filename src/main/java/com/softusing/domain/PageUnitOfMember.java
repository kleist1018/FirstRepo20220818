package com.softusing.domain;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageUnitOfMember<T> {
    private Integer totalCount;
    private List<T> memberRowsInPage;

}
