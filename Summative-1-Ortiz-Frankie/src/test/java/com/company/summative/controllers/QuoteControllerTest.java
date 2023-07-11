package com.company.summative.controllers;

import com.company.summative.models.Answer;
import com.company.summative.models.Definition;
import com.company.summative.models.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest(QuoteController.class)
public class QuoteControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper= new ObjectMapper();

    @Test
    public void shouldReturnQuoteWithStatusOK() throws Exception {
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
