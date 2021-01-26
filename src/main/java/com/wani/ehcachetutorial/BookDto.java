package com.wani.ehcachetutorial;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class BookDto {

    private Long id;
    private String isbn;
    private String title;

}