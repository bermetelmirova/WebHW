package com.company.service;

import com.company.dao.UserDaoImpl;
import com.company.model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserService {
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response autorize(User user){
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println( userDao.autorisation(user));
        return Response.accepted().entity(userDao.autorisation(user)).build();

//        create table users(
//                id serial primary key,
//                login varchar not null unique,
//                password_u varchar not null);
//
//        insert into users(login, password_u)
//        values('bermet', '123')
    }
}
