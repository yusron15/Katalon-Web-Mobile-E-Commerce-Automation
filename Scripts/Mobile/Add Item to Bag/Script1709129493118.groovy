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

Mobile.startApplication('"C:\\Users\\hp\\Downloads\\Brodo_4.1_apkcombo.com.apk"', true)

Mobile.tap(findTestObject('Object Repository/Mobile/Sidebar/button_sidebar'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Sidebar/button_account_sidebar'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Sign In/textfield_email'), null, 0)

Mobile.setText(findTestObject('Object Repository/Mobile/Sign In/textfield_password'), null, 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Sign In/button_sign_in'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Sidebar/button_sidebar'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Sidebar/button_home_sidebar'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Product/title_product'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/Product/button_add_to_bag'), 0)

Mobile.delay(5)

Mobile.closeApplication()




