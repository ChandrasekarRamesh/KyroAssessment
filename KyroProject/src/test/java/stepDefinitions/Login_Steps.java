package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Login_Steps extends Base_PO {

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po){
        this.login_po = login_po;
    }

    @Given("User access the kyro website url")
    public void user_access_the_kyro_website_url() {
       login_po.navigateTo_Kyro_LoginPage();

    }
    @When("User click on the login button")
    public void user_click_on_the_login_button() {
        login_po.clickOn_Login_Button();

    }
    @And("User should be presented with the kyro login page")
    public void user_should_be_presented_with_the_kyro_login_page() {
        login_po.validateTitleText();

    }
    @And("User enter a username {}")
    public void user_enter_a_username(String emailid) {
        login_po.setUserName(emailid);

    }
    @And("User enter a password {}")
    public void user_enter_a_password(String password) {
        login_po.setPassword(password);

    }
    @And("User click on the continue button")
    public void user_click_on_the_continue_button() {
        login_po.clickOn_Continue_Button();

    }
    @And("User should be presented with the home page")
    public void user_should_be_presented_with_the_home_page() {
      login_po.homePageDisplayed();

    }
    @And("User click on Dashboard tab")
    public void user_click_on_dashboard_tab() {
        login_po.clickOn_DashboardTab();

    }
    @And("User click on kyroTest project")
    public void user_click_on_kyro_test_project() {
        login_po.clickOn_kyroTest_Project();

    }
    @And("User click on the create task button")
    public void user_click_on_the_create_task_button() {
        login_po.clickOn_Create_task_Button();

    }
    @And("User should be presented with create task dialog box")
    public void user_should_be_presented_with_create_task_dialog_box() {
        login_po.validateCreateTaskText();

    }
    @And("User enter a unique summary")
    public void user_enter_a_unique_summary() {
        login_po.setSummaryText();

    }
    @And("User enter a unique tasktype")
    public void user_enter_a_unique_tasktype() {
        login_po.setTaskTypeText();

    }
    @And("User enter a unique description")
    public void user_enter_a_unique_description() {
        login_po.setDescriptionText();

    }
    @And("User select a priority")
    public void user_select_a_priority() {
       login_po.setSelect_Priority();

    }
    @And("User enter a unique location")
    public void user_enter_a_unique_location() {
        login_po.setLocationText();

    }
    @And("User enter a startdate")
    public void user_enter_a_startdate() {
       login_po.setStart_Date();

    }
    @And("User enter a duedate")
    public void user_enter_a_duedate() {
        login_po.setDue_Date();

    }
    @And("User click on the submit button")
    public void user_click_on_the_submit_button() {
        login_po.clickOn_Submit_Button();

    }
    @Then("new task created in the list view under the project")
    public void new_task_created_in_the_list_view_under_the_project() {
        login_po.validateCreatedTaskInList();

    }
}


