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
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Advance_Census/Filter/Page_Home/a_Census'))
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Home/a_A Automation, A Client'))

// Navegar al perfil del cliente
WebUI.navigateToUrl('https://site17.lsapp.cloud/account/1672')

// Seleccionar la opción de Collect Payment
WebUI.click(findTestObject('Object Repository/account profile/Page_Account Profile/a_Collect Payment'))

// Seleccionar el pagador (payor)
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_Payor_payorname'))
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/div_A Client A Automation'))

// Introducir la cantidad
WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_Amount_lineamount'), '100')

// Seleccionar el método de pago "Credit Card" desde el dropdown
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/select_Payment Method Dropdown'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/select_Payment Method Dropdown'), 'Credit Card', false)

// Llenar los datos de la tarjeta de crédito
WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_CreditCardNumber'), '4111111111111111')
WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_ExpiryDate'), '12/25')
WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/input_CVV'), '123')

// Guardar la transacción
WebUI.click(findTestObject('Object Repository/account profile/Page_Account Profile/div_Total'))
WebUI.scrollToPosition(0, 120)
WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/ACCOUNT PROFILE/COLLECT_PAYMENTS/Page_Account Profile/button_Save'))

// Cerrar el navegador
WebUI.closeBrowser()
