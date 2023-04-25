package com.example.demo.controller;

import com.example.demo.service.BirthdayService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.format.DateTimeFormatter;
import java.util.Collections;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BirthdayInfoController.class)
public class BirthdayInfoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BirthdayService birthdayService;

    private LocalDate birthDate;
    private String strBirthDate;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Test
    public void getDayOfWeekTest() throws Exception{
        when(birthdayService.getBirthDateOfWeek(LocalDate.parse("2001-02-20",formatter))).thenReturn(strBirthDate);
        mockMvc.perform(
                post("/birthday/dayOfWeek")
                .content(objectMapper.writeValueAsBytes("2001-02-20"))
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());

                //.andExpect((ResultMatcher) content().contentType())
                //.andExpect(result -> St)
               // .andExpect(jsonPath("$").isArray());
    }
    @Test
    public void getStarSignTest() throws Exception{
        when(birthdayService.getStarSign(LocalDate.parse("2001-02-20",formatter))).thenReturn(strBirthDate);
        mockMvc.perform(
                        post("/birthday/starSign")
                                .content(objectMapper.writeValueAsBytes("2001-02-20"))
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());

        //.andExpect((ResultMatcher) content().contentType())
        //.andExpect(result -> St)
        // .andExpect(jsonPath("$").isArray());
    }
}
