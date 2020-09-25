package activity.Todo;

import appiumControl.TextBox;
import org.openqa.selenium.By;

public class SearchActivity {
    public TextBox wordSearch;

    public SearchActivity(){
        wordSearch = new TextBox(By.id("com.vrproductiveapps.whendo:id/search_src_text"));
    }

}
