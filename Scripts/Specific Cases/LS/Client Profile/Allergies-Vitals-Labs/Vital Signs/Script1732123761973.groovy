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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/h4_Vital Signs'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/input_Temperature_temp'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/input_Pulse_pulse'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/input_Blood Pressure_bp'), 
    '12 13')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/input_Respiration_resp'), 
    '14')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/input_O 2 Saturation_o2'), 
    '15')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/input_Inhaled Oxygen Concentration_inhaled__06efa9'), 
    '16')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/input_Additional Information_additional'), 
    'Automation Additional Information')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Vital Signs/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/td_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/td_10'), 
    '10')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/td_11'), 
    '11')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/td_14'), 
    '14')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/td_15'), 
    '15')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Vital Signs/Page_Client Profile/td_Automation Additional Information'), 
    'Automation Additional Information')

WebUI.closeBrowser()

