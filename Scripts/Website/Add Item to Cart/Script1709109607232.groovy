import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

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
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def dataProduct = findTestData('Data Files/Product Price')

def productPrice = dataProduct.getObjectValue('price', 1)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bro.do/')

WebUI.click(findTestObject('Object Repository/Website/Login/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Website/Login/input_Email_customeremail'), GlobalVariable.username )

WebUI.setText(findTestObject('Object Repository/Website/Login/input_Forgot_customerpassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Website/Login/input_Show_customerLogin'))

WebUI.click(findTestObject('Object Repository/Website/Account Page/div_SALE'))

WebUI.click(findTestObject('Object Repository/Website/Product Page/span_Rp '+ productPrice))

WebUI.click(findTestObject('Object Repository/Website/Detail Product Page/button_Add to cart'))

WebUI.delay(5)

WebUI.closeBrowser()

