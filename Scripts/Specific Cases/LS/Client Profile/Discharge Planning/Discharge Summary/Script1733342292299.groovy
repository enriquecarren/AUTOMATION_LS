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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1560?section=dcplan')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Client Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/input_Multiple Programs_admprogram'), 
    'Automation Multiple Programs')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/input_Primary Counselor_pricouns'), 
    'Enrique Carreño')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/input_Funding Source_payorname'), 
    'Scholarship')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/input_Funding Source_payorname'), 
    '')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Precipitating EventReason for Care_ec3c9d'), 
    'Automation Precipitating Event/Reason for Care')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/select_Discharge Against Staff Advice    Di_d15691'), 
    'Pending Review', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Reason for Discharge Type_dctypereason'), 
    'Automation Reason for Discharge Type')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Outcome of Treatment_txtoutcome'), 
    'Automation Outcome of Treatment')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/span_Service_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/span_Education_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/span_Family Education_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/span_Individual Counseling_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/span_Orientation to Community Resources_check'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Plan for Continuing Care_ccplan'), 
    'Automation Plan for Continuing Care')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Living Environment at Discharge_txtliving'), 
    'Automation Environment at Discharge')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Additional Recommendations_txtadditional'), 
    'Automation Recommendations')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Summary of Treatment_txsummary'), 
    'Automation Summary of Treatment')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Condition at Discharge_txtcondition'), 
    'Automation Condition at Discharge')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/textarea_Additional Information_note'), 
    'Automation Additional Information')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/span_Sign and Lock_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Client Profile/td_Automation Multiple Programs'), 
    'Automation Multiple Programs')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Client Profile/td_Completed'), 
    'Completed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Client Profile/a_Completed_btn btn-primary btn-raised btn-sm'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Summary/Page_Discharge Summary/button_Mark as Error'))

WebUI.closeBrowser()

