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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=clientmeds')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Medication_medication'), 
    'Aspirin')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Strength_dose'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/select_-- Please Select --                 _ff1889'), 
    'Nasal', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Frequency_frequency'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/textarea_Instructions_instructions'), 
    'Automation Instructions')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_PurposeRationale_purpose'), 
    'Automation Purpose')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Prescriber_prescriber'), 
    'Automation Prescriber')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Pharmacy_pharmacy'), 
    'Automation Pharmacy')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_When Started_whenstart'), 
    'Automation Started')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Last Taken_lasttaken'), 
    'Automation Last Taken')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/select_Yes                                    No'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/select_-- Please Select --                 _09aff5'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/select_-- Please Select --                 _8e469b'), 
    'Yes', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Verified_isverified'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_01142025'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_Aspirin Dose 10 Frequency 11'), 
    'Aspirin Dose: 10 Frequency: 11')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_Automation Started'), 
    'Automation Started')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_Automation Last Taken'), 
    'Automation Last Taken')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_No'), 
    'No')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_Yes'), 
    'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_Reported'), 
    'Reported')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/i_Reported_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/a_Set Disposition'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/i_Reported_fa fa-edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/select_Select Frequency                    _26ed09'), 
    '110', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/span_First Dose Immediately_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/button_Save'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=clientmeds')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_OrderedVerified'), 
    'Ordered/Verified')

WebUI.closeBrowser()

