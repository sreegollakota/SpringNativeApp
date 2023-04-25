package com.example.demo.service;

import java.time.LocalDate;

public interface BirthdayService {
    LocalDate getValidBirthday(String birthdayString) ;

    String getBirthDateOfWeek(LocalDate birthday);

    String getStarSign(LocalDate birthday) ;
}
