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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rahulshettyacademy.com/angularpractice/')

WebUI.click(findTestObject('Object Repository/Registration/Page_ProtoCommerce/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_ProtoCommerce/input_Name_name'), 'raktim')

WebUI.setText(findTestObject('Object Repository/Registration/Page_ProtoCommerce/input_Email_email'), 'wrishi.d.fire@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_ProtoCommerce/input_Password_exampleInputPassword1'), 
    'Z0dlpp0CEQIySp1BVDPF8A==')

WebUI.click(findTestObject('Object Repository/Registration/Page_ProtoCommerce/input_Password_exampleCheck1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration/Page_ProtoCommerce/select_Male                        Female'), 
    'Female', true)

WebUI.click(findTestObject('Object Repository/Registration/Page_ProtoCommerce/input_Date of Birth_btn btn-success'))

WebUI.click(findTestObject('Object Repository/Registration/Page_ProtoCommerce/div_Success The Form has been submitted suc_2d2429'))

WebUI.closeBrowser()

