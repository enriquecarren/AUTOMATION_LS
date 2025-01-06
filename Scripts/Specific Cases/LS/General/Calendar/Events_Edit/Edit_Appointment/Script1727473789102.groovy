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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Page_Home/a_Calendar'))

WebUI.scrollToElement(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Automation Test with A Automation, A Clie_8f5a4c'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Automation Test with A Automation, A Clie_8f5a4c'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock - Edit'))

WebUI.setText(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock - Edit'), 
    '10')

WebUI.setText(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock - Edit'), 
    '00')

WebUI.setText(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock - Edit'), 
    'AM')

WebUI.waitForPageLoad(30)

WebUI.scrollToElement(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Save Revision'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Save Revision'))

WebUI.mouseOver(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/a_Automation Test with A Automation, A Clie_8f5a4c_ - Edit'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/span_10 - 1030 AM_1'), 
    '10 - 10:30 AM')

WebUI.closeBrowser()

