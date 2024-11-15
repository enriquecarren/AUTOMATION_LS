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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Home/a_B Automation, B Client'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_B Client B Automation'), 
    'B Client B Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_01022001'), 
    '01/02/2001')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Dog Treatment Center'), 
    'Dog Treatment Center')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Detoxification'), 
    'Detoxification')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_08282024'), 
    '08/28/2024')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Female'), 
    'Female')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_(833) 957-2888'), 
    '(833) 957-2888')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_B2automation.com'), 
    'B2@automation.com')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Emergency Contact'), 
    'Emergency Contact')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_B Parent B Client'), 
    'B Parent B Client')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Parent or Guardian'), 
    'Parent or Guardian')

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_mail                                     _fbd7a2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Timeline'), 
    'Timeline')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Future Automation Test with B Automatio_ed8b34'), 
    'Future Automation Test with B Automation, B Client MR# 24-11007: 5 Panel Drug Screen')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Future Automation Test 1.2 Automaticall_19fd63'), 
    'Future Automation Test 1.2 Automatically Enroll Clients in Selected Location/Program(s)')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_1.2 Automatically Enroll Clients in Sel_b30868'), 
    '1.2 Automatically Enroll Clients in Selected Location/Program(s)')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Past Automation Test with B Automation,_e57f32'), 
    'Past Automation Test with B Automation, B Client MR# 24-11007: 5 Panel Drug Screen')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Past Automation Test 1.2 Automatically _f068c8'), 
    'Past Automation Test 1.2 Automatically Enroll Clients in Selected Location/Program(s)')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_0300PM - 0400PM'), 
    '03:00PM - 04:00PM')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_0100PM - 0200PM'), 
    '01:00PM - 02:00PM')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/span_arrow_outward'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Timeline/span_Last  30 days'), 
    'Last 30 days')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Timeline/a_undo                    Back to Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_encrypted                    Access Log'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client  Inquiry Access - B Client B Au_b4b842/h4_Client  Inquiry Access Log for B Client _3d3cc6'), 
    'Client / Inquiry Access Log for B Client B Automation')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_news                    All Documents'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/h3_All Documents for - B Client B Automation'), 
    'All Documents for - B Client B Automation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_Enrique Carreno'), 
    'Enrique Carreno')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_Episode Creation Information'), 
    'Episode Creation Information')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_1557'), 
    '1557')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_1630'), 
    '1630')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/span_chevron_left'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_summarize                Facesheet'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Facesheet - B Client B Automation/td_Blue Cross Blue Shield of Texas'), 
    'Blue Cross Blue Shield of Texas')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Facesheet - B Client B Automation/td_gdjdghdjgh'), 
    'gdjdghdjgh')

WebUI.closeBrowser()

