package co.com.gpstrackit.certification.pm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target TXT_USERNAME = Target.the("Field to enter username").located(By.id("username"));
    public static final Target TXT_PASS = Target.the("Field to enter pass").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Button to login").located(By.xpath("//button[@class='btn-shadow btn btn-primary btn-lg']"));
    public static final Target LBL_ACCOUNT = Target.the("View User account").located(By.xpath("//span[@class='name mr-1']"));
    public static final Target LBL_SIGN_OUT = Target.the("View User account").located(By.xpath("//button[contains(text(),'Sign Out')]"));
    public static final Target LBL_REQUIRED_MESSAGE_USERNAME = Target.the("Label mesagge validation of username").located(By.xpath("(//input[@id='username']//following::small)[1]"));
    public static final Target LBL_REQUIRED_MESSAGE_PASS = Target.the("Label mesagge validation of pass").located(By.xpath("(//input[@id='password']//following::small)[1]"));
    public static final Target LBL_INVALID_USERNAME = Target.the("Label of Incorrect username or password ").located(By.xpath("//li[contains(text(),'User does not exist.')]"));
    public static final Target LBL_INVALID_PASS = Target.the("Label of User does not exist").located(By.xpath("//li[contains(text(),'Incorrect username or password.')]"));


}