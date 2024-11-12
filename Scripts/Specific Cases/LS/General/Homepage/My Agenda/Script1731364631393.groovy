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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/a_Homepage'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/span_Admission Agreement'), 
    'Admission Agreement')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/span_C Automation, C Client'), 
    'C Automation, C Client')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/a_Automation Event'), 
    'Automation Event')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/a_Blocked for Automation Block'), 
    'Blocked for: Automation Block')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/a_Automation Test with A Automation, A Clie_8f5a4c'), 
    'Automation Test with A Automation, A Client MR# 24-11006: 5 Panel Drug Screen')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/a_1.2 Automatically Enroll Clients in Selec_caac5a'), 
    '1.2 Automatically Enroll Clients in Selected Location/Program(s)')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/span_B Automation, B Client'), 
    'B Automation, B Client')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/span_C Automation, C Client_1'), 
    'C Automation, C Client')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Homepage/Page_Home/span_A Automation, A Client'), 
    'A Automation, A Client')

WebUI.closeBrowser()

