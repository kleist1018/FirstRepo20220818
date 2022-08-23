package com.softusing.domain;

import lombok.Data;

import java.util.List;

@Data
public class PageUnitOfScore<T> {
    private int totalCount;
    private List<T> scoreRowsInPage;

}
