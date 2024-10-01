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

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Home/a_Census'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Home/a_bed                     Bed Board'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/dbkeymetrics/bedboard')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Board/a_Bed Management'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Management Dashboard/i_Room  1  (Male)_roomnote1'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Management Dashboard/textarea_Room Note_mdl_roombednote_note'), 
    'Room Test Note Automation')

WebUI.click(findTestObject('Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Management Dashboard/div_Bed Note                               _7b91a6'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Management Dashboard/i_Room  1  (Male)_bednote1'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Management Dashboard/textarea_Room Note_mdl_roombednote_note'), 
    'Bed Note Test Automation')

WebUI.click(findTestObject('Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Management Dashboard/div_Bed Note                               _7b91a6'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Management Dashboard/a_Home'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Home/a_bed                     Bed Board'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Board/i_Mens Residential_fa fa-info-circle text-info'), 
    0)

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Board/i_Mens Residential_fa fa-info-circle text-info'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Board/b_Bed note'), 
    'Bed note:')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Census/Bed_Board/Bead_Board_Notes/Page_Bed Board/b_Room note'), 
    'Room note:')

WebUI.closeBrowser()

