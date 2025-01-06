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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Home/a_A Automation, A Client'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Client Profile/a_Allergies  Vitals  Labs'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Client Profile/h4_BAL'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Client Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/input_BAL Reading_balreading'), 
    'Automation Reading')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/select_UndeterminedNegativePositive'), 
    'Positive', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/textarea_Additional Information_note'), 
    'automation additional information')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/button_Staff Signatures'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/b'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/input_-- Select Staff --_select2-search__field'), 
    'enrique')

WebUI.waitForPageLoad(0)

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/input_-- Select Staff --_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Client Profile/span_Automation Reading'), 
    'Automation Reading')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Client Profile/span_Positive'), 
    'Positive')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Client Profile/a_Started_btn btn-primary btn-raised btn-sm_564fc3'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/BAL/Page_Blood Alcohol Level/span_Document is signed and may not be changed'), 
    'Document is signed and may not be changed.')

WebUI.closeBrowser()

