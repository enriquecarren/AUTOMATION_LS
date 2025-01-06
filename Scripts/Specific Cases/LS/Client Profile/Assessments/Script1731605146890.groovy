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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=assessments')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/li_Scored Assessments'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/button_New assessment'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/li_COWS Assessment'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/a_Create                arrow_right_alt'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/h3_COWS Assessment'), 
    'COWS Assessment')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639583873364_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639584030473_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639584415541_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639584533406_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639584833260_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639584964855_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639585133881_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639586467169_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639586565854_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639586621062_117'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input__radio-group-1639586686870_117'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/textarea_Additional Information_textarea-16_3128df'), 
    'autmation test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/td_27 Moderately Severe'), 
    '27 Moderately Severe')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/i_add'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_Temp_vstemp'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_Pulse_vspulse'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_BP_vsbp'), 
    '')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_BP_vsbp'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_Respiration_vsresp'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_BP_vsbp'), 
    '')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_BP_vsbp'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_O2 Saturation_vso2'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_O2 Saturation_vso2'), 
    '14')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_Inhaled Oxygen Concentration_inhaled__06efa9'), 
    '15')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_Additional Information_vsadditional'), 
    'automation vital signs')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/b_Client Vitals'), 
    'Client Vitals')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/td_14'), 
    '14')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/td_13'), 
    '13')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_COWS Assessment/button_Save_1'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=assessments')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/div_COWS Assessment'), 
    'COWS Assessment')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/button_New assessment_1'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/li_CIWA B Assessment'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/a_Create                arrow_right_alt_1'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input_Heart Rate_text-1639631610170'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input_Blood Pressure_text-1639631614126'), 
    '14')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631583021_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631617772_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631811028_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631808123_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631706819_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631711045_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631686224_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input_Do you think you did not get enough s_69b9b6'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631722497_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631732923_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631750283_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631744615_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631648138_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631651299_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631778137_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631758534_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631762390_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631660024_119'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631669718_119'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/textarea_Additional Information_textarea-16_acaf1e'), 
    'automation formdata test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/td_36 Moderate Withdrawal'), 
    '36 Moderate Withdrawal')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/div_The following required fields do not ha_73f9ba'), 
    'The following required fields do not have responses')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/span_Clinician Observations RestlessnessObs_1dce3a'), 
    'Clinician Observations: RestlessnessObserve behavior for restlessness and agitation *')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input__radio-group-1639631774054_119'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/td_40 Severe Withdrawal'), 
    '40 Severe Withdrawal')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/input_Sign and Lock_dss'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_CIWA B Assessment/button_Save'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=assessments')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/div_CIWA B Assessment'), 
    'CIWA B Assessment')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/button_New assessment_1'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/li_AM Assessment'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/a_Create                arrow_right_alt_1'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/input_How many hours of restful sleep did y_a36804'), 
    'Automation test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/select_YesNo'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/select_YesNo_1'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/textarea_If yes, please describe_txtnightmares'), 
    'automation test description')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/select_YesNo_1_2'), 
    'No', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/textarea_Please describe your appetite. Is _ec8639'), 
    'automation desciption 2')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/input_Severity of Depression_depressionrating'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/input_Severity of Anxiety_anxietyrating'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/select_YesNo_1_2_3'), 
    'No', true)

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/input_When was your last bowel movement_lastbm'), 
    'automation response')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/textarea_Additional Information_note'), 
    'autoamtion rsponse 2')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/b_Vital Signs'), 
    'Vital Signs')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_AM Assessment/button_Save'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=assessments')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/div_AM Assessment'), 
    'AM Assessment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Assessments/Page_Client Profile/div_Not signed'), 
    'Not signed')

WebUI.closeBrowser()

