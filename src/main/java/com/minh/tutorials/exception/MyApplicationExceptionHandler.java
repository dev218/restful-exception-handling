package com.minh.tutorials.exception;

/**
 * Created by minh on 5/26/15.
 */

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyApplicationExceptionHandler implements ExceptionMapper<MyApplicationException> {
    @Override
    public Response toResponse(MyApplicationException exception) {
        return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build();
    }
}
