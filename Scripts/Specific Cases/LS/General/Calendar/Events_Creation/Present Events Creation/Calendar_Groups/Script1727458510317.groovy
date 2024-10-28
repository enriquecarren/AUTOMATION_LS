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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Home/a_Calendar'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/div_Week'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/button_Create new'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/label_Group'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Groups Selector'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/input_Loading_select2-search__field'), 
    '1.2')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/input_Loading_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Date Warning'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/input_Title_title_'), 
    '1.2 Automatically Enroll Clients in Selected Location/Program(s)')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Date'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Date'), 
    GlobalVariable.Todays_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Start Time'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Start Time'), 
    '1300')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/End Time'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/End Time'), 
    '1400')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Groups Selector'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/input_Loading_select2-search__field'), 
    '1.2')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/input_Loading_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/span_Select Clients'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/label_C Automation, C Client MR 24-11008'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/label_B Automation, B Client MR 24-11007'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/View Enrolled Patients'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/td_C Automation, C Client MR 24-11008'), 
    'C Automation, C Client MR# 24-11008')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/td_B Automation, B Client MR 24-11007'), 
    'B Automation, B Client MR# 24-11007')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/View Enrolled Patients'))

WebUI.scrollToElement(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/a_Save'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/a_Save'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Calendar Event'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/label_Start Group Session'), 
    'Start Group Session')

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/input_Start Group Session_isdocumentedgroup'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/a_Save Revision'))

WebUI.mouseOver(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/Calendar Event'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Group/Page_Calendar/span_Automation Test 1.2 Automatically Enro_f39ad6'), 
    '1.2 Automatically Enroll Clients in Selected Location/Program(s)')

WebUI.closeBrowser()

