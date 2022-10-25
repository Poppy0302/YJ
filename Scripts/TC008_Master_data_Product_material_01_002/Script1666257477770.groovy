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

WebUI.click(findTestObject('Master_data_Product_material/Product Data/a_Product Data (SKU)'))

WebUI.click(findTestObject('Master_data_Product_material/Product Data/a_Add New Product'))

int RD

RD = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('Object Repository/Master_data_Product_material/Product Data/input_StyleVendor_productstyle_vendor'), 
    '000' + RD)

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_Color_productcolor'), 'AliceBlue')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_Size_productsize'), 'S')

WebUI.click(findTestObject('Master_data_Product_material/Product Data/input_Size_productin_house'))

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/textarea_Descrtiption English_productdescrip_en'), 
    'Kangaroo Pocket Drawstring Thermal Hoodie')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/textarea_Descrtiption Thai_productdescrip_th'), 
    'เสื้อกันหนาวมีฮู้ด แบบเก็บความอบอุ่นได้ กระเป๋าจิงโจ้ สายรัด')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/textarea_Color Description Thai_productcolo_9f46a2'), 
    'สีม่วง')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_Cust Code_productcust_code'), '1999')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_UPC_productupc'), '10000')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_Composition_productcomposition'), '100% COTTON')

WebUI.selectOptionByValue(findTestObject('Master_data_Product_material/Product Data/select_ChooseRayonKnitGauzeCut sew regularG_297046'), 
    'cut_sew_regular', true)

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_HTS Code_producthts_code'), '123456')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_Material Consumption_productmaterial__92e524'), 
    '2.00')

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_PO-L Cost_productpol_cost'), '70.0')

WebUI.click(findTestObject('Master_data_Product_material/Product Data/a_Add Material'))

WebUI.click(findTestObject('Master_data_Product_material/Product Data/span_Select a Material'))

WebUI.click(findTestObject('Master_data_Product_material/Product Data/li_A-Button200'))

WebUI.setText(findTestObject('Master_data_Product_material/Product Data/input_Qty_productproduct_materials_attribut_75f79e'), 
    '0.03')

WebUI.click(findTestObject('Master_data_Product_material/Product Data/input_Remember me_commit'))

WebUI.closeBrowser()

