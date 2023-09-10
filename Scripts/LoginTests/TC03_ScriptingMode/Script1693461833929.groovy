import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//Start scripting

//Open browser

WebUI.openBrowser("https://rahulshettyacademy.com/loginpagePractise/")

//maximize
WebUI.maximizeWindow()

//setusername & password
WebUI.setText(findTestObject('Object Repository/TC03/Page_LoginPage Practise  Rahul Shetty Academy/input_Username_username'), "rahulshettyacademy")
WebUI.setText(findTestObject('Object Repository/TC03/Page_LoginPage Practise  Rahul Shetty Academy/input_Password_password')
, "learning")


WebUI.click(findTestObject('Object Repository/TC03/Page_LoginPage Practise  Rahul Shetty Academy/input_User_terms'))

//click
WebUI.click(findTestObject('Object Repository/TC03/Page_LoginPage Practise  Rahul Shetty Academy/input_I Agree to the_signin')
)


//validate the homepage element 
WebUI.verifyElementPresent(findTestObject('Object Repository/TC03/Page_ProtoCommerce/h1_Shop Name'), 4)

//close browser
WebUI.closeBrowser()
