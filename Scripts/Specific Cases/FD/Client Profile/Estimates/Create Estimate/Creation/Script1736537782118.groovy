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
    'Automation Test')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Admission Fee_admitfee'), 
    '0.00')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Admission Fee_admitfee'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Admission Fee_admitfee'), 
    '1.1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/select_--not-selected--YesNoUnknown'), 
    'Yes', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_Estimate 45                            _f9958e'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Individual Deductible_dedamt'), 
    '2.2')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Deductible Met_dedmet'), 
    '0.00')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_Individual Deductible'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Deductible Met_dedmet'), 
    '3.3')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Life Max_lifemax'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Life Met_lifemet'), 
    '5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/select_Not SelectedYesNo'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_In Network Individual Maximum Out of Pocket'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Individual Maximum Out of _9e18e0'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Indiviual Out of Pocket Me_23d632'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Individual Maximum Out of _9e18e0'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Indiviual Out of Pocket Me_23d632'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Family Maximum Out of Pock_7462d8'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Indiviual Out of Pocket Me_23d632'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Family Maximum Out of Pock_7462d8'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Family Out of Pocket Met Y_c7dc58'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Family Maximum Out of Pock_7462d8'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_In Network Family Out of Pocket Met Y_c7dc58'), 
    '9')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Individual Maximum Out_23c1e0'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_side-buttons             position absol_cdea06'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Individual Maximum Out_23c1e0'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Individual Out of Pock_0a9ad2'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Individual Maximum Out_23c1e0'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Individual Out of Pock_0a9ad2'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Family Maximum Out of _4ebb39'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Individual Out of Pock_0a9ad2'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Family Maximum Out of _4ebb39'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Family Out of Pocket M_97c17b'), 
    '0')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Family Maximum Out of _4ebb39'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Out-of-Network Family Out of Pocket M_97c17b'), 
    '13')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/i_SERVICE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/select_-- Please select --5 Panel Drug Scre_5bdf94'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/select_-- Please select --5 Panel Drug Scre_5bdf94'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/div_Service-- Please select --5 Panel Drug _ea0c4d'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Hardship_s_hardship'), 
    '14.4')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/textarea_Note_s_note'), 
    'Automation Test')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/button_Add'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/td_IOP'), 
    'IOP')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_Self Pay'), 
    'Self Pay')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_200.00'), 
    '200.00')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_1'), 
    '1')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_200.00_1'), 
    '200.00')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_14.40'), 
    '14.40')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_No'), 
    'No')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_185.60'), 
    '$185.60')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_1.10'), 
    '$1.10')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_201.10'), 
    '$201.10')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/i_--_fa fa-edit'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/input_Unit Cost_s_unitcost'), 
    '210.00')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/button_Update'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/span_211.10'), 
    '$211.10')

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/textarea_Note_note'), 
    'Automation Note')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/canvas_Name_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/canvas_Staff Signature_jSignature'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/td_02202025'), 
    GlobalVariable.Todays_Date)

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/td_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/td_Automation Test_1'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/td_211.10'), 
    '$211.10')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/td_196.70'), 
    '$196.70')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Inquiry Profile/a_Default Entity_btn btn-info btn-raised btn-sm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/FD/client profile estimates creation/Page_Estimates/img_1'), 
    0)

WebUI.closeBrowser()

