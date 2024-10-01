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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/label_Search'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/input_Search_form-control input-sm'), 
    'b')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_B Automation, B Client'), 
    'B Automation, B Client')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/A Client'), 
    0)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/input_Search_form-control input-sm'), 
    '')

WebUI.sendKeys(findTestObject('Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/input_Search_form-control input-sm'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/button_Toggle Column(s)'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_MRN'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_DOB'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Admission'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Program Admission'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Program'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Location'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Primary Counselor'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Unit - Room - Bed'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Authorized To'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Referral Source'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Proj Discharge'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Payor'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_MRN'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_DOB'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Admission'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Program Admission'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Program'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Location'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Primary Counselor'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Unit - Room - Bed'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Authorized To'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Referral Source'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Proj Discharge'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Payor'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/label_Search'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/input_Search_form-control input-sm'), 
    'b')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_B Automation, B Client'), 
    'B Automation, B Client')

WebUI.verifyElementNotPresent(findTestObject('Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/A Client'), 
    0)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/input_Search_form-control input-sm'), 
    '')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/button_Toggle Column(s)'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_MRN'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_DOB'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Admission'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Program Admission'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Program'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Location'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Primary Counselor'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Unit - Room - Bed'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Authorized To'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Referral Source'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Proj Discharge'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_Payor'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_MRN'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_DOB'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Admission'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Program Admission'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Program'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Location'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Primary Counselor'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Unit - Room - Bed'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Authorized To'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Referral Source'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/th_Proj Discharge'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/label_Search'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/input_Search_form-control input-sm'), 
    'b')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Census_Searchin_and_Toggle_Columns/Page_Home/a_B Automation, B Client'), 
    'B Automation, B Client')

WebUI.closeBrowser()

