package com.zetcode.resource;

import com.zetcode.model.City;
import com.zetcode.service.ICityService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cities")
public class MyResource {
    
    @Inject 
    private ICityService cityService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<City> message() {
        
        List<City> cities = cityService.findAll();

        return cities;
    }
}

