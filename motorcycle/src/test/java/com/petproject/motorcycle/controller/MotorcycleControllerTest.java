package com.petproject.motorcycle.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MotorcycleController.class)
class MotorcycleControllerTest {

    private final String uri = "/motorcycle";

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMotorcycle() throws Exception {
        mockMvc.perform(get(uri)
                        .content(String.valueOf(APPLICATION_JSON)))
                .andExpect(status().isOk());
    }

    @Test
    void postMotorcycle() throws Exception {
        String requestBody = "Test";
        mockMvc.perform(post(uri)
                        .content(requestBody)
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void putMotorcycle() throws Exception {
        int requestBody = 2;
        mockMvc.perform(put(uri + "/{id}", 1)
                        .content(String.valueOf(requestBody))
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void deleteMotorcycle() throws Exception {
        mockMvc.perform(delete(uri)
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}