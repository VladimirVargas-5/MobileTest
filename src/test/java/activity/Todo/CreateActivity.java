package activity.Todo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class CreateActivity {
    public TextBox Title;
    public TextBox Notes;
    public Button Save;

    public CreateActivity(){
        Title = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        Notes =  new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        Save = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }


}
