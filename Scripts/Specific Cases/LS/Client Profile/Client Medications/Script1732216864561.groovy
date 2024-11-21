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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/span_Medication_select2-selection select2-s_4864e1'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Cancel_select2-search__field'), 
    'aspi')

WebUI.waitForPageLoad(30)

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Strength_dose'), 
    '10')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/span_Route_select2-selection select2-select_4412bc'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Cancel_select2-search__field'), 
    'oral')

WebUI.waitForPageLoad(30)

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

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
    GlobalVariable.Last_Week_Date)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Last Taken_lasttaken'), 
    GlobalVariable.Todays_Date)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/select_-- Please Select --                 _09aff5'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/select_-- Please Select --                 _8e469b'), 
    'Yes', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Verified_isverified'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_100 (acetaminophen 250 MG  aspirin 250 M_65eba3'), 
    '{100 (acetaminophen 250 MG / aspirin 250 MG / caffeine 65 MG Oral Tablet [Excedrin]) / 24 (acetamino Dose: 10 Frequency: 11')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_11142024'), 
    GlobalVariable.Last_Week_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/i_add_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Centrally Stored Medications/h3_Centrally Stored Medications for C Clien_5cad7f'), 
    'Centrally Stored Medications for C Client C Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Centrally Stored Medications/td_100 (acetaminophen 250 MG  aspirin 250 M_edef04'), 
    '{100 (acetaminophen 250 MG / aspirin 250 MG / caffeine 65 MG Oral Tablet [Excedrin]) / 24 (acetamino - 11')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Centrally Stored Medications/span_Sign and Lock_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Centrally Stored Medications/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_11212024'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_Satellite Office'), 
    'Satellite Office')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/i_1 Medication(s) Need a Disposition Assigned'), 
    '1 Medication(s) Need a Disposition Assigned')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/i_add_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/h3_Medication ReconciliationDisposition for_9c7b23'), 
    'Medication Reconciliation/Disposition for C Client C Automation')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/button_Reported_btn btn-primary btn-raised _4ce682'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/span_First Dose Immediately_check'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/select_Select Frequency                    _26ed09'), 
    '110', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Medication DispositionReconciliation/a_Return to Previous'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/a_Orders'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_100 (acetaminophen 250 MG  aspirin 250 M_8937bb'), 
    '{100 (acetaminophen 250 MG / aspirin 250 MG / caffeine 65 MG Oral Tablet [Excedrin]) / 24 (acetaminophen 250 MG / aspirin 250 MG / diphenhydramine cit')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_Enrique Carreno'), 
    'Enrique Carreno')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/a_Note Order_btn btn-primary btn-raised btn-sm'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Order/input_Mark as Entered in Error_locker print_2e6d18'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Order/input_EIE Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Order/button_Save Error Status'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Order/a_Return to Previous'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Order/span_Back to Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_No medical orders to display at this time'), 
    'No medical orders to display at this time.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/a_Client Medications'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/a_OrderedVerified_btn btn-primary btn-raise_79b4dc'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Reported Medication/button_Mark as Error'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_No Client Reported Medications'), 
    'No Client Reported Medications.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/a_Satellite Office_btn btn-primary btn-rais_d7a22f'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Centrally Stored Medications/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Centrally Stored Medications/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Centrally Stored Medications/button_Mark as Error'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Medications/Page_Client Profile/td_No Centrally Stored Medications'), 
    'No Centrally Stored Medications.')

WebUI.closeBrowser()

