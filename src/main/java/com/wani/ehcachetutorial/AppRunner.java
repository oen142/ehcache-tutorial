package com.wani.ehcachetutorial;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final BookCacheRepository bookCacheRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("...fetching books");
        logger.info("isbn-1111 : " + bookCacheRepository.getByIsbn("isbn-1111") );
        logger.info("isbn-2222 : " + bookCacheRepository.getByIsbn("isbn-2222") );
        logger.info("isbn-1111 : " + bookCacheRepository.getByIsbn("isbn-1111") );
        logger.info("isbn-2222 : " + bookCacheRepository.getByIsbn("isbn-2222") );
        logger.info("isbn-1111 : " + bookCacheRepository.getByIsbn("isbn-1111") );
    }
}
