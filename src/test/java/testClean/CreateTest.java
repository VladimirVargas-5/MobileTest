package testClean;

import activity.List.CreateActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class CreateTest {
    CreateActivity createActivity = new CreateActivity();

    @Test
    public void CreateList() throws MalformedURLException {
        String newTask = "Test";
        createActivity.addBuy.type(newTask);
        createActivity.addToList.click();

        Assert.assertTrue("Error",createActivity.isDisplayed());
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
