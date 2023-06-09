package com.example.demo;

import com.example.demo.service.BirthdayServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDate;

//@SpringBootTest
class SpringNativeAppApplicationTests {
    BirthdayServiceImpl birthdayService = new BirthdayServiceImpl();

    @Test
    void testGetBirthdayDOW() {
        String dow = birthdayService.getBirthDateOfWeek(LocalDate.of(1979, 7, 14));
        assertEquals("SATURDAY", dow);
        dow = birthdayService.getBirthDateOfWeek(LocalDate.of(2018, 1, 23));
        assertEquals("TUESDAY", dow);
        dow = birthdayService.getBirthDateOfWeek(LocalDate.of(1972, 3, 17));
        assertEquals("FRIDAY", dow);
        dow = birthdayService.getBirthDateOfWeek(LocalDate.of(1945, 12, 2));
        assertEquals("SUNDAY", dow);
        dow = birthdayService.getBirthDateOfWeek(LocalDate.of(2003, 8, 4));
        assertEquals("MONDAY", dow);
    }

    @Test
    void testGetBirthdayStarSign() {
        String dow = birthdayService.getStarSign(LocalDate.of(1979, 7, 14));
        assertEquals("Cancer", dow);
        dow = birthdayService.getStarSign(LocalDate.of(2018, 1, 23));
        assertEquals("Aquarius", dow);
        dow = birthdayService.getStarSign(LocalDate.of(1972, 3, 17));
        assertEquals("Pisces", dow);
        dow = birthdayService.getStarSign(LocalDate.of(1945, 12, 2));
        assertEquals("Sagittarius", dow);
        dow = birthdayService.getStarSign(LocalDate.of(2003, 8, 4));
        assertEquals("Leo", dow);
    }

}
