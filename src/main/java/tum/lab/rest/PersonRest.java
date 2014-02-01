package tum.lab.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tum.lab.dto.PersonDto;
import tum.lab.mapper.PersonMapper;
import tum.lab.service.PersonService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by tum on 2/1/2014 AD.
 */

@Component
@Path("/person")
public class PersonRest {

    @Autowired
    private PersonService service;

    @GET
    @Path("{name}/")
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDto getPerson(@PathParam("name") String name) {
        return PersonMapper.map(service.getPerson(name));
    }
}
