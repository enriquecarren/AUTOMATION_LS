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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Home/span_Client Face sheets'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/report/clientfacesheets')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/button_Show Data'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Patient'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_A Automation, A Client'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/ul_A Automation, A Client'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Patient'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_B Automation, B Client'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_C Automation, C Client'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_ A'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_B'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_C'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Unit'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Mens Residential'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Womens Residential'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_Men'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_ Womens'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Room'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_2'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Bed'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_1A'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_2A'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_1A'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_2A'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Admission Location'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Cat Treatment Center'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Dog Treatment Center'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_Cat'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Admission Location'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Satellite Office'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_Dog'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_Satellite'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Admission Program'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Detoxification'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Outpatient'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_Detox'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    '24-11008')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/span_Outpatient'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_Detoxification'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/Room'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    '24-11006')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/li_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11006'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11007'), 
    '24-11007')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Home/Census/Clients Face Sheets/Clients Face Sheet Search/Page_Client Face Sheets/td_24-11008'), 
    0)

WebUI.closeBrowser()

