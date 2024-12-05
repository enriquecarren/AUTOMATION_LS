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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1560?section=dcplan')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/i_add'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_Atrovent, 15 mg, 39 Capsule, Injectable,_fb55b0'), 
    'Atrovent, 15 mg, 39 Capsule, Injectable, Five Times a Day')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/td_Duricef'), 
    'Duricef')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/textarea_Special InstructionsAdditional Inf_441e23'), 
    'Automation Special Instruccions')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/span_List Given to Client_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/a_Discharge Planning'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/td_12042024'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/td_Automation Test'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Client Profile/a_Signed_btn btn-primary btn-raised btn-sm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/img'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Medications List/Page_Medication List at Discharge/button_Mark as Error'))

WebUI.closeBrowser()

