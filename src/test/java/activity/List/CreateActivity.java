package activity.List;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class CreateActivity {
    public TextBox addBuy;
    public Button addToList;

    public CreateActivity(){

        addBuy = new TextBox(By.id("co.kr.ezapp.shoppinglist:id/editTextItem"));
        addToList = new Button(By.id("co.kr.ezapp.shoppinglist:id/ivAdd"));
    }


    public boolean isDisplayed(){
        String locator="co.kr.ezapp.shoppinglist:id/tvItem";
        Label task = new Label(By.id(locator));
        return task.isDisplayed();
    }


}
