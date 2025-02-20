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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/i_add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_--Select Medication--               _4550eb'), 
    'Amoxil', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_Strength_Strength'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_-- Not Selected --InhalerInjectionLo_92d90e'), 
    'Injection', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_-- Not Selected --At MealsDailyEvery_c99cb7'), 
    'Daily', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_Quantity_qtyavail'), 
    '11')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_01234'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/textarea_Purpose_purpose'), 
    'Automation Purpose')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/textarea_Instructions_Directions'), 
    'Automation Instructions')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_Enrique Carreno            Albert Da_40526a'), 
    '1278', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_Enrique Carreno            Albert Da_40526a'), 
    '1302', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_Prescriber_prescriber'), 
    'Automation Prescriber')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_Pharmacy_PharmacyStoreName'), 
    'Automation Pharmacy')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_When Started_whenstart'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_Last Taken_lasttaken'), 
    '14')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_----        Yes        No'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_----    Yes    No'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/select_----    Yes    No_1'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_Total Quantity_qtyavail'), 
    'Automation Total Quantity')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_Quantity for Each Dose_qtydose'), 
    'Automation Quantity for Each Dose')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/input_RX_rxnumber'), 
    '081088')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_New Prescription/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_12032024'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_Amoxil'), 
    'Amoxil')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_10'), 
    '10')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_Injectable'), 
    'Injectable')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_Daily'), 
    'Daily')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_Automation Prescriber'), 
    'Automation Prescriber')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_Automation Instructions'), 
    'Automation Instructions')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/td_Prescribed'), 
    'Prescribed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/i_Prescribed_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Prescription/span_Controlled Substance_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Prescription/span_Sign and Lock_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Prescription/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Client Profile/i_Prescribed_fa fa-pencil'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Prescription/img'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Prescription/span_Document may not be changed'), 
    'Document may not be changed.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Prescription/span_Enter in Error_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Prescriptions/Prescriptions/Page_Prescription/button_Save_1'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=prescriptions')

WebUI.verifyTextNotPresent('', GlobalVariable.Todays_Date)

WebUI.closeBrowser()

