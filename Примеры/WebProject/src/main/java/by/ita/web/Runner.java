package by.ita.web;

import by.ita.web.controllers.Books;
import org.rapidoid.http.HTTP;
import org.rapidoid.setup.App;
import org.rapidoid.setup.On;
import org.rapidoid.setup.Setup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {

    private static final Logger LOGGER=LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.info("Project startup");
//        App.run(args);
//        Setup setup = Setup.create("foo").port(8080);
//        setup.scan("by.ita.web.controllers");
        App.bootstrap(args);
        // demo
//        HTTP.get("localhost:2222/foo").print();
//        HTTP.get("localhost:3333/bar").print();
    }

}
