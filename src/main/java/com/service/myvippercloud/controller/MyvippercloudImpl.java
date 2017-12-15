package com.service.myvippercloud.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T07:16:55.354Z")

@RestSchema(schemaId = "myvippercloud")
@RequestMapping(path = "/myvippercloud", produces = MediaType.APPLICATION_JSON)
public class MyvippercloudImpl {

    @Autowired
    private MyvippercloudDelegate userMyvippercloudDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMyvippercloudDelegate.helloworld(name);
    }

}
