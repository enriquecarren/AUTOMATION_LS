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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Advance_Census/Filter/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Home/a_D Automation, D Client'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Client Profile/a_attach_money                    Account Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/a_Adjustment'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/div_DateBill Date                          _84e78a'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/input_Amount_amount'), 
    '25')

WebUI.doubleClick(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/input_Amount_amount'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/input_Amount_amount'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/textarea_Note_note'), 
    'test 1')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Edit Adjustment/div_Success             Adjustment has been_edee08'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Edit Adjustment/p_Adjustment has been recorded (Note Adjust_752a1c'), 
    'Adjustment has been recorded (Note: Adjustment was not sent for Processing)')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Edit Adjustment/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/h4_Success'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/h4_Success'), 
    'Success:')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/p_Adjustment has been updated'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/ADJUSTMENT/Page_Account Profile/p_Adjustment has been updated'), 
    'Adjustment has been updated')

