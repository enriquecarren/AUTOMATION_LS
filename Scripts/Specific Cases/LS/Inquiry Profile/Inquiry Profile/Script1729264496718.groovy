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

WebUI.callTestCase(findTestCase('Common Cases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Home/a_A Automation, A Client'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Client Profile/div_Inquiry Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/div_A Client A Automation'), 
    'A Client A Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/div_Last Episode 08282024'), 
    'Last Episode: 08/28/2024')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/label_Active'), 
    'Active')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/label_1629'), 
    '1629')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/b_DOB'), 
    'DOB:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/b_Age'), 
    'Age:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/b_Home Phone'), 
    'Home Phone:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/b_Mobile Phone'), 
    'Mobile Phone:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/b_Email'), 
    'Email:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Inquiry Profile/Page_Inquiry Profile/b_Address'), 
    'Address:')

WebUI.closeBrowser()

