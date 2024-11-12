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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Home/a_C Automation, C Client'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=clientprofile')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Client Profile/div_Inquiry Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/a_Consents'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/span_Show State Specific Consents_caret'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/a_Bill of Rights'), 
    'Bill of Rights')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/select_--Select-State--                    _508ebd'), 
    'CA', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/span_Show State Specific Consents_caret'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/a_Bill of Rights'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/a_Grievance Procedure (CFF)'), 
    'Grievance Procedure (CFF)')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/i_add'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/input_Select All_checkall'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/td_Admission Agreement'), 
    'Admission Agreement')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/td_Consent for Telemedicine'), 
    'Consent for Telemedicine')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/td_Telemedicine Consent'), 
    'Telemedicine Consent')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/td_Authorization to Charge'), 
    'Authorization to Charge')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/input_Select All_checkall'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/input_Consent for Telemedicine_admission_consents'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/button_Generate'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/input_Condition Treated_primarydx'), 
    'Automation addiction')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/select_Outpatient                          _0508f1'), 
    'Detoxification', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/canvas_Sign with TopazReset_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/canvas_Sign with TopazReset_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/canvas_Sign with TopazReset_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/span_Sign and Lock_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/a_Consents'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/td_Consent for Treatment'), 
    'Consent for Treatment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/td_Signed'), 
    'Signed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Inquiry Profile/a_Signed_btn btn-primary btn-raised btn-sm'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/input_Reason_eiereason'), 
    'automation')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Consents/Page_Informed Consent for Treatment/button_Mark as Error'))

WebUI.closeBrowser()

