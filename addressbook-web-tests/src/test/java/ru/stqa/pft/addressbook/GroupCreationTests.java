package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("groups")));
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("group page")));
    returnToGroupPage();
    logout();
  }

}
