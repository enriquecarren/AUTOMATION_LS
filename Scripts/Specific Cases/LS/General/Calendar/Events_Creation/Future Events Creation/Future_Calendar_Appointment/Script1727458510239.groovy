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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Page_Home/a_Calendar'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/button_Create new'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/label_Appointment'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/span_Select Client'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Patien Name'), 
    'B Auto')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Patien Name'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/span_Select Service'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Patien Name'), 
    '5 ')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Patien Name'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/input_Title_title_'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/input_Title_title_'), 
    'Future Automation Test with B Automation, B Client MR# 24-11007: 5 Panel Drug Screen')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Date'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Date'), 
    GlobalVariable.Next_Week_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock'), 
    '1500')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/End Time Clock'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/End Time Clock'), 
    '1600')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/button_Reminder__simple-switch-track'))

WebUI.setText(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Event/Page_Calendar/input_Reminder_select2-search__field'), 
    '15')

WebUI.sendKeys(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Event/Page_Calendar/input_Reminder_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/input_Notes_notes'), 
    'Automation Future Test Note')

WebUI.scrollToElement(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Save'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Save'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Next Week Arrow'))

WebUI.scrollToElement(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Automation Test with A Automation, A Clie_8f5a4c - Future'), 
    0)

WebUI.mouseOver(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Automation Test with A Automation, A Clie_8f5a4c - Future'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/span_Future Automation Test with B Automation, B'), 
    'Future Automation Test with B Automation, B Client MR# 24-11007: 5 Panel Drug Screen')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/span_15 minutes before'), 
    '15 minutes before')

WebUI.click(findTestObject('Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Automation Test with A Automation, A Clie_8f5a4c - Future'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/b_Revise Schedule for'), 
    'Revise Schedule for')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_A Client A Automation'), 
    'B Client B Automation')

WebUI.closeBrowser()

