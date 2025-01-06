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

// Iniciar sesión y navegar a la página del pago
WebUI.callTestCase(findTestCase('Common Cases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

// Navegar a la sección de pagos
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Home/Census/Advance_Census/Filter/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Home/a_A Automation, A Client'))

// Navegar al perfil del cliente
WebUI.navigateToUrl('https://site17.lsapp.cloud/account/1672')

// Seleccionar la opción de Collect Payment
WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/CollectPaymentBttn'))

// Seleccionar el pagador (payor)
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_Payor_payorname'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/div_A Client A Automation'))

// Introducir la cantidad
WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_Amount_lineamount'), 
    '100')

WebUI.scrollToPosition(0, 120)

// Seleccionar el método de pago "Credit Card" desde el dropdown
WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_CashCheckACHCredit Card'))

WebUI.selectOptionByLabel(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_CashCheckACHCredit Card'), 
    'Credit Card', false)

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_namecc'))

WebUI.setText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_namecc'), 
    'Mike Due', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_mmyy'))

WebUI.selectOptionByLabel(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_mmyy'), 
    'Jun (06)', false)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_yyyy'), 
    FailureHandling.STOP_ON_FAILURE)

// Llenar los datos de la tarjeta de crédito
WebUI.selectOptionByLabel(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_yyyy'), 
    '2026', false)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_MastercardVisaDiscoverAmex'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/select_MastercardVisaDiscoverAmex'), 
    'Visa', false)

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Credit Card_ccnumber'))

//WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Credit Card_ccnumber'), 
//  '4111111111111111')
WebUI.setText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Credit Card_ccnumber'), 
    '4111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Credit Card_ccnumber'), 
    '1111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Credit Card_ccnumber'), 
    '1111')

WebUI.sendKeys(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Credit Card_ccnumber'), 
    '1111')

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/cvc'))

WebUI.setText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/cvc'), 
    '996')

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Billing Zip_zip'))

WebUI.setText(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/input_Billing Zip_zip'), 
    '12333')

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/a_Submit'))

WebUI.click(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/a_Yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/cc/Page_Account Profile/success'), 
    0)

WebUI.closeBrowser()

