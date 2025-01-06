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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Client Profile/h4_Immunization'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Client Profile/i_add'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/span_-Select-'))

WebUI.setText(findTestObject('Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/span_-Select- TextArea'), 
    'Anthrax')

WebUI.sendKeys(findTestObject('Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/span_-Select- TextArea'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/span_-Select-_1'))

WebUI.setText(findTestObject('Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/span_-Select-_1 - TextArea'), 
    'Dynavax')

WebUI.sendKeys(findTestObject('Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/span_-Select-_1 - TextArea'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/input_Dose_dosenumber'), 
    '10')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/span_Vaccine_select2-selection select2-sele_9bf1b9'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/input_Leave Document_select2-search__field'), 
    'va')

WebUI.waitForPageLoad(30)

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/input_Leave Document_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/input_Date of Administration_dateadministration'), 
    GlobalVariable.Todays_Date)

WebUI.setText(findTestObject('Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/input_Date of Batch_dateofbatch'), 
    GlobalVariable.Next_Week_Date)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/input_Batch_batchnumber'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/textarea_Vaccination-emergent adverse react_de4e53'), 
    'Automation ESAVIS')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/textarea_Reason for not vaccinating (includ_79de9a'), 
    'Automation Reason')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/textarea_Note_note'), 
    'Automation Note')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Immunization/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Client Profile/p_Immunization Added'), 
    'Immunization Added')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Client Profile/td_Anthrax-adenovirus vaccine, type 4, live, oral'), 
    'Anthrax-adenovirus vaccine, type 4, live, oral')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Client Profile/td_10'), 
    '10')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Client Profile/td_11212024'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Immunization/Page_Client Profile/td_Dynavax Technologies'), 
    'Dynavax Technologies')

WebUI.closeBrowser()

