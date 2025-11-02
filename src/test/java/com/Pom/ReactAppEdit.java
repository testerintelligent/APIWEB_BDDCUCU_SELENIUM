package com.Pom;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReactAppEdit {
WebDriver driver;

public ReactAppEdit(WebDriver driver) {
        this.driver = driver;
}
public void reactAppPage(String url) {
    driver.get(url);
}
public void trainingSummaryClick(){
    driver.findElement(By.xpath("//button[@aria-label='Training Summary']")).click();
}
public void projectNameEmployeeNameVisible(){
    WebElement projectNameElement= driver.findElement(By.xpath("//th[text()='Project Name']"));
    boolean projectNameisVisible=projectNameElement.isDisplayed();
    Assert.assertTrue("Project Name not visible", projectNameisVisible);
    WebElement employeeNameElement= driver.findElement(By.xpath("//th[text()='Employee Name']"));
    boolean employeeNameisVisible=employeeNameElement.isDisplayed();
    Assert.assertTrue("Employee Name not visible", employeeNameisVisible);
}
public void searchEmployeename(String employeename){
   WebElement serachemployeename= driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
    serachemployeename.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
    serachemployeename.sendKeys(employeename);
}
public void searchCourse(String course){
   WebElement serachcourse= driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
    serachcourse.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
    serachcourse.sendKeys(course);
}

public void filterSearchCourse(String coursefilter){
    WebElement filtersearch = driver.findElement(By.xpath("(//table//input[@aria-invalid=\"false\"][@type='text'])[3]"));
    filtersearch.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
    filtersearch.sendKeys(coursefilter);
}

public void editTrainingbtnClick(){
    driver.findElement(By.xpath("//table//tr[1]//following-sibling::td//child::button[@aria-label=\"edit\"]")).click();
}
public void editTrainingVisible(){
    WebElement editTraiingElement= driver.findElement(By.xpath("//h6[text()='Edit Training']"));
    boolean editTrainingisVisible=editTraiingElement.isDisplayed();
    Assert.assertTrue("Edit training not visible", editTrainingisVisible);
}
public void editEmployeeName(String employeename){
   WebElement editname= driver.findElement(By.name("employeeName"));
    editname.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
    editname.sendKeys(employeename);
}
public void editCourse(String course){
   WebElement editcourse= driver.findElement(By.name("course"));
   editcourse.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
   editcourse.sendKeys(course);
}
public void updateClick(){
    driver.findElement(By.xpath("//button[text()='Update']")).click();
}
public void deleteTrainingClick(){
    driver.findElement(By.xpath("(//button[@aria-label=\"delete\"])[1]")).click();
}
public void deleteAllByCourseRecords(String coursename){
    List<WebElement> courseRows=driver.findElements(By.xpath("//td[text()='" + coursename + "']"));
    if (courseRows.isEmpty()){
        System.out.println("No records found for course: "+ coursename);
        return;
    }
        while (!courseRows.isEmpty()){
            WebElement row=courseRows.get(0);
        WebElement deleteBtn=row.findElement(By.xpath("//button[@aria-label='delete']"));
            deleteBtn.click();
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.stalenessOf(row));
            courseRows = driver.findElements(By.xpath("//td[text()='" + coursename + "']"));
        }
        System.out.println("All reocrds deleted for course: "+ coursename);    
}
public void filterStartDate(String startdate){
    WebElement startDateElement=driver.findElement(By.xpath("(//input[@type=\"date\"])[1]"));
    startDateElement.sendKeys(startdate);
}

public void verifyRecordswithGivenStartDate(String expecteddate){
List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
for (WebElement row : rows) {
        String date = row.findElement(By.xpath("//td[6]")).getText().trim();
        if (!date.equals(expecteddate)) {
            throw new AssertionError("Date mismatch! Expected: " + expecteddate + ", Found: " + date);
        }
}
System.out.println("All records have the date: " + expecteddate);
}
}