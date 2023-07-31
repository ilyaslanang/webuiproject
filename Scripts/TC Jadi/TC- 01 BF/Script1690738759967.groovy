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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

judul = WebUI.getWindowTitle()

WebUI.verifyElementVisibleInViewport(findTestObject('Page_CURA Healthcare Service/alamat cura'), 0)

WebUI.verifyElementNotVisible(findTestObject('Page_CURA Healthcare Service/ada tapi ga keliatan'))

WebUI.verifyElementNotPresent(findTestObject('Page_CURA Healthcare Service/h2Appointment Confirmation'), 2)

WebUI.verifyMatch(judul, 'CURA Healthcare Service', true)

WebUI.verifyElementClickable(findTestObject('Page_CURA Healthcare Service/BtnMakeAppointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/BtnMakeAppointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtUsername'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/txtPassword'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Page_CURA Healthcare Service/btnLogin'))

WebUI.verifyTextPresent('Apply for hospital readmission', true)

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/label_Apply for hospital readmission'), 'Apply for hospital readmission')

WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/cbCURAHealthcareCenter'), 0)

WebUI.click(findTestObject('Page_CURA Healthcare Service/cbApply for hospital readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/cbMedicaid_programs'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtVisit Date'), '07/07/2023')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/text_Comment'), 'a')

WebUI.click(findTestObject('Page_CURA Healthcare Service/btnBook Appointment'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2Appointment Confirmation'), 3)

WebUI.refresh()

WebUI.delay(4)

WebUI.closeBrowser()

