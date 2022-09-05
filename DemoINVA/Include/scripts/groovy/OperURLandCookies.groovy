import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


public class OperURLandCookies {



	@Given('User enter the site')
	def OpenURL() {
		WebUI.openBrowser(GlobalVariable.baseUrl)
		WebUI.maximizeWindow()
	}

	@When('User accept cookies')
	def AcceptCookies() {
		
		WebUI.click('Cookies Button')
		WebUI.delay(3)
	}

	@Then('User can navigate site')
	def GetURL() {
		String actualURL = WebUI.getUrl()
		WebUI.verifyMatch(actualURL, GlobalVariable.baseUrl, false, FailureHandling.STOP_ON_FAILURE)
	}
}
