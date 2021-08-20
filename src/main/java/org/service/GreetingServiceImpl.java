package org.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingServiceImpl implements  GreetingService{
    @Override
    public String greeting(String name) {
        return "Holita"+name;
    }
}
