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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=laborders')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/i_add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/select_-- Please select --Carreno, Enrique NPI'), 
    '1302', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/select_Urine Specimen Container            _9d61b4'), 
    'OFC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/select_Frozen                              _7e1fe1'), 
    'F', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/select_Urine                               _a20f86'), 
    'OF', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/textarea_Rationale_rationale_text1'), 
    '10')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/a_Lab Tests'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/span_Select Test(s)'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/input_checkbox_1'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/a_Requisition'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/h5_Patient Name B Client B Automation'), 
    'Patient Name: B Client B Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/h5_MRN 24-11007'), 
    'MRN: 24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/h5_Date of Birth 01022001'), 
    'Date of Birth: 01/02/2001')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/h5_Facility Name Dog Treatment Center'), 
    'Facility Name: Dog Treatment Center')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/h5_Performing Lab Dominion'), 
    'Performing Lab: Dominion')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/b_Results'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/button_Submit Ordersend'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/p_Successfully submitted Lab Order'), 
    'Successfully submitted Lab Order.')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/div_This Order Has Been Submitted and No Fu_d09c60'), 
    'This Order Has Been Submitted and No Further Changes can be made')

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=laborders')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/h5_Initiated'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/h5_Requisitions'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/td_11222024'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/td_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/td_Enrique Carreno'), 
    'Enrique Carreno')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/span_Submitted'), 
    'Submitted')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/h5_Results'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/h5_All'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Client Profile/a_Submitted_btn btn-primary btn-raised btn-xs'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/span_Entered in Error_check'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Lab Orders/Page_Lab Order/button_Mark as Error'))

WebUI.closeBrowser()

