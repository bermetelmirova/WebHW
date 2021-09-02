package com.company.service;

import com.company.model.NumberSum;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/sum")
public class NumberSumService {
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response sum(NumberSum numberSum) {
        numberSum.setSum(numberSum.getNumberOne() + numberSum.getNumberTwo());
        return Response.accepted().entity("{ 'sum' : " + numberSum.getSum() + " }").build();
    }
}
