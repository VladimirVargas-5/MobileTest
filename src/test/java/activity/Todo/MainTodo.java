package activity.Todo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainTodo {
    public Button clickSearch;
    public Button clickCreate;

    public MainTodo(){

        clickSearch = new Button(By.id("com.vrproductiveapps.whendo:id/search"));
        clickCreate = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    }

    public boolean isDisplayed(){
        String locator="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout";
        Label task = new Label(By.xpath(locator));
        return task.isDisplayed();
    }

}
