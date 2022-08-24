package com.softusing.domain;

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
