import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;





public class Task_1 {

    WebDriver driver;
    String baseURL;




    @Before
    public  void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        baseURL=("http://www.sberbank.ru/ru/person");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);

    }

    @Test
    public void auto_test(){



        driver.findElement(By.xpath(".//*[@id='main']/div/div/table/tbody/tr/td/div/div/div/div/div/div[1]/div[1]/div[4]/div/div/div/ul/li[5]/a/span/span[1]")).click();

        driver.findElement(By.xpath(".//*[contains(@class,'list__link_level_1')][contains(text(),'Страхование путешественников')]")).click();


        assertEquals("Страхование путешественников", driver.findElement(By.xpath("//h1[contains(text(),'Страхование путешественников')]")).getText());

        driver.findElement(By.xpath("//img[contains(@src,'id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53')]")).click();

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        driver.getTitle();


        driver.findElement(By.xpath("//*[@id='views']/form/section/section/section[2]/div[1]/div[1]")).click();
        driver.findElement(By.xpath(".//*[contains(@class,'btn')][contains(text(),'Оформить')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.SURNAME_ENG')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.SURNAME_ENG')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.SURNAME_ENG')]"), "Petrov");

        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.NAME_ENG')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.NAME_ENG')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.NAME_ENG')]"), "Petr");

        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.BIRTHDATE')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.BIRTHDATE')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.BIRTHDATE')]"), "23.05.1975");

        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.LASTNAME')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.LASTNAME')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.LASTNAME')]"), "Петров");


        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.FIRSTNAME')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.FIRSTNAME')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.FIRSTNAME')]"), "Петр");

        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.MIDDLENAME')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.MIDDLENAME')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.MIDDLENAME')]"), "Петрович");

        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.BIRTHDATE')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.BIRTHDATE')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.BIRTHDATE')]"), "23.05.1975");


        driver.findElement(By.xpath("//input[contains(@class,'b-radio-field')][contains(@ng-model,'formdata.insurer.GENDER')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCSERIES')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCSERIES')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCSERIES')]"), "1234");

        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCNUMBER')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCNUMBER')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCNUMBER')]"), "123456");

        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDATE')]")).click();
        driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDATE')]")).clear();
        fillField(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDATE')]"), "04.04.1984");

        driver.findElement(By.xpath("//textarea[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDBY')]")).click();
        driver.findElement(By.xpath("//textarea[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDBY')]")).clear();
        fillField(By.xpath("//textarea[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDBY')]"), "РОВД");

        assertEquals("Petrov", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.SURNAME_ENG')]")).getAttribute("value"));
        assertEquals("Petr", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.NAME_ENG')]")).getAttribute("value"));
        assertEquals("23.05.1975", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'namespace.BIRTHDATE')]")).getAttribute("value"));

        assertEquals("Петров", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.LASTNAME')]")).getAttribute("value"));
        assertEquals("Петр", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.FIRSTNAME')]")).getAttribute("value"));
        assertEquals("Петрович", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.MIDDLENAME')]")).getAttribute("value"));
        assertEquals("23.05.1975", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.BIRTHDATE')]")).getAttribute("value"));

        assertEquals("1234", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCSERIES')]")).getAttribute("value"));
        assertEquals("123456", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].DOCNUMBER')]")).getAttribute("value"));
        assertEquals("04.04.1984", driver.findElement(By.xpath("//input[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDATE')]")).getAttribute("value"));
        assertEquals("РОВД", driver.findElement(By.xpath("//textarea[contains(@class,'b-text-field')][contains(@ng-model,'formdata.insurer.documentList[0].ISSUEDBY')]")).getAttribute("value"));

        driver.findElement(By.xpath(".//*[contains(@class,'btn')][contains(text(),'Продолжить')]")).click();

        assertEquals("Заполнены не все обязательные поля", driver.findElement(By.xpath("//*[@id=\'views\']/section/form/section/section[5]/div[2]/div[1]")).getText());

    }
    public void fillField(By locator, String value){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }



    @After
    public void after(){

        driver.quit();

    }


}
