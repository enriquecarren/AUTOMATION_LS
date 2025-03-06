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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1556?section=dcplan')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Client Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/textarea_Individualized Objectives for Cont_2a421a'), 
    'Automation Individualized Objectives')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/textarea_Issues identified upon admission t_185eab'), 
    'Automation Issues identified')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/textarea_Clinical Recommendation Upon Disch_4f87c6'), 
    'Automation Clinical Recommendation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/select_MotivatedWillingAmbivalentResistant'), 
    'Motivated', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/select_MotivatedWillingAmbivalentResistantU_a7458e'), 
    'Willing', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/span_Sign and Lock_check'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/Save Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Client Profile/td_12032024'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Client Profile/td_Detoxification'), 
    'Detoxification')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Client Profile/td_Signed'), 
    'Signed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Client Profile/i_Signed_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Initial Discharge Plan/Page_Initial Discharge Plan/button_Mark as Error'))

WebUI.closeBrowser()

