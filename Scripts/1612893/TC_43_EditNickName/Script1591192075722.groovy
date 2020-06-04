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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/hcmus-cdnc-team/channels/town-square')

WebUI.setText(findTestObject('Object Repository/1612893/43_EditNickName/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hcmus-cdnc@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1612893/43_EditNickName/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/1612893/43_EditNickName/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/1612893/43_EditNickName/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/button_username_style--none sidebar-header-_5af78f'))

WebUI.click(findTestObject('Object Repository/1612893/43_EditNickName/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/1612893/43_EditNickName/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/span_Edit'))

WebUI.setText(findTestObject('Object Repository/1612893/43_EditNickName/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/input_Nickname_nickname'), 
    nickName)

WebUI.click(findTestObject('Object Repository/1612893/43_EditNickName/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/span_Save'))

WebUI.click(findTestObject('Object Repository/1612893/43_EditNickName/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/span_'))

WebUI.closeBrowser()

