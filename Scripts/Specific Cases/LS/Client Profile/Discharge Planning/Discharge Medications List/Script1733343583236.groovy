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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=dcplan')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/i_add'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_01152025'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_Aspirin, 10, , Once Immediately'), 
    'Aspirin, 10, , Once Immediately')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_Automation Purpose'), 
    'Automation Purpose')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_No'), 
    'No')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/span_Continue at Discharge'), 
    'Continue at Discharge')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_01152025_1'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_No null refill(s)'), 
    'No null refill(s)')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/textarea_Special InstructionsAdditional Inf_441e23'), 
    'Automation Special Instructions')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/span_List Given to Client_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/button_Save'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=dcplan')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/td_01152025'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/td_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/td_Signed'), 
    'Signed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/i_Signed_fa fa-pencil'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/img'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/span_Document is signed and may not be changed'), 
    'Document is signed and may not be changed.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/button_Mark as Error'))

WebUI.closeBrowser()

