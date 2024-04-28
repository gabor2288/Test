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

WebUI.openBrowser('Google.com')

WebUI.navigateToUrl('https://stage.banshee.ea.com/login')

WebUI.setText(findTestObject('LoginPage_Banshee/Box_User_email'), 'gpetras@ea.com')

WebUI.setEncryptedText(findTestObject('LoginPage_Banshee/Box_Password'), 'MW35mGHAMPWwZ4LFKGYUoEtLzh8e2091')

WebUI.click(findTestObject('LoginPage_Banshee/button_LogIn'))

WebUI.click(findTestObject('BansheeHomePage/Project_GaborsNewAutotestProjectEdited'))

WebUI.click(findTestObject('Page_Gabors New Project/Feed_Gabors Autotest Android Feed Edited'))

WebUI.verifyTextPresent('Feed ID', false)

WebUI.click(findTestObject('Page_Gabors New Project/button_Private_euiButtonIcon euiButtonIcon--primary euiButtonIcon--medium'))

WebUI.click(findTestObject('Page_Gabors New Project/button_Delete'))

WebUI.click(findTestObject('Page_Gabors New Project/button_YesDoIt'))

WebUI.verifyTextPresent('Gabor\'s Autotest Android Feed Edited (Deleting)', false)

