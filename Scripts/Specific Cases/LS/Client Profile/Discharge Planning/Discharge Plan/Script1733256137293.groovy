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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1556?section=dcplan')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Client Profile/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/input_Condition at Discharge_dccondition'), 
    'Automation Condition at Discharge')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/i_Discharge Planning Content from Treatment Plan'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/select_--Select-Type---- Select One --Disch_c276a7'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Anticipated Plan Post-Discharge_tx_dafd1a'), 
    'Automation Anticipated Plan Post-Discharge')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Client Involvement in Discharge Pl_548c36'), 
    'Automation Client Involvement')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Family Involvement in Discharge Pl_020026'), 
    'Automation Family Involvement')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Individual Goals Necessary to Sust_8c1980'), 
    'Automation Individual Goals')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Medical Issues_txtmedical'), 
    'Automation Medical')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Psychiatric Issues_txtpsychiatric'), 
    'Automation Psychiatric')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Discharge Criteria_dccriteria'), 
    'Automation Discharge')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Client Strengths_strengths'), 
    'Automation Client Strengths')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Client Needs_needs'), 
    'Automation Client Needs')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Client Abilities_abilities'), 
    'Automation Client Abilities')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Client Preferences_preferences'), 
    'Automation Client')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Response  to treatment_txtresponse'), 
    'Automation Response')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Anticipated Effect of Family Dynam_bbb4c4'), 
    'Automation Anticipated')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/textarea_Other Referrals (Include PCP)_txtreferral'), 
    'Automation Other')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/span_Client I participated in the developme_a916cf'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/canvas_Client I participated in the develop_94b7aa'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/canvas_Client I participated in the develop_94b7aa'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/span_Sign and Lock_check'))

WebUI.click(findTestObject('Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Discharge Plan/Save Button'))

WebUI.rightClick(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Discharge Planning/Discharge Plan/Page_Client Profile/td_Detoxification'))

WebUI.closeBrowser()

