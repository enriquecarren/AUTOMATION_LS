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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Home/a_D Automation, D Client'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Client Profile/div_Account Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Account Profile/a_Service Charge'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Account Profile/select_-- Please select --5 Panel Drug Scre_325e14'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Account Profile/select_-- Please select --Enrique CarrenoAu_49b913'), 
    '1302', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Account Profile/button_Save'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/SuccessMessageCharge'), 
    'Service Charge added')

WebUI.scrollToPosition(0, 190)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/insuranceChargeArrow'))

WebUI.scrollToElement(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Page_Account Profile/a_Charges'), 
    120)

WebUI.doubleClick(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/InsChargeDate'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/InsChargeDate'), GlobalVariable.Todays_Date)

WebUI.verifyElementClickable(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/ServiceChargeId'))

WebUI.verifyElementVisible(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/SERVICE CHARGE/Payor'), FailureHandling.STOP_ON_FAILURE)

