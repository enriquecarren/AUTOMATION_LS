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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Client Profile/i_add'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/input_Primary Diagnosis_pridx'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/input_Program Level at Admission_program'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/input_Admission Date_dateadmission'), 
    '')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Course of Treatment_cotreatment'), 
    'Automation Course of Treatment')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Individual Therapy Highlights and _d21720'), 
    'Automation Individual Therapy Highlights and Goals')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Counselor Highlights and Goals_cou_c6fc14'), 
    'Automation Counselor Highlights and Goals')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_FamilyGuardian Participation in Tr_88b102'), 
    'Automation Family/Guardian Participation in Treatment')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Self Discovery and Resources_selfd_81c42a'), 
    'Automation Self Discovery and Resources')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Psychiatry_psychiatry'), 
    'Automation Psychiatry')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Discharge Plan_dcplan'), 
    'Automation Discharge Plan')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Explanation of Diagnostic Impressi_5c480f'), 
    'Automation Explanation of Diagnostic Impression')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Outcome Data for Individuals with _21aa50'), 
    'Automation Outcome Data for Individuals with Similar Diagnosis')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Areas for Ongoing Support_ongoingsupport'), 
    'Automation for Ongoing Support')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/textarea_Additional Information_note'), 
    'Automation Additional Information')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/span_Sign and Lock_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Client Profile/td_12042024'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Client Profile/td_Detoxification'), 
    'Detoxification')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Client Profile/td_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Client Profile/td_Signed'), 
    'Signed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Client Profile/i_Signed_fa fa-pencil'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/span_Document is signed and locked and may _4031e1'), 
    'Document is signed and locked and may not be changed.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/img'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Discharge Summary/button_Mark as Error'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Treatment Summary/Page_Client Profile/td_No Treatment Summaries'), 
    'No Treatment Summaries')

WebUI.closeBrowser()

