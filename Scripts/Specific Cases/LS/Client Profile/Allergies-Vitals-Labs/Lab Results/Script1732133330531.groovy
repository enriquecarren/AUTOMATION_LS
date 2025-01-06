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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1556?section=medicalassess')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/h4_Lab Results'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/select_Upload Lab ResultNew Lab Result'), 
    'upload_no', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/select_-- Please Select --COVID-19 RapidCOV_75c690'), 
    'COVID-19 PCR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/select_-- Please Select --NegativePositiveU_b19f9e'), 
    'Positive', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/textarea_Note_labresult_notes'), 
    'Automation Note')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/span_Sign and Lock_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/p_Lab Result Successfully Saved'), 
    'Lab Result Successfully Saved!')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/td_COVID-19 PCR'), 
    'COVID-19 PCR')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/td_Positive'), 
    'Positive')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Lab Results/Page_Client Profile/td_Staff Signed'), 
    'Staff Signed')

WebUI.closeBrowser()

