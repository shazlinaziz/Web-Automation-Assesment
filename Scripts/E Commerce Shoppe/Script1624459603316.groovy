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

WebUI.navigateToUrl('https://shopee.com.my/')

WebUI.click(findTestObject('Object Repository/Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/button_English'))

WebUI.click(findTestObject('Shoppe Object/Page_Shopee Malaysia  Free Shipping Across Malaysia/close popup msg'))

WebUI.setText(findTestObject('Object Repository/Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/input_Login_shopee-searchbar-input__input'), 
    'iphone 11')

WebUI.click(findTestObject('Object Repository/Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/button_case shockproof_btn btn-solid-primar_9b9520'))

WebUI.click(findTestObject('Object Repository/Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/button_More Shops'))

WebUI.setText(findTestObject('Object Repository/Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/input_Login_shopee-searchbar-input__input'), 
    'iphone 11')

WebUI.click(findTestObject('Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/svg_case shockproof_shopee-svg-icon'))

WebUI.click(findTestObject('Object Repository/Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/div_Price Low to High'))

WebUI.click(findTestObject('Object Repository/Shoppe Object/Page_Shopee Malaysia  Free Shipping Across _60d57f/img'))

