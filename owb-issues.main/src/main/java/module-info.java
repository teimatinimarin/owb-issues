module redwine.sensor {
    // WebBeans
    requires cdi.api;
    requires javax.inject;

    requires java.annotation;
    requires jdk.unsupported;

    opens com.beuwa.redwine.core.config;
    opens com.beuwa.redwine.core.events;

    opens com.beuwa.redwine.sensor;
    opens com.beuwa.redwine.sensor.app;
}
