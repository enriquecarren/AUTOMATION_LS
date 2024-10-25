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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Home/a_D Automation, D Client'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1559?section=clientprofile')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Client Profile/div_Inquiry Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/a_Demographics'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/h4_Demographic Information for D Client D A_35ae77'), 
    'Demographic Information for D Client D Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/h4_Profile Picture for D Client D Automation'), 
    'Profile Picture for D Client D Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/th_Date'), 
    'Date')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/th_DOBAge'), 
    'DOB/Age')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/th_Home Phone'), 
    'Home Phone')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/th_Mobile Phone'), 
    'Mobile Phone')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/th_Active'), 
    'Active')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/em_Invalid phone number'), 
    '* Invalid phone number.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/i_add'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Demographic Information/i_Back to Profile_fa fa-eye'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Demographic Information/b_There is a previous Demographic or Person_2bb46d'), 
    'There is a previous Demographic or Personal Information Form (PIF) from 10/22/2024, click the button to see the responses below.')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Demographic Information/span_Click the individual buttons below the_f362ce'), 
    'Click the individual buttons below the input to import the PIF data, or click the button to the left to import ALL of the PIF data - note that this will overwite any existing data.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Demographic Information/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/td_10222024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/td_Yes'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Demographics/Page_Inquiry Profile/td_No'), 
    0)

WebUI.closeBrowser()

