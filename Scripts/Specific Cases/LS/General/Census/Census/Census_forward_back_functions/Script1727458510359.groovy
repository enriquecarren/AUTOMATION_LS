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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Forward_Back_Functions/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Forward_Back_Functions/Page_Home/a_bed                     Bed Board'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/dbkeymetrics/bedboard')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Forward_Back_Functions/Page_Bed Board/span_homepage'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Forward_Back_Functions/Page_Home/span_Advanced Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Forward_Back_Functions/Page_Census Advanced/span_homepage'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Forward_Back_Functions/Page_Home/a_co_present                 Client Face sheets'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Forward_Back_Functions/Page_Client Face Sheets/span_homepage'))

WebUI.closeBrowser()

