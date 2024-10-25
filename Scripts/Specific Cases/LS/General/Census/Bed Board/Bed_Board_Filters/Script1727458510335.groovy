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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Home/a_bed                     Bed Board'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/dbkeymetrics/bedboard')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Gender Identities'), 
    '0', true)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_Female'), 
    'Female')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_Male'), 
    'Male')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Gender Identities'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_Female'), 
    'Female')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_Male'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Gender Identities'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_Male'), 
    'Male')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_Female'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Gender Identities'), 
    7, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_C Automation, C Client 1674'), 
    'C Automation, C Client 1674')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Locations                       _fac816'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Gender Identities'), 
    '0', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Locations                       _fac816'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_A Automation, A Client 1672'), 
    'A Automation, A Client 1672')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_B Automation, B Client 1673'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_C Automation, C Client 1674'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Locations                       _fac816'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_B Automation, B Client 1673'), 
    'B Automation, B Client 1673')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_A Automation, A Client 1672'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_C Automation, C Client 1674'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Locations                       _fac816'), 
    '5', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_C Automation, C Client 1674'), 
    'C Automation, C Client 1674')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_B Automation, B Client 1673'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/span_A Automation, A Client 1672'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Bed_Board/Page_Bed Board/select_All Locations                       _fac816'), 
    '0', FailureHandling.STOP_ON_FAILURE)

