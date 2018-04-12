package com.alenasoft.urbanager.resources.primenumber;

import com.alenasoft.urbanager.resources.primenumber.service.PrimeNumberService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("primo")
public class PrimeNumberResource {

    @Inject
    private PrimeNumberService service;

    @GET
    @Path("/{entero}")
    @Produces(MediaType.APPLICATION_JSON)
    public String isPrimeNumber(@PathParam("entero") int value) {
        Boolean isPrime = this.service.isPrimeNumber(value);
        return (isPrime) ? "OK" : "FAIL";
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public String getNPrimeNumbers(@QueryParam("limite") int n) {
        String result = this.service.getNPrimeNumbers(n);
        return result;
    }
}
