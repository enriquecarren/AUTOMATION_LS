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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/a_Diagnosis'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/i_add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/select_--not-selected--PrimarySecondaryThir_30d0a6'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/select_-- Please Select --Chemical Dependen_f373e3'), 
    'Chemical Dependency', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/select_--Select-Diagnosis--Alcohol Abuse (F_cf7803'), 
    '670', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/p_First diagnosis start date changed to the_f6720d'), 
    'First diagnosis start date changed to the date of first admission.')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/td_Alcohol use disorder, severe (F10.20)'), 
    'Alcohol use disorder, severe (F10.20)')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/td_Primary'), 
    'Primary')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/td_Chemical Dependency'), 
    'Chemical Dependency')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/i_add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/select_--not-selected--PrimarySecondaryThir_30d0a6'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/select_-- Please Select --Chemical Dependen_f373e3'), 
    'Chemical Dependency', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/select_--Select-Diagnosis--Alcohol Abuse (F_cf7803'), 
    '336', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/p_Conflict of priorities. There are already_911d33'), 
    'Conflict of priorities. There are already diagnoses with the same priority.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/button_Save Anyway'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/td_11212024'), 
    GlobalVariable.Todays_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/a_Automation Test_btn btn-primary btn-raise_969243'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/input_Reason_eiereason'), 
    'automation test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/button_Mark as Error'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Profile/a_Automation Test_btn btn-primary btn-raise_969243_1'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/input_Reason_eiereason'), 
    'automation test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Diagnosis/Page_Client Diagnosis/button_Mark as Error'))

WebUI.closeBrowser()

