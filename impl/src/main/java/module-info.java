import ch.frankel.blog.serviceloader.log.LogService;
import ch.frankel.blog.serviceloader.log.stdout.LogStdOut;

module log.stdout {
    requires log.api;
    exports ch.frankel.blog.serviceloader.log.stdout;
    provides LogService
        with LogStdOut;
}