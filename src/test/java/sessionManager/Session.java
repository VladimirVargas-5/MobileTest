package sessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.sql.Driver;

public class Session {
    //contructor privado

    //atributo del mismo tipos

    //metodo statico publico - mismo tipos


    public  static Session session = null;
    private AppiumDriver driver;

    private Session() throws MalformedURLException {
        driver = FactoryDevice.make("android").create();
    }

    public static Session getInstance() throws MalformedURLException {
        if (session==null)
            session=new Session();

        return session;
    }

    public void closeSession(){
        driver.quit();
        session=null;

    }

    public AppiumDriver getDriver(){
        return driver;

    }



}
