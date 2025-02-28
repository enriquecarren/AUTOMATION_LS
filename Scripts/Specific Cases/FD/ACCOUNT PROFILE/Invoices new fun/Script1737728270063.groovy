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

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/a_InvoicesTab'))

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

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Public notes_bill-config__textarea_e0e065'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Public notes_bill-config__textarea_e0e065'), 
    ' automated enter more lines')

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/a_Create Invoice'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Private notes_bill-config__textare_c3c1df'), 
    'private notes')

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/span_Draft'))

WebUI.verifyElementText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/message invoice success'), 
    'Invoice has been successfully saved.')

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/a_InvoicesTab'))

WebUI.waitForElementPresent(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/pencilEdit'), 
    10)

WebUI.scrollToElement(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/pencilEdit'), 
    100)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/pencilEdit'))

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/addService'))

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/pencilService'))

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/dropdownServiceadd'))

WebUI.selectOptionByValue(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/dropdownServiceadd'), 
    'Assessment', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Terms_bill-config__textarea w-full_fd4e29'), 
    'test 2')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Terms_bill-config__textarea w-full_fd4e29'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Terms_bill-config__textarea w-full_fd4e29'), 
    'test new line for this')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Footer_bill-config__textarea w-ful_e6226a'), 
    'TEST AUTOMATED 3')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Footer_bill-config__textarea w-ful_e6226a'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Footer_bill-config__textarea w-ful_e6226a'), 
    'NEW LINE 2')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Public notes_bill-config__textarea_e0e065'), 
    'automation')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Public notes_bill-config__textarea_e0e065'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Public notes_bill-config__textarea_e0e065'), 
    ' automated enter more lines')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Create Invoice/textarea_Private notes_bill-config__textare_c3c1df'), 
    'private notes')

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/button_Save                                 check'))

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/span_menu3dots'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/span_Download'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/button_Save  Send To                       _b8f6a8'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/a_Save  send to Portal'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/span_Send to Portal'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/NEW INVOICES/Page_Edit Invoice INV-20250124-1 - Draft/div_Edit Invoice INV-20250124-1 - Sent     _4a81db'))

WebUI.closeBrowser()

