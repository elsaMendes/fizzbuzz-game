package com.exercice.alfresco;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class FizzBuzzGameWebIntegrationTest {

    @Autowired
    private MockMvc mvc;

    TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testExecute_forSuccessfulRun() throws Exception {
        this.mvc.perform(get("http://localhost:8080/fizzbuzz/from/1/to/20")).andExpect(status().isOk());
    }

    @Test
    public void testExecute_forInvalidInput() throws Exception {
        this.mvc.perform(get("http://localhost:8080/fizzbuzz/from/one/to/twenty")).andExpect(status().isBadRequest());
    }
}
