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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Home/div_groups                                 _eea1bb'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Home/a_co_present                 Client Face sheets'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/report/clientfacesheets')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Locations                       _863db7'), 
    '22', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Locations                       _863db7'), 
    '17', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Locations                       _863db7'), 
    '18', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Locations                       _863db7'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Programs                        _aea83e'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Programs                        _aea83e'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Programs                        _aea83e'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Units                           _3d629c'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/select_All Units                           _3d629c'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/button_Show Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Clients Face Sheets/CLients Face Sheets Filters/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.closeBrowser()

