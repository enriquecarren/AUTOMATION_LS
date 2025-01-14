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

WebUI.navigateToUrl('https://site17.lsapp.cloud/client/index/1557?section=clientprofile')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_01022001'), 
    '01/02/2001')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_24-11007'), 
    '24-11007')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Dog Treatment Center'), 
    'Dog Treatment Center')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Detoxification'), 
    'Detoxification')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_08282024'), 
    '08/28/2024')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_23'), 
    '24')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Female'), 
    'Female')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Automation Test'), 
    'Automation Test')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_(833) 957-2888'), 
    '(833) 957-2888')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_B2automation.com'), 
    'B2@automation.com')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_B Parent B Client'), 
    'B Parent B Client')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Parent or Guardian'), 
    'Parent or Guardian')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Future Automation Test with B Automatio_ed8b34'), 
    'Future Automation Test with B Automation, B Client MR# 24-11007: 5 Panel Drug Screen')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Future Automation Test 1.2 Automaticall_19fd63'), 
    'Future Automation Test 1.2 Automatically Enroll Clients in Selected Location/Program(s)')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_Case Note'), 
    'Case Note')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/div_AM Assessment'), 
    'AM Assessment')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_encrypted                    Access Log'))

WebUI.navigateToUrl('https://site17.lsapp.cloud/accesslog/1673')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client  Inquiry Access - B Client B Au_b4b842/h4_Client  Inquiry Access Log for B Client _3d3cc6'), 
    'Client / Inquiry Access Log for B Client B Automation')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_news                    All Documents'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/h3_All Documents for - B Client B Automation'), 
    'All Documents for - B Client B Automation')

WebUI.click(findTestObject('Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/Form Name Filter'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/input_Form Name_select2-search__field'), 
    'Clinical Note')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/input_Form Name_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_Clinical Note'), 
    'Clinical Note')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/ul_Clinical Note'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/input_Form Name_select2-search__field'), 
    'Am')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/input_Form Name_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_Assessment_1'), 
    'Assessment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_Note_1'), 
    'Note')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/span__1'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/span__1'))

WebUI.setText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/input_Category_select2-search__field'), 
    'Sco')

WebUI.sendKeys(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/input_Category_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_Scored Assessment'), 
    'Scored Assessment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_Scored Assessment_1'), 
    'Scored Assessment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_COWS Assessment'), 
    'COWS Assessment')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/td_CIWA B Assessment'), 
    'CIWA B Assessment')

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_All Documents for - B Client B Automation/a_chevron_left                Back to Profile'))

WebUI.click(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Profile/a_summarize                Facesheet'))

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Facesheet - B Client B Automation/b_Funding'), 
    'Funding')

WebUI.verifyElementText(findTestObject('Object Repository/Specific Cases Repository/LS/Client Profile/Client Profile/Page_Client Facesheet - B Client B Automation/td_Blue Cross Blue Shield of Texas'), 
    'Blue Cross Blue Shield of Texas')

WebUI.closeBrowser()

