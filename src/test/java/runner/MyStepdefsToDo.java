package runner;

import activity.Todo.CreateActivity;
import activity.Todo.MainTodo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.net.MalformedURLException;

public class MyStepdefsToDo {
    MainTodo mainTodo = new MainTodo();
    CreateActivity createActivity = new CreateActivity();

    @Given("yo tengo abierto mi aplicacion todo")
    public void yoTengoAbiertoMiAplicacionTodo(){}

    @When("yo hago click en el boton {string}")
    public void yoHagoClickEnElBoton(String nombreControl) throws MalformedURLException {
        switch (nombreControl) {
            case "add":
                mainTodo.clickCreate.click();
                break;
            case "done":
                createActivity.Save.click();
                break;
        }
    }

    @And("yo lleno la caja de texto {} con el valor {string}")
    public void yoLlenoLaCajaDeTextoTituloConElValor(String control,String value) throws MalformedURLException {
        switch (control) {
            case "titulo":
                createActivity.Title.type(value);
                break;
            case "nota":
                createActivity.Notes.type(value);
                break;
        }
    }

    @Then("la nota {string} deberia ser mostrado")
    public void laNotaDeberiaSerMostrado(String expectedResult) {
        Assert.assertTrue("Error",mainTodo.isDisplayed());
    }
}
