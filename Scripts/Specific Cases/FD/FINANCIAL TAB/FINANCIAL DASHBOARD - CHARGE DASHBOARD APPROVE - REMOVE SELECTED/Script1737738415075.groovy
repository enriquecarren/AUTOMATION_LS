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

WebUI.navigateToUrl('https://site17.lsapp.cloud/financialdashboard/chargesdashboard')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/div_CHARGES QUEUE                          _9a2a2a'))

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/span_Remove_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/span_Remove_check_1'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/button_Approve Selected'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/p_Approve processed successfully'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/p_Approve processed successfully'), 
    'Approve processed successfully!')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/span_Remove_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/span_Remove_check_1'))

WebUI.click(findTestObject('Specific Cases Repository/FD/Charge queue - approval charges/Remove selected'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/Charge queue - approval charges/Page_Charges Dashboard/p_Remove processed successfully'), 
    'Remove processed successfully!')

