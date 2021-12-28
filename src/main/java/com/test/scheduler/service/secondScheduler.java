package com.test.scheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class secondScheduler {

//    @Scheduled(cron = "0 * * * * ?") // Test each minute
    @Scheduled(fixedDelay = 5000) // Tech each 5 seconds
    public void secondScheduler() throws InterruptedException {
        log.info("Second scheduler MAIN");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            log.info("Second scheduler inside for " + i+1);
        }
    }
}
