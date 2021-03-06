package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/Forbaya/set04-Set04_04.Alive";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/Forbaya/set04-Set04_04.Alive";
    }

    public static String herokuUrl() {
        return "https://fierce-everglades-72899.herokuapp.com";
    }
}
