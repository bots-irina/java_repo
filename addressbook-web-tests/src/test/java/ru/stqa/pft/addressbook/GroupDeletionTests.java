package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("groups")));
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
