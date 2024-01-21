package com.weekendesk.jenkinsci;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntegrationTest {

    @Test
    void integrationTest() {
        then(Boolean.TRUE).isTrue();
    }
}
