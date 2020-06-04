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

WebUI.click(findTestObject('Object Repository/1612893/ReplyComment/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/button_anh_CENTER_commentIcon_at3eidckaidg8_54d03c'))

WebUI.setText(findTestObject('Object Repository/1612893/ReplyComment/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/textarea_Add a comment_reply_textbox'), 
    'trả lời comment')

WebUI.click(findTestObject('Object Repository/1612893/ReplyComment/Page_Thanh set Channel name - hcmus-cdnc-te_a699a0/input_Help_addCommentButton'))

WebUI.closeBrowser()

