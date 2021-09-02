package com.company.service;

import com.company.model.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/time")
public class TimeService {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getCurrentTime(){
        Time time = new Time();
        time.setCurrentTime(new Date());
        return Response.accepted().entity(time).build();
    }
}
