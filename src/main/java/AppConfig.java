import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Scope("prototype")
    @Bean(name = "cat")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Kitty");
        cat.setAge(1);
        cat.setTailLength(10);
        cat.setFurColor("black");
        cat.setBreed("domestic shorthair");
        cat.setGender("female");
        cat.setWeight(5.0);
        cat.setDateOfBirth("2023-01-01");
        cat.setSpecialMarkings("none");
        return cat;
    }
}