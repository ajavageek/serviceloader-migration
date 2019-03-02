package ch.frankel.blog.serviceloader.log.stdout;

import ch.frankel.blog.serviceloader.log.LogService;

public class LogStdOut implements LogService {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
