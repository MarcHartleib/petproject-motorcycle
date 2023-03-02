package com.petproject.motorcycle.controller;

import com.petproject.motorcycle.testData.MotorcycleTestdataProvider;
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
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MotorcycleController.class)
class MotorcycleControllerTest {

    private final String uri = "/motorcycle";



    @MockBean
    MotorcycleService motorcycleService;

    @Autowired
    private MockMvc mockMvc;

    @Captor
    private ArgumentCaptor<Motorcycle> motorcycleArgumentCaptor;

    private final MotorcycleTestdataProvider motorcycleTestdataProvider = new MotorcycleTestdataProvider();
    private final String requestBody = motorcycleTestdataProvider.getRequestBody();
    private final Motorcycle motorcycle = motorcycleTestdataProvider.getMotorcycleTestObject();


    @Test
    void getMotorcycles() throws Exception {
        mockMvc.perform(get(uri))
                .andExpect(status().isOk());

        verify(motorcycleService).getAllMotorcycles();
    }



    @Test
    void postMotorcycle() throws Exception {
        when(motorcycleService.save(motorcycle)).thenReturn(motorcycle);
        mockMvc.perform(post(uri)
                        .contentType(APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk());

        verify(motorcycleService).save(motorcycle);
    }

    @Test
    void putMotorcycle() throws Exception {
        when(motorcycleService.update(motorcycle)).thenReturn(motorcycle);
        mockMvc.perform(put(uri)
                        .content(requestBody)
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk());

        verify(motorcycleService).update(motorcycle);
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