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

WebUI.openBrowser('')

CustomKeywords.'example.keywordbaru.applogin'()

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/cbCURAHealthcareCenter'), 0)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/cbApply for hospital readmission'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cbMedicare_programs'))
    } else if (n == 1) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cbMedicaid_programs'))
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cbNone_programs'))
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtVisit Date'), '07/30/2023')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/text_Comment'), 'sakit aja')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btnBook Appointment'))

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2Appointment Confirmation'), 3)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btnGo to Homepage'))

    CustomKeywords.'example.keywordbaru.congrats'('')
}

WebUI.closeBrowser()

