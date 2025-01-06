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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Client Profile/h4_CBG                                     _f9629b'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Client Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Glucose Reading/input_Glucose Reading_reading'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Glucose Reading/input_Units_units'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Glucose Reading/textarea_Additional Information_note'), 
    'Automation Additional Information')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Glucose Reading/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Client Profile/a_Allergies  Vitals  Labs'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/CBG Level/Page_Client Profile/td_11'), 
    '11')

WebUI.closeBrowser()

