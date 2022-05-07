package com.henriquefigueiredo.simplesquarevalidatorproducer;

import com.henriquefigueiredo.simplesquarevalidatorproducer.controller.SquareValidatorController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SimpleSquareValidatorProducerApplication.class)
public class BaseContractTest {

    @Autowired
    SquareValidatorController squareValidatorController;
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(squareValidatorController);
    }
}
