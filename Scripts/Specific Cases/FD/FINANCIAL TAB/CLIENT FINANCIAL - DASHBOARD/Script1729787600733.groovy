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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

def currentdate = new SimpleDateFormat('MM/dd/yyyy HH:mm').format(new Date())

GlobalVariable.TodayDateTime = currentdate

WebUI.callTestCase(findTestCase('Common Cases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Home/div_Financial'))

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Home/div_monetization_on                                                            Client Financial'))

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/a_Dashboard'))

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/a_Collect Payment'))

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_Financial/button_Collect Payment_search_action'))

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_Financial/button_Use This Client'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_Amount_lineamount'), 
    '100')

WebUI.selectOptionByIndex(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_Financial/select_CashCheckACHCredit Card'), 
    0)

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_All Collected Payments/Page_Financial/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_My Collected Payments/Page_Financial/p_Payment has been recorded (Note Payment w_e3aaa9'), 
    'Payment has been recorded (Note: Payment was not sent for Processing)')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_My Collected Payments/Page_Financial/div_MY COLLECTED PAYMENTS'))

WebUI.delay(time)

WebUI.click(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/paymentDate'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/paymentDate'), GlobalVariable.Todays_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_My Collected Payments/Page_My Collected Payments/td_Cash'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/CLIENT FINANCIAL/Page_Financial/Page_My Collected Payments/Page_My Collected Payments/td_Cash'), 
    'Cash')

WebUI.verifyElementPresent(findTestObject('Specific Cases Repository/FD/CLIENT FINANCIAL/receivedOn', [(GlobalVariable.TodayDateTime) : GlobalVariable.TodayDateTime]), 
    0)

WebUI.closeBrowser()

