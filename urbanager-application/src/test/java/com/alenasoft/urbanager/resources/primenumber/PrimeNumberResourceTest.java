package com.alenasoft.urbanager.resources.primenumber;

import com.alenasoft.urbanager.UrbanagerApp;
import com.alenasoft.urbanager.UrbanagerConf;
import com.alenasoft.urbanager.api.Example;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class PrimeNumberResourceTest {
    @ClassRule
    public static final DropwizardAppRule<UrbanagerConf> RULE = new
            DropwizardAppRule<UrbanagerConf>(UrbanagerApp.class,
            ResourceHelpers.resourceFilePath("config-test.yml"));

    public final Random random = new Random();

    public Client client;

    @Before
    public void setUp() {
        this.client = new JerseyClientBuilder(RULE.getEnvironment())
                .build(String.format("tester-%d", this.random.nextInt()));
    }

    @After
    public void tearDown() {
        this.client.close();
        this.client = null;
    }

    @Test
    public void testToGetOkResponseWhenGettingIsPrimerNumberInputValueIsPrimeNumber() {
        Response response = this.client.target(
                String.format("http://localhost:%d/api/primo/5", RULE.getLocalPort()))
                .request().get();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.SC_OK);
    }

    @Test
    public void testToGetOkResponseWhenGettingNPrimeNumbersWhenInputValueIsAValidNumber() {
        Response response = this.client.target(
                String.format("http://localhost:%d/api/primo?limite=5", RULE.getLocalPort()))
                .request().get();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.SC_OK);
    }


}