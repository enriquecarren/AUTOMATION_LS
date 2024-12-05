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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1556?section=txplan')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Client Profile/i_add'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/button_ProblemGoal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/select_-- Select Category --               _86aaf1'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/input_Problem_problem_add'), 
    'Suicide Ideation')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Goal_goal'), 
    'Automation Goal')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/td_Suicide Ideation'), 
    'Suicide Ideation')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/i_ProblemGoal_fa fa-plus'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/select_--Select-Category--                 _bb00be'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/p_Client will complete an SI risk assessmen_bacf5f'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/button_Save_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/td_Client will complete an SI risk assessme_38b1cb'), 
    'Client will complete an SI risk assessment half way through treatment and discuss any SI as it comes up')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/a_Individualized Assessment'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Client Strengths_strengths'), 
    'Automation Client Strengths')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Client NeedsLimitations_needs'), 
    'Automation Client Needs')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Client Abilities_abilities'), 
    'Automation Client Abilities')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Client Preferences_preferences'), 
    'Automation Preferences')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/a_Discharge Planning'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/a_Involvement in Discharge Planning'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Anticipated Plan Post-Discharge_tx_dafd1a'), 
    'Automation Anticipated Plan')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Client Involvement in Discharge Pl_548c36'), 
    'Automation Client Involvement')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Family Involvement in Discharge Pl_020026'), 
    'Automation Family')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/a_Issues Requiring Attention in Aftercare'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Clinical Issues_txtaftercare'), 
    'Automation Client Issues')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Medical Issues_txtmedical'), 
    'Automation Medical Issues')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Psychiatric Issues_txtpsychiatric'), 
    'Automation Psychiatric')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/a_Discharge Criteria'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/textarea_Discharge Criteria_txtdccriteria'), 
    'Automation Discharge')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/a_Plan Signatures'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/span_Client I have participated in the deve_369a9b'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/canvas_Sign with TopazReset_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/i_Save Client Signature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/i_Save Staff Signature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/i_Save MD Signature'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1556?section=txplan')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Client Profile/td_12032024'), 
    GlobalVariable.Todays_Date)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Client Profile/i_Read Only_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/a_Plan Signatures'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/input_Entered in Error_iseie'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/input_Reason_eiereason'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Treatment Plan/button_Mark as Error'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Treatment Planning/Treatment Plans/Page_Client Profile/a_Treatment Planning'))

WebUI.closeBrowser()

