package test_OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import OrangeHRM.utils.KeyWork;

import java.security.Key;
import java.security.Signature;

public class TheCouncilPage extends CommonPage{

    private final By clickOnCouncilButton = By.xpath("//a[@href='/workflow/councillist']");
    private final By clickOnCreateCouncilButton = By.xpath("//button[normalize-space()='+ Thêm']");
    //choose council
    private final By clickOnCreateGiamDinhCouncilButton = By.xpath("//button[contains(text(),'Hội đồng giám định')]");
    private final By clickOnCreateNghiemThuCouncilButton = By.xpath("//button[contains(text(),'Hội đồng nghiệm thu')]");
    private final By clickOnCreateThamDinhNoiDungCouncilButton = By.xpath("//button[contains(text(),'Hội đồng Thẩm định nội dung')]");
    private final By clickOnCreateToThamDinhKinhPhiButton = By.xpath("//button[contains(text(),'Tổ thẩm định kinh phí')]");
    private final By clickOnCreateTuVanKiemTraCouncilButton = By.xpath("//button[contains(text(),'Hội đồng tư vấn kiểm tra')]");
    private final By clickOnCreateThanhLyCouncilButton = By.xpath("//button[contains(text(),'Hội đồng thanh lý')]");
    private final By clickOnCreateTuVanDieuChinhHopDongCouncilButton = By.xpath("//button[contains(text(),'Hội đồng tư vấn điều chỉnh hợp đồng')]");
    private final By clickOnCreateLayYKienChuyenGiaCouncilButton = By.xpath("//button[contains(text(),'Hội đồng lấy ý kiến chuyên gia')]");
    //
    private  final By getModalText = By.xpath("//span[@class='modal-title font-roboto-medium']");
    private final By inputCouncilNameTextbox = By.xpath("//input[@placeholder='Nhập tên hội đồng']");
    private final By inputDesciptionNameTextArea = By.xpath("//textarea[@placeholder='Nhập mô tả hội đồng']");
    private final By clickOnNameOfApproverDropdown = By.xpath("(//mat-select[@id='matSelectLoadmore'])[2]");
    private final By inputNameOfApproverTextbox = By.xpath("//div[1]/mat-option[1]/span[1]/ngx-mat-select-search[1]/div[1]/input[1]");
    private final By inputSignatureTextbox = By.xpath("(//input[@placeholder='Nhập mã chữ ký*'])[1]");
    private final By clickOnConfirmCouncilCheckbox = By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]");
    private final By clickOnAddApproverButton = By.xpath("(//button[contains(text(),'Thêm')])[2]");
    private final By clickOnNextButton = By.xpath("//button/span[contains(text(),'Tiếp theo')]");
    private final By clickOnCouncilMemberDropdown = By.xpath("(//*[@id='matSelectLoadmore'])[3]");
    private final By inputCouncilMemberSearchbox = By.xpath("//ngx-mat-select-search[1]/div[1]/input[1]");
    private final By clickOnJobTitleDropdown = By.xpath("(//*[@id='matSelectLoadmore'])[4]");
    private final By inputSignatureCouncilMemberTextbox = By.xpath("(//div/input[@type='text'][@inputmode='text'])[3]");
    private final By clickOnAddcouncilMemberButton = By.xpath("(//button[@type='button'][normalize-space()='Thêm'])[2]");
    private final By clickOnTaskListDropbox = By.xpath("//div[2]/div/div[2]//div/mat-form-field/div/div[1]/div");
    private final By inputOnTaskListSearchbox = By.xpath("//ngx-mat-select-search[1]/div[1]/input[1]");
    private final By clickOnAddTaskButton = By.xpath("(//button[@type='button'][normalize-space()='Thêm'])[3]");
    private final By clickOnCompleteCreateCouncilButton = By.xpath("//button/span[contains(text(),'Hoàn thành')]");

    public void moveToStepOpenCreateCouncilModal(){
        //Navigate to council page
        KeyWork.clickElement(clickOnCouncilButton);
        //Click on create new council button
        KeyWork.clickElement(clickOnCreateCouncilButton);
    }
    public void addNewCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        //Add CouncilName, Approver
        KeyWork.setText(inputCouncilNameTextbox, CouncilName);
        KeyWork.setText(inputDesciptionNameTextArea, Description);
        KeyWork.clickElement(clickOnNameOfApproverDropdown);
        KeyWork.clickElementWithJS(By.xpath("//span[contains(text(),'"+NameOfApprover+"')]"));
        KeyWork.setText(inputSignatureTextbox, Signature);
        KeyWork.clickElement(clickOnConfirmCouncilCheckbox);
        KeyWork.sleep(3);
        KeyWork.clickElement(clickOnAddApproverButton);
        KeyWork.clickElement(clickOnNextButton);
        KeyWork.sleep(2);
        //Add council member
        //1st council member
        KeyWork.clickElement(clickOnCouncilMemberDropdown);
        KeyWork.setText(inputCouncilMemberSearchbox, CounCilMember1);
        KeyWork.clickElementWithJS(By.xpath("//mat-option/span[contains(text(),'"+CounCilMember1+"')]"));
        KeyWork.sleep(1);
        KeyWork.clickElement(clickOnJobTitleDropdown);
        KeyWork.clickElementWithJS(By.xpath("//mat-option/span[contains(text(),'"+JobTitleMember1+"')]"));
        KeyWork.setText(inputSignatureCouncilMemberTextbox, SignatureMember1);
        KeyWork.clickElement(clickOnAddcouncilMemberButton);
        KeyWork.sleep(1);
        //2nd council member
        KeyWork.clickElement(clickOnCouncilMemberDropdown);
        KeyWork.setText(inputCouncilMemberSearchbox, CounCilMember2);
        KeyWork.clickElementWithJS(By.xpath("//mat-option/span[contains(text(),'"+CounCilMember2+"')]"));
        KeyWork.sleep(1);
        KeyWork.clickElement(clickOnJobTitleDropdown);
        KeyWork.clickElementWithJS(By.xpath("//mat-option/span[contains(text(),'"+JobTitleMember2+"')]"));
        KeyWork.setText(inputSignatureCouncilMemberTextbox, SignatureMember2);
        KeyWork.clickElement(clickOnAddcouncilMemberButton);
        //add task
        KeyWork.clickElement(clickOnTaskListDropbox);
        KeyWork.setText(inputOnTaskListSearchbox, TaskCode);
        KeyWork.waitForElementVisible(By.xpath("//mat-option/span[contains(text(),'"+TaskCode+"')]"),20);
        KeyWork.clickElement(By.xpath("//mat-option/span[contains(text(),'"+TaskCode+"')]"));
        //
        KeyWork.waitForElementClickable(clickOnAddTaskButton);
        KeyWork.clickElement(clickOnAddTaskButton);
        //
        KeyWork.clickElement(clickOnCompleteCreateCouncilButton);
    }

    private final By getAddNewCouncilSuccessMessage = By.xpath("//div[@aria-label='Đã tạo hội đồng thành công.']");
    public void verifyAddNewCouncil() {KeyWork.verifyElementText(getAddNewCouncilSuccessMessage, "Đã tạo hội đồng thành công.");}

    private final By getCouncilNumberText = By.xpath("//mat-table[1]//mat-row");
    public void verifyCreatedCouncilDisplayedInList(String CouncilNameNeedToVerify){
        KeyWork.clickElement(clickOnCouncilButton);
        KeyWork.moveToElement(getCouncilNumberText);
        KeyWork.sleep(3);
        int rowtotal = KeyWork.getSize( getCouncilNumberText, 0);
        for (int i = 1; i <= rowtotal; i++) {
            WebElement elementCheck = KeyWork.getWebElement(By.xpath("//mat-table[1]//mat-row["+i+"]/mat-cell[2]"));
            if ((elementCheck.getText()).equals(CouncilNameNeedToVerify)) {
                System.out.println("Da tim thay hoi dong: " + elementCheck.getText());
                KeyWork.sleep(2);
                break;
            }
            else {
                if (i == rowtotal) {
                    KeyWork.LogConsole("Đã tìm danh sách NHƯNG không thấy council mong muốn");
                    KeyWork.LogConsole("EXPECTED: " + CouncilNameNeedToVerify);
                    KeyWork.LogConsole("ACTUAL: " + elementCheck.getText());
                }
            }
        }
    }
    public void createGiamDinhCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateGiamDinhCouncilButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới hội đồng giám định");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }

    public void createNghiemThuCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateNghiemThuCouncilButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới hội đồng nghiệm thu");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }

    public void createThamDinhNoiDungCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateThamDinhNoiDungCouncilButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới hội đồng thẩm định nội dung");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }

    public void createToThamDinhKinhPhi(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateToThamDinhKinhPhiButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới tổ thẩm định kinh phí");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }

    public void createTuVanKiemTraCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateTuVanKiemTraCouncilButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới hội đồng tư vấn kiểm tra");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }

    public void createThanhLyCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateThanhLyCouncilButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới hội đồng thanh lý");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }

    public void createTuVanDieuChinhHopDongCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateTuVanDieuChinhHopDongCouncilButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới hội đồng tư vấn điều chỉnh hợp đồng");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }

    public void createLayYKienChuyenGiaCouncil(String CouncilName, String Description, String NameOfApprover, String Signature,String CounCilMember1, String JobTitleMember1, String SignatureMember1,String CounCilMember2, String JobTitleMember2, String SignatureMember2, String TaskCode){
        moveToStepOpenCreateCouncilModal();
        KeyWork.clickElement(clickOnCreateLayYKienChuyenGiaCouncilButton);
        KeyWork.verifyElementText(getModalText, "Thêm mới hội đồng lấy ý kiến chuyên gia");
        addNewCouncil(CouncilName, Description, NameOfApprover, Signature, CounCilMember1, JobTitleMember1, SignatureMember1, CounCilMember2, JobTitleMember2, SignatureMember2, TaskCode);
    }
}
