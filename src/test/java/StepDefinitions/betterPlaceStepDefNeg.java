package StepDefinitions;


import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import Pages.betterPlacePage;
import org.testng.Assert;

public class betterPlaceStepDefNeg {
    WebDriver driver;
    betterPlacePage better = new betterPlacePage();



    @Given("^User should be gone to urlBug$")
    public void userShouldBeGoneToUrlBug() {
        Driver.getDriver().get("https://www.bp42.com/de/donate/platform/projects/1114?force-bug=1");
        Driver.waitAndClick(better.btnCookies,2);
    }

    @And("^User should be typed data into the form bugLink$")
    public void userShouldBeTypedDataIntoTheFormBugLink() {
        Driver.doubleClick(better.txtBoxAmount);
        Driver.waitAndSendText(better.txtBoxAmount, "", 1);
        Driver.waitAndSendText(better.txtBoxAmount, "5",1);
        Driver.waitAndClick(better.wireTransfer,1);

        Driver.waitAndSendText(better.txtName, "sedat",1);
        Driver.waitAndSendText(better.txtSurname, "dinc",1);
        Driver.waitAndSendText(better.txtEmail, "support@betterplace.org",1);

        Driver.waitAndSendText(better.txtMessageOptional, "multumesc mult",1);
        Driver.waitAndClick(better.showUser,1);

        Driver.waitAndClick(better.receiveReceiptForm,1);
        Driver.waitAndClick(better.receiveReceiptCountry,1);
        Driver.selectDropdown(better.receiveReceiptCountry,1);
        Driver.waitAndSendText(better.receiveReceiptZip,"700",1);
        Driver.waitAndSendText(better.receiveReceiptCity,"iasi",1);
        Driver.waitAndSendText(better.receiveReceiptAutoSuggestion,"Suggestion here...!!",1);
        Driver.waitAndClick(better.receiveReceiptConfirm,1);
        Driver.waitAndClick(better.receiveReceiptSubmit,1);
        Driver.waitAndClick(better.btnWeiter,1);

    }

    @Then("^User should be verified Donation bugLink$")
    public void userShouldBeVerifiedDonationBugLink() {
        String strTitle= Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(strTitle.contains("danke"));
    }

}
