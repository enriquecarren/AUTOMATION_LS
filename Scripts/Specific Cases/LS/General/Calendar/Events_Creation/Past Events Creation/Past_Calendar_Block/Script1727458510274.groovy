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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Home/a_Calendar'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/div_Week'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/button_Create new'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/label_Block'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/input_Title_title_'), 
    'Past Automation Block')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Date'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Date'), 
    GlobalVariable.Last_Week_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Start Time Clock'), 
    '1600')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/div_Schedule                               _3f20bf'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/input_Notes_notes'), 
    'Automation Block Note')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/a_Save'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Appointment/Page_Calendar/Previus Week Arrow'))

WebUI.mouseOver(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/a_Blocked for Automation Block - Past'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/span_Blocked for Past Automation Block'), 
    'Blocked for: Past Automation Block')

/*WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Calendar/Calendar_Events/Calendar_Events_Creation/Block/Page_Calendar/span_45 minutes before'), 
    '45 minutes before')*/
WebUI.closeBrowser()

