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

WebUI.navigateToUrl('https://site17.lsapp.cloud/service')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Services/input_Search_form-control input-sm'), 
    'au')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Services/a_auutomation service test'))

WebUI.click(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/select_-- Select Type --                   _46db4f'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/select_NA Days Units'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Revise Service/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Services/p_Service  auutomation service test success_6bb6c4'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Services/p_Service  auutomation service test success_6bb6c4'), 
    'Service # auutomation service test successfully updated.')

