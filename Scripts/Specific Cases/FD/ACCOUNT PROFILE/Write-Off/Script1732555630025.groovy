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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Home/a_D Automation, D Client'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Client Profile/div_Account Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/a_Write-Off'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/input_Payor_payorname'), 
    'Blue')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/input_Payor_payorname'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/input_Amount_amount'), 
    '0.00')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/input_Amount_amount'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/textarea_Note_note'), 
    'test automated')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Edit Write-off/h4_Success'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Edit Write-off/h4_Success'), 
    'Success:')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Edit Write-off/p_Write-off has been recorded (Note Write-o_2814c3'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Edit Write-off/p_Write-off has been recorded (Note Write-o_2814c3'), 
    'Write-off has been recorded (Note: Write-off was not sent for Processing)')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Edit Write-off/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/h4_Success'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/h4_Success'), 
    'Success:')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/p_Write-off has been updated'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/WRITE-OFF/Page_Account Profile/p_Write-off has been updated'), 
    'Write-off has been updated')

WebUI.closeBrowser()

