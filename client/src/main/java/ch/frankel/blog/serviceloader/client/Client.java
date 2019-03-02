package ch.frankel.blog.serviceloader.client;

import ch.frankel.blog.serviceloader.log.LogService;

import java.util.ServiceLoader;

public class Client {

    public static void main(String[] args) {
        ServiceLoader<LogService> loader = ServiceLoader.load(LogService.class);
        for (LogService service : loader) {
            service.log("Log written by " + service.getClass());
        }
    }
}
