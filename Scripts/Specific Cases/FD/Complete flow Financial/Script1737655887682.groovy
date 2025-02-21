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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1558?section=notes')

WebUI.click(findTestObject('Specific Cases Repository/FD/note generate charge/button_NewNote'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Client Profile/li_Connections Progress Note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Client Profile/a_Create            arrow_right_alt'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Connections Progress Note/service provided'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Connections Progress Note/input_Subject_subject'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Connections Progress Note/input_Subject_subject'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Connections Progress Note/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Connections Progress Note/button_Save'))

WebUI.newTab('')

WebUI.navigateToUrl('https://site17.lsapp.cloud/financialdashboard/chargesdashboard#')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Charges Dashboard/div_31.9K'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Charges Dashboard/td_Connections Progress Note'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Charges Dashboard/td_Connections Progress Note'), 
    'Connections Progress Note')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Charges Dashboard/span_Inquiry ID_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/note generate charge/Page_Charges Dashboard/button_Approve'))

