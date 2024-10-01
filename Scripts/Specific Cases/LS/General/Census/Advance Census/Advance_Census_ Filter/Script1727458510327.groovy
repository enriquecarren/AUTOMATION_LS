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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Home/a_groups                                   _f7379d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Field                        Client _7d7547'), 
    'client', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Type                                _34fc29'), 
    'like', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/input_Field_filter-value'), 
    'B')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Dog Treatment Center'), 
    'Dog Treatment Center')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Satellite Office'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Cat Treatment Center'), 
    0)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/input_Field_filter-value'), 
    '')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Field                        Client _7d7547'), 
    'dob', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Type                                _34fc29'), 
    '=', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/input_Field_filter-value'), 
    '01/02/2001')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Dog Treatment Center'), 
    'Dog Treatment Center')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Satellite Office'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Cat Treatment Center'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Type                                _34fc29'), 
    '<', true)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Cat Treatment Center'), 
    'Cat Treatment Center')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Satellite Office'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Dog Treatment Center'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Type                                _34fc29'), 
    '<=', true)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Cat Treatment Center'), 
    'Cat Treatment Center')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Dog Treatment Center'), 
    'Dog Treatment Center')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Satellite Office'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Type                                _34fc29'), 
    '>', true)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Satellite Office'), 
    'Satellite Office')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Dog Treatment Center'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Cat Treatment Center'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Type                                _34fc29'), 
    '>=', true)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Dog Treatment Center'), 
    'Dog Treatment Center')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Satellite Office'), 
    'Satellite Office')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Cat Treatment Center'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/select_Type                                _34fc29'), 
    'like', true)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Dog Treatment Center'), 
    'Dog Treatment Center')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Satellite Office'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Census Advanced/div_Cat Treatment Center'), 
    0)

WebUI.closeBrowser()

