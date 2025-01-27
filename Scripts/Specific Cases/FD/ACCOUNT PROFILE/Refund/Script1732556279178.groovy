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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Advance_Census/Filter/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Home/a_D Automation, D Client'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/account/1675')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/a_Refund'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/input_Payee_payorname'), 
    'D Client D Automation')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/input_Payee_payorname'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_Amount_lineamount'))

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/input_Amount_lineamount'), 
    '205')

WebUI.executeJavaScript('document.querySelector(\'input[name="lineamount"]\').value = \'205\'', null)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/button_Save'))

WebUI.doubleClick(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/h4_Success'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/h4_Success'), 
    'Success:')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/p_Refund has been processed'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/p_Refund has been processed'), 
    'Refund has been processed')

WebUI.doubleClick(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/td_Refund'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/Refund/Page_Account Profile/td_Refund'), 
    'Refund')

