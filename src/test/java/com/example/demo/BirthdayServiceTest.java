package com.example.demo;

import com.example.demo.controller.BirthdayInfoController;
import com.example.demo.service.BirthdayService;
import com.example.demo.service.BirthdayServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class BirthdayServiceTest {

    //@InjectMocks
    BirthdayServiceImpl birthdayService = new BirthdayServiceImpl();

    private LocalDate localDate;
//    @Test
//    public void getValidBirthdayTest(){
//        when(birthdayService.getValidBirthday("2020-06-25")).thenReturn(localDate);
//        localDate= birthdayService.getValidBirthday("2020-06-25");
//        assertNotEquals(localDate,null);
//        //assertEquals(localDate.getDayOfMonth(),06);
//    }
    @Test
    void testGetBirthdayDateOfWeek() {
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
