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

WebUI.navigateToUrl('https://staging-yj.onbananacoding.com/users/sign_in')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_Email_useremail'), 'admin@yj.com')

WebUI.setEncryptedText(findTestObject('Master_data_Product_material/Product Data/input_Password_userpassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Master_data_Product_material/Product Data/input_Remember me_commit'))

WebUI.click(findTestObject('Receive QC/a_Receive  Q.C'))

WebUI.click(findTestObject('Receive QC/a_Q.C'))

WebUI.click(findTestObject('Receive QC/a_Scan for Q.C. Status'))

WebUI.click(findTestObject('Receive QC/a_Fail'))

WebUI.setText(findTestObject('Receive QC/input_Scan barcode_input-qc'), '72-2117')

WebUI.sendKeys(findTestObject('Receive QC/input_Scan barcode_input-qc'), Keys.chord(Keys.ENTER))

