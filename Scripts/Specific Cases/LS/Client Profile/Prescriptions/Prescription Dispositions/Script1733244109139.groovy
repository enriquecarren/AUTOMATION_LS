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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=prescriptions')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Client Profile/i_add'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/td_Amoxil'), 
    'Amoxil')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/td_10 Injection'), 
    '10 Injection')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/td_Injectable'), 
    'Injectable')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/td_Automation Instructions'), 
    'Automation Instructions')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/i_Prescribed_fa fa-edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/select_Enrique Carreno (no DoseSpot ID)    _386592'), 
    '111111', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/select_--Select Frequency--              As_f44237'), 
    '110', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/input_Purpose_dispopurpose'), 
    'Automation Purpose')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescription Dispositions/Page_Prescriptions/a_Return'))

WebUI.closeBrowser()

