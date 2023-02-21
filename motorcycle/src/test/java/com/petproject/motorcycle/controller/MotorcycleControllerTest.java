package com.petproject.motorcycle.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(MotorcycleController.class)
class MotorcycleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMotorcycle() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/motorcycle")
                        .content(String.valueOf(MediaType.APPLICATION_JSON)))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void postMotorcycle() {
    }

    @Test
    void putMotorcycle() {
    }

    @Test
    void deleteMotorcycle() {
    }
}