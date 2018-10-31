package com.beuwa.redwine.sensor.app;


import com.beuwa.redwine.core.config.PropertiesFacade;
import com.beuwa.redwine.core.events.BootEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class Initializer {
    @Inject
    private PropertiesFacade propertiesFacade;

    public void init(@Observes BootEvent bootEvent) {
        System.out.println("Init...");
    }
}
