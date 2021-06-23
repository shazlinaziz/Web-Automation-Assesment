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

WebUI.navigateToUrl('https://www.lazada.com.my/')

WebUI.setText(findTestObject('Object Repository/Lazada/Page_Lazada.com.my Best Online Shopping in _4f40cd/input_Malay Language  Bahasa Malaysia_q'), 
    'iphone 11')

WebUI.click(findTestObject('Object Repository/Lazada/Page_Lazada.com.my Best Online Shopping in _4f40cd/button_SEARCH'))

WebUI.click(findTestObject('Object Repository/Lazada/Page_iphone 11 - Buy iphone 11 at Best Pric_3387c0/div_Best Match'))

WebUI.click(findTestObject('Object Repository/Lazada/Page_iphone 11 - Buy iphone 11 at Best Pric_3387c0/div_Price low to high'))

WebUI.click(findTestObject('Object Repository/Lazada/Page_iphone 11 - Buy iphone 11 at Best Pric_3387c0/img_Selangor_index__image___1YObI'))

