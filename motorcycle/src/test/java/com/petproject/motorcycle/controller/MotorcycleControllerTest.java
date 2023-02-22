package com.petproject.motorcycle.controller;

import com.petproject.motorcycle.data.Motorcycle;
import com.petproject.motorcycle.service.MotorcycleService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MotorcycleController.class)
class MotorcycleControllerTest {

    private final String uri = "/motorcycle";

    private final String requestBody = """
            {
            "Manufacturer": "HONDA",
            "ModelType": "ADVENTURE",
            "name": "CRF1100L Africa Twin - Adventure Sports",
            "productionYear": 2023,
            "engine": "2-Stroke",
            "displacement": 1084,
            "cooling": "liquid cooled",
            "horsepower": 100,
            "drive": "chain",
            "fuelCapacity": 18.8,
            "isUsed": false
            }
            """;

    @MockBean
    MotorcycleService motorcycleService;

    @Autowired
    private MockMvc mockMvc;

    @Captor
    private ArgumentCaptor<Motorcycle> motorcycleArgumentCaptor;

    @Test
    void getMotorcycles() throws Exception {
        mockMvc.perform(get(uri))
                .andExpect(status().isOk());

        verify(motorcycleService).getAllMotorcycles();
    }

    @Test
    void postMotorcycle() throws Exception {
        mockMvc.perform(post(uri)
                        .contentType(APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk());

        verify(motorcycleService).save(motorcycleArgumentCaptor.capture());

    }

    @Test
    void putMotorcycle() throws Exception {
        mockMvc.perform(put(uri)
                        .content(requestBody)
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk());

        verify(motorcycleService).update(motorcycleArgumentCaptor.capture());
    }

    @Test
    void deleteMotorcycle() throws Exception {
        mockMvc.perform(delete(uri)
                        .contentType(APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk());

        verify(motorcycleService).delete(motorcycleArgumentCaptor.capture());
    }

    @Test
    void getMotorcycleById() throws Exception {
        mockMvc.perform(get(uri + "/{id}", 1))
                .andExpect(status().isOk());

        verify(motorcycleService).getMotorcycleById(1L);
    }
}