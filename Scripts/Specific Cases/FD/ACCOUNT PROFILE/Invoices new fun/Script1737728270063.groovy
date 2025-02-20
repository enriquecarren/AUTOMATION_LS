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

WebUI.navigateToUrl('https://site17.lsapp.cloud/account/1675')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/a_Invoices'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/a_Create Invoice'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/span_Add Service'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/img_Amount_template__table-edit-icon js_edit-cell'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/select_Select Service                      _a32a17'), 
    '5 Panel Drug Screen', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Terms_bill-config__textarea w-full_fd4e29'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Footer_bill-config__textarea w-ful_e6226a'), 
    'test 2')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Public notes_bill-config__textarea_e0e065'), 
    'automation')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Private notes_bill-config__textare_c3c1df'), 
    'private notes')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/button_Save (draft)                        _ea8e62'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/div_Success             Invoice has been su_e8580a'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/p_Invoice has been successfully saved'), 
    'Invoice has been successfully saved.')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/a_Invoices'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/span_Draft'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/span_Draft'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Account Profile/a_Draft_btn btn-primary btn-raised btn-sm h_2e9c4c'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/button_Select an Category Type'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/button_Percent'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/a_Amount'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/input_Discount_bill-config__date w-full'), 
    '25')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/button_Save                                 check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/span_'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/span_Download'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/button_Save  Send To                       _b8f6a8'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/a_Save  send to Portal'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/span_Send to Portal'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/div_Edit Invoice INV-20250124-1 - Sent     _4a81db'))

WebUI.closeBrowser()

