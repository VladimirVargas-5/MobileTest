package testClean;

import activity.Todo.CreateActivity;
import activity.Todo.MainTodo;
import activity.Todo.SearchActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class TodoTest {
    MainTodo mainTodo = new MainTodo();
    SearchActivity searchActivity = new SearchActivity();
    CreateActivity createActivity = new CreateActivity();

        @Test
    public void GoToCreate() throws MalformedURLException {

           String newTask = "TaskOne";
        mainTodo.clickCreate.click();
        createActivity.Title.type(newTask);
        createActivity.Notes.type("NoteTest");
        createActivity.Save.click();

            Assert.assertTrue("Error",mainTodo.isDisplayed());

    }

    @Test
    public void GoToSearch() throws MalformedURLException {
        String newTask = "TaskOne";
        mainTodo.clickSearch.click();
        searchActivity.wordSearch.type(newTask);

        Assert.assertTrue("Error",mainTodo.isDisplayed());


    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
