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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1556?section=medicalassess')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Client Profile/h4_Pain Rating'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Client Profile/i_add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/select_--not-selected--YesNo'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/textarea_Character Please describe your pai_b961e8'), 
    'Automation Character')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/textarea_Onset When did your pain begin How_1fcb8f'), 
    'Automation Onset')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/textarea_Location Where is it Does it radia_4aae7b'), 
    'Autoamtion Location')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/textarea_Duration How long does it last Doe_a24179'), 
    'Automation Duration')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/textarea_Severity How bad is it_txtseverity'), 
    'Automation Severity')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/textarea_Pattern What makes it better_txtpattern'), 
    'Automation Pattern')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/textarea_Associated Factors What other symp_d4f16d'), 
    'Automation Associated')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/input_Associated Factors What other symptom_d4156a'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/span_Sign and Lock_check'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Pain Rating/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Client Profile/td_5'), 
    '5')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Client Profile/td_Automation Character'), 
    'Automation Character')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Allergies-Vitals-Labs/Pain Rating/Page_Client Profile/td_Automation Test'), 
    'Automation Test')

WebUI.closeBrowser()

