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

WebUI.navigateToUrl('http://localhost:8065/reiciendis-0/channels/town-square')

WebUI.setText(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hcmus-cdnc')

WebUI.setEncryptedText(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Town Square - minus Mattermost/button_hcmus-cdnc_style--none sidebar-heade_0f8da4'))

WebUI.click(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Town Square - minus Mattermost/span_Manage Members'))

WebUI.click(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Town Square - minus Mattermost/span_Member'))

switch ('admin') {
    case 'out':
        WebUI.click(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Town Square - minus Mattermost/span_Remove from Team'))

        break
    case 'admin':
        WebUI.click(findTestObject('Object Repository/1612427/16_AssignPermission/Page_Town Square - minus Mattermost/span_Make Team Admin'))

        break
}

WebUI.closeBrowser()

