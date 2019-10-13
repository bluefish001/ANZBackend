package com.xieh.backend;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.xieh.backend.entity.Account;

/**
 * Created by xieh on 11/10/2019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackendApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BackendControllerIntegrationTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetAllAccounts() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<List<Account>> entity = new HttpEntity<>(null, headers);

        ResponseEntity<List> response = restTemplate.exchange(getRootUrl() + "/api/accounts",
            HttpMethod.GET, entity, List.class);

        assertNotNull(response.getBody());
    }
}
