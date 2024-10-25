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

WebUI.navigateToUrl('https://site17.lsapp.cloud/inquiry/show/1672')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Inquiry Profile/a_Referral Source'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Inquiry Profile/i_add'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/refsrc/create/1672')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/input_Search for Referral Source_search'), 
    'a')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/i_Search'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/i_Georgetown Behavioral Health_fa fa-arrow-down'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_First Name'), 
    'First Name')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Last Name'), 
    'Last Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Relation to Client'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Use as Emergency Contact'), 
    'Use as Emergency Contact')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Organization'), 
    'Organization')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_WorkDirect Phone'), 
    'Work/Direct Phone:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Office Phone'), 
    'Office Phone:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Mobile Phone'), 
    'Mobile Phone:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_E-Mail'), 
    'E-Mail:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Address'), 
    'Address:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_City'), 
    'City:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_State'), 
    'State:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Zip'), 
    'Zip:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Current Referral Source'), 
    'Current Referral Source')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/label_Contact is Primary Referral Source fo_381c1e'), 
    'Contact is Primary Referral Source for this person.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Inquiry Profile/td_Kay Bailey'), 
    'Kay Bailey')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Inquiry Profile/td_Georgetown Behavioral Health'), 
    'Georgetown Behavioral Health')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Inquiry Profile/i_No_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/input_Reason_eiereason'), 
    'automationtest')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Referral Source/button_Mark as Error'))

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Inquiry Profile/Referral Source/Page_Inquiry Profile/td_Kay Bailey'), 
    0)

WebUI.closeBrowser()

