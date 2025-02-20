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

WebUI.navigateToUrl('https://site17.lsapp.cloud/dsscheck')

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/button_edit                                _bcd46a'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/li_CIWA B Assessment'))

WebUI.clickOffset(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/li_CIWA B Assessment'), 
    0, 120)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_CIWA B Assessment'), 
    'CIWA B Assessment')

WebUI.clickOffset(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/li_CIWA B Assessment'), 
    0, 200)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_CIWA B Assessment'), 
    'CIWA B Assessment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_Client Orientation'), 
    'Client Orientation')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/li_TPR Client Grievance Procedure'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_CIWA B Assessment'), 
    'CIWA B Assessment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_Client Orientation'), 
    'Client Orientation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_TPR Client Grievance Procedure'), 
    'TPR Client Grievance Procedure')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/span_'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_Client Orientation'), 
    'Client Orientation')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/td_TPR Client Grievance Procedure'), 
    'TPR Client Grievance Procedure')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/span_'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Unsigned Documentation/Unsigned Documents Page/Page_Unsigned Documents List/span_'))

WebUI.closeBrowser()

