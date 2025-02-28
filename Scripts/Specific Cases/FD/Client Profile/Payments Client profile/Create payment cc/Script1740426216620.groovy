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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1560?section=finance')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Client Profile/i_add'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Client Profile/a_Create'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/input_Payor_payorname'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/div_E Client E Automation'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/input_Amount_lineamount'), 
    '120')

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/cc CP'))

WebUI.selectOptionByLabel(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/cc CP'), 
    'Credit Card', false)

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/cc CP'), Keys.chord())

WebUI.setText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/nameCard'), 
    'john automation')

WebUI.selectOptionByValue(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/expmonth'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/expYY'), 
    '2025', true)

WebUI.selectOptionByValue(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/cctype'), 
    'visa', true)

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/ccnumber'))

WebUI.setText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/ccnumber'), 
    '4111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/ccnumber'), 
    '1111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/ccnumber'), 
    '1111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/ccnumber'), 
    '1111')

WebUI.setText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/cvc'), '996')

WebUI.setText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/bzip'), '12323')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/textarea_Note_note'), 
    'added automation payment')

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/submitPScc'))

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/NoSubmit'))

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/submitPScc'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/YESSubmit'), 10)
WebUI.waitForElementClickable(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/YESSubmit'), 10)
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/YESSubmit'))


WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/payment CP/Page_Collect Payment/successMsgCC'), 
    'A PaySimple Payment in the amount of: $120.00 for E Client E Automation has been Authorized')

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1560?section=finance')

