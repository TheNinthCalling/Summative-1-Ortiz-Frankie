package com.company.summative.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.company.summative.models.Answer;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MagicEightBallController.class)
public class MagicEightBallControllerTest {

//    Wire in MkckMvc object
    @Autowired
    private MockMvc mockMvc;
//    Mapper converts java to json
    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void shouldReturnNewAnswerWithEmptyQuestion() throws Exception {
        Answer toTest = new Answer();
        String inputJson=mapper.writeValueAsString(toTest);
        System.out.println(inputJson);

        mockMvc.perform(
                post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated());

    }

}
