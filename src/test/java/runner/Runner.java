package runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Runner {

    //Hooks(acciones antes y despues de cada scenario)
    @Before
    public void beforeCucumber(){
        System.out.println("BEFORE Cucumber");
    }
    @After
    public void afterCucumber(){
        System.out.println("AFTER Cucumber");
    }

}
