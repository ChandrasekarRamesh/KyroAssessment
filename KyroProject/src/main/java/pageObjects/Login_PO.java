package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Global_Vars;


public class Login_PO extends Base_PO {
    private @FindBy(id = "username")
    WebElement userName_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(className = "LoginButton_login_button__ehTMa")
    WebElement login_Button;

    private @FindBy(xpath = "//button[text()='Continue']")
    WebElement continue_Button;

    private @FindBy(xpath = ("//div[@id='__next']//li[1]"))
    WebElement home_tab;

    private @FindBy(xpath = "//div[@id='__next']//li[3]")
    WebElement dashboard_Tab;

    private @FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Add Task'])[1]")
    WebElement kyroTest_Project;

    private @FindBy(xpath = "//*[text()='Create Task']")
    WebElement createTask_Button;

    private @FindBy(xpath = "(//h2[normalize-space()='Create Task'])[1]")
    WebElement createTask_Text;

    private @FindBy(id = ":r13:")
    WebElement summaryTextField;

    private @FindBy(name = ":r14:")
    WebElement taskTypeTextField;

    private @FindBy(name = ":r15:")
    WebElement descriptionTextField;

    private @FindBy(name = "location")
    WebElement locationTextField;

    private @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement submit_Button;


    private @FindBy(xpath = "(//div[@role='cell'])[1]")
    WebElement created_Task;

    private @FindBy(id = ":r1i:")
    WebElement select_Priority;

    private @FindBy(id = ":r1k:")
    WebElement start_Date;

    private @FindBy(id = ":r1l:")
    WebElement due_Date;


    public Login_PO(){
        super();
    }
    public void navigateTo_Kyro_LoginPage(){
        navigateTo_URL(Global_Vars.KYRO_URL);
    }

    public void setUserName(String emailid){
        sendKeys(userName_TextField, emailid);
    }

    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }

    public void clickOn_Continue_Button(){
        waitForWebElementAndClick(continue_Button);
    }

    public void clickOn_DashboardTab(){
        waitForWebElementAndClick(dashboard_Tab);
                  }

    public void clickOn_kyroTest_Project(){
              waitForWebElementAndClick(kyroTest_Project);
           }

    public void clickOn_Login_Button(){
        waitForWebElementAndClick(login_Button);
    }

    public void clickOn_Create_task_Button(){
        waitForWebElementAndClick(createTask_Button);
    }

    public void validateTitleText(){
         String text = "Log in | KyroDev";
        waitForValidateText(text);
    }

    public void homePageDisplayed(){
        waitFor(home_tab);
        String txt = home_tab.getText();
        waitForValidateTabText(txt);
    }
    public void validateCreateTaskText(){
        waitFor(createTask_Text);
        Assert.assertEquals(createTask_Text.getText(),"Create Task");
         }

    public void setSummaryText(){
       sendKeys(summaryTextField,"SampleSummary");

    }

    public void setTaskTypeText(){
        sendKeys(taskTypeTextField,generateRandomAlphabet(8));
    }

    public void setDescriptionText(){
        sendKeys(descriptionTextField,generateRandomAlphanumeric(8));
    }

    public void setLocationText(){
        sendKeys(locationTextField,generateRandomAlphabet(8));
    }

    public void clickOn_Submit_Button(){
        waitForWebElementAndClick(submit_Button);
    }

    public void validateCreatedTaskInList(){
        waitFor(created_Task);
        Assert.assertEquals(created_Task.getText(),"SampleSummary");
                    }
    public void setSelect_Priority(){
        Select select = new Select(select_Priority);
        select.selectByVisibleText("3");
    }

    public void setStart_Date(){
        start_Date.sendKeys("09/29/2022");
    }

    public void setDue_Date(){
        due_Date.sendKeys("10/05/2022");
    }


}
