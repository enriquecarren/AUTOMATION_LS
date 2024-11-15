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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=notes')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/button_New note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/span_south_west'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/a_Expand viewarrow_outward'), 
    'Expand viewarrow_outward')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/span_arrow_outward'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/a_Collapse viewsouth_west'), 
    'Collapse viewsouth_west')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/a_Cancel'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/button_New note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/li_Clinical Note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/li_Individual Progress Note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/li_Clinical Note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/a_Create            arrow_right_alt'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/input__subject'), 
    'Automation Clinical Note B Client')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/textarea_Note_textarea-1687188811798'), 
    'Automation Clinical Note test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/button_Save'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=notes')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Clinical Note'), 
    'Clinical Note')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Automation Clinical Note B Client'), 
    'Automation Clinical Note B Client')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Signed'), 
    'Signed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/i_Signed_fa fa-pencil'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/span_Document is signed and may not be changed'), 
    'Document is signed and may not be changed.')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/b_This record has been signed and locked an_a12aad'), 
    'This record has been signed and locked and may no longer be edited.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/a_Unlock and Remove Signature'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Not signed'), 
    'Not signed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/i_Signed_fa fa-pencil'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/textarea_Automation Clinical Note test'), 
    'Unlock and Remove Signatures automation test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Clinical Note/button_Save'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=notes')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Signed'), 
    'Signed')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/button_New note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/li_Case Note'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/span_arrow_right_alt'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Case Note/textarea_Note_note'), 
    'Autoamtion case note')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Case Note/select_Program Attendance                  _a823b5'), 
    'Program Attendance', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Case Note/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Case Note/button_Save'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=notes')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Case Note'), 
    'Case Note')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Progress Notes/Page_Client Profile/div_Program Attendance'), 
    'Program Attendance')

WebUI.closeBrowser()

