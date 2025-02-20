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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1560?section=finance')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Client Profile/i_add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/select_--not-selected--Scholarship'), 
    '1560', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Description_description'), 
    'test automation estimate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/select_--not-selected--YesNoUnknown'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_chevron_left            homepage       _3fa348'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Individual Maximum Out of _9e18e0'), 
    '22')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Indiviual Out of Pocket Me_23d632'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Indiviual Out of Pocket Me_23d632'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Individual Maximum Out of _9e18e0'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Indiviual Out of Pocket Me_23d632'), 
    '32')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_In Network Indiviual Out of Pocket Met YTD'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Family Maximum Out of Pock_7462d8'), 
    '45')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/a_SERVICE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/select_-- Please select --5 Panel Drug Scre_5f4c46'), 
    '22', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_Unit Cost'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Unit Cost_s_unitcost'), 
    '233')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/button_Add'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/canvas_Name_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/canvas_Staff Signature_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/button_Save'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/td_22'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/td_22'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/a_Default Entity_btn btn-info btn-raised btn-sm'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/i_Default Entity_fa fa-eye'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/a_Cancel'))

WebUI.closeBrowser()

