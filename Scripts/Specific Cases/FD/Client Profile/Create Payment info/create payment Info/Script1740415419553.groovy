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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Client Profile/i_add'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/div_DateBill Date'))

WebUI.setText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Date_datedoc'), 
    GlobalVariable.Todays_Date)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/select_-- Please Select --PaySimple'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Payor_payorname'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/div_E Client E Automation'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/select_CheckACHCredit Card'), 
    'CC', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Name on Card_ccname'), 
    'john automation')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Billing Zip_zip'), 
    '12323')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/select_Jan (01)Feb (02)Mar (03)Apr (04)May _175bdf'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/select_2025202620272028202920302031203220332034'), 
    '2025', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/select_MastercardVisaDiscoverAmex'), 
    'visa', true)

WebUI.setText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Credit Card_ccdigits'), 
    '4111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Credit Card_ccdigits'), 
    '1111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Credit Card_ccdigits'), 
    '1111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_Credit Card_ccdigits'), 
    '1111')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/input_CVC_cccvc'), 
    '996')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/textarea_Note_note'), 
    'added automation payment')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/span_Active_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Client Profile/p_Successfully added Payment Information'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Client Profile/p_Successfully added Payment Information'), 
    'Successfully added Payment Information')

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1560?section=finance')

WebUI.verifyElementPresent(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/date added'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/namepaymentInfo'), 
    'john automation')

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/methodPI'), 
    'CC')

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/Edit payment info'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/textarea_Note_note'), 
    'added automation payment - verify edition')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Create payment information/Page_Payment Information/button_Save'))

