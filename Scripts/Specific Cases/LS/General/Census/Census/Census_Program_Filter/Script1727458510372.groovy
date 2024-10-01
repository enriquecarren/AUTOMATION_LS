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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/ul_All'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    'all')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Page_Home/ul_All'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Page_Home/Location Filter'), 
    'all')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Page_Home/Location Filter'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/td_Detoxification'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/td_Outpatient'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/ul_All'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    'detox')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/td_Detoxification'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/td_Outpatient'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/ul_Detoxification'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    'outpatient')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/span_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/td_Outpatient'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/td_Detoxification'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/span_'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/ul_All'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    'all')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/ul_All'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    'all')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Filters/Page_Home/Program_Filter/Page_Home/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

