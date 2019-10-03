package oof.oofgen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PreDestroy;
import java.util.Arrays;

@Profile("!test")
@SpringBootApplication
//We don't want to auto configure spring security, services can enable it by extending the @BaseWebSecurity class
public class OofgenApplication {

    private static Logger logger = LoggerFactory.getLogger(OofgenApplication.class);

    public static void main(String[] args) throws Exception {
        try {
            new SpringApplicationBuilder(OofgenApplication.class)
                    .web(true)
                    .run();
        } catch (Exception e) {
            //Catchall to prevent a half started application. With bad config we sometimes see a partial startup
            //where the jvm continues though our app fails to be initialized by spring
            logger.error("Startup failure, running system exit");
            System.exit(1);
        }
    }

    @PreDestroy
    public void shutdown() throws Exception {
        logger.info("OofgenApplication is shutting down");
    }

}
