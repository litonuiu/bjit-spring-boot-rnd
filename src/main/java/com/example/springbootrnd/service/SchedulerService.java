package com.example.springbootrnd.service;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Md. Liton Miah
 * Created on April 05, 2023 at 10:59 AM
 */

@Service
@EnableScheduling
public class SchedulerService {

    /*@Scheduled(fixedDelay = 1000)
    public void fixedDelay(){
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
    }

    @Scheduled(fixedRate = 1000)
    public void fixedRate(){
        System.out.println(
                "Fixed rate task - " + System.currentTimeMillis() / 1000);
    }*/

    @Scheduled(cron = "1 42 11 * * *")
    // second, minute, hour, day of month, month, day(s) of week
    public void cronJob(){
        System.out.println(
                "Cron task - " + System.currentTimeMillis() / 1000);
    }
}
