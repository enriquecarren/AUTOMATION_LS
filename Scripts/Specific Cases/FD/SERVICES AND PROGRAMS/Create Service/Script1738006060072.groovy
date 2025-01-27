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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Services/i_add'))

WebUI.click(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/input__form-control2'))

WebUI.setText(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/input__form-control2'), 'test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Add Service/select_-- Select Type --                   _46db4f'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Add Service/input_CPT Code_form-control'), 
    'des322')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Add Service/span_Service is Billable_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Add Service/span_Service May Generate Charge_check'))

WebUI.click(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/select_-- Select Type --                   _46db4f'))

WebUI.click(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/select_--not-selected--                                                                    Per Diem                                                                    Per Service'))

WebUI.click(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/select_NA                                                                    Days                                                                    Units'))

WebUI.click(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/startDateservices'))

WebUI.setText(findTestObject('Specific Cases Repository/FD/SERVICES/Page_Add Service/startDateservices'), GlobalVariable.Todays_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/SERVICES/Page_Add Service/button_Save'))

