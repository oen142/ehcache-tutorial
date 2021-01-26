package com.wani.ehcachetutorial;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


@Component
public class BookCacheRepository {

    @Cacheable("books")
    public BookDto getByIsbn(String isbn) {
        simulateSlowService();
        return BookDto.builder()
                .isbn(isbn)
                .title("book")
                .build();
    }

    private void simulateSlowService() {
        try {
            long time = 2000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
