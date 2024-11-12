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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Home/a_B Automation, B Client'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=clientprofile')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Client Profile/a_person                    Inquiry Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/a_Contacts'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/input_First Name_fname'), 
    'B Parent')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/input_Last Name_lname'), 
    'B Client')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/input_Relation to Client_reltoclient'), 
    'Parent or Guardian')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/span_Use as Emergency Contact_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/span_Parent or Guardian_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/span_Legally Entitled to Sign Consents_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/span_Same Address as Client_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/span_Include in invoice and statement email_2a24c8'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/input_E-Mail_email'), 
    'bparent@automation.com')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/span_Referral Source_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/span_Current Referral Source_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/td_11112024'), 
    '11/11/2024')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/td_B Parent B Client'), 
    'B Parent B Client')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/td_Yes'), 
    'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/td_Parent or Guardian'), 
    'Parent or Guardian')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/i_No_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Contact/button_Mark as Error'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/a_Contacts'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/i_B Parent B Client_text-danger fa fa-asterisk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Contacts/Page_Inquiry Profile/i_B Parent B Client_text-danger fa fa-excla_c9f48f'), 
    0)

WebUI.closeBrowser()

