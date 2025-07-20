package test_OrangeHRM.pages;

import OrangeHRM.utils.KeyWork;
import org.openqa.selenium.By;

public class TheContractPage extends CommonPage {
    private By clickOnContractPage = By.xpath("//span[contains(text(),'Hợp đồng')]");
    private By clickOnAddIcon = By.xpath("//mat-header-cell/div[1]/button[1]/span[1]/mat-icon[1]");
    private By getTiltelPopup=By.xpath("//span[contains(text(),'Hợp đồng mới')]");
    private By clickOnMaHsTextbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[1]/meu-control-select-search-load-more[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]");
    private By inputMaHsTextbox=By.xpath("//input[@id='mat-input-19']");
    private By selectMaHsList = By.xpath("//span[contains(text(),'DT2589')]");
    private By scrollTiltelDayStart=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[9]/meu-month-picker-component[1]/label[1]");

    private By inputDateTextbox =By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[9]/meu-month-picker-component[1]/span[1]/input[1]");
    private By inputEnDDateTextbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[10]/meu-month-picker-component[1]/span[1]/input[1]");

    private By inputBCGDTextbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[11]/meu-month-picker-component[1]/span[1]/input[1]");
    private By inputTimeGDTextbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[12]/meu-month-picker-component[1]/span[1]/input[1]");
    private By inputNTtextbox= By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[13]/meu-month-picker-component[1]/span[1]/input[1]");
    private By clickOnAllCOntract =By.xpath("//span[contains(text(),'Tất cả hợp đồng')]");
    private By inputTimeNtTextbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[14]/meu-month-picker-component[1]/span[1]/input[1]");
    private By clickOnAddBCTDIcon=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[15]/div[1]/span[2]/img[1]");
    private By inputTimeBCTDTextbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[15]/div[2]/div[1]/meu-month-picker-component[1]/span[1]/input[1]");
    private By clickOnNameTextbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/div[16]/div[2]/div[1]/meu-control-select-search-load-more[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]");
    private By clickonNameList=By.xpath("//span[contains(text(),'System Admin Testing | admin@meu-solutions.com')]");
    private By clickOnAddButton=By.xpath("//button[contains(text(),'Thêm')]");
    private By clickOnContinueButton=By.xpath("//span[contains(text(),'Tiếp theo')]");
    private By getText2Step=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/div[2]/meu-input[1]/label[1]");
    private By inputChucVuTextbox=By.xpath("//input[@id='representative_position']");
    private By clickOnTieptheoButton=By.xpath("//span[contains(text(),'Tiếp theo')]");
    private By getTiltelStep3=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/div[1]/meu-input[1]/label[1]");
    private By clickOnBackbutton1=By.xpath("//span[contains(text(),'Trở về')]");
    private By getTiltleButtonClose=By.xpath("//span[contains(text(),'Đóng')]");
    private By inputKinhPhiTextbox=By.xpath("//input[@id='expense']");
    private By inputKinhPhiNSTextbox=By.xpath("//input[@id='expense_budget']");
    private By clickOnAddDotCapIcon= By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/form[1]/div[1]/div[1]/span[2]/img[1]");
    private By inputKPDot1Textbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]");
    private By inputKPDot2Textbox=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]");

    private By clickOnBackButton2=By.xpath("//span[contains(text(),'Trở về')]");
    private By clickOnHoanThanhButton=By.xpath("//span[contains(text(),'Hoàn thành')]");
    private By getTiltleStep2=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[2]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/div[1]/meu-input[1]/label[1]");
    private By clickOnXbutton=By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/meu-workflow-create-contract[1]/div[1]/div[1]/button[1]/img[1]");
    private By clickOnAllProgramTexbox =By.xpath("//body/meu-workflow[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/meu-workflow-contract-list[1]/div[1]/div[1]/div[1]/div[2]/meu-control-select-search[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]");
    private By inputNameProgram=By.xpath("//input[@id='mat-input-15']");
    private By clickOnNameinList=By.xpath("//span[contains(text(),'Y tế | YT | 12')]");
    private By getNameprogrambody=By.xpath("//body/div[3]");
    public void popupAddNewContract(){
        KeyWork.clickElement(clickOnContractPage);
        KeyWork.clickElement(clickOnAddIcon);
        KeyWork.verifyElementText(getTiltelPopup,"Hợp đồng mới","Man hinh them moi hop dong hien ra");
    }
    public void inputInforContract(String Mahs,String TimeStart, String TimeEnd,String TimeBCGD,String TimeGD,String TimeBCNT,String TimeNT,String TimeBCTD){
        KeyWork.clickElement(clickOnContractPage);
        KeyWork.clickElement(clickOnAllCOntract);
        KeyWork.clickElement(clickOnAddIcon);
        KeyWork.clickElement(clickOnMaHsTextbox);
        KeyWork.setText(inputMaHsTextbox,Mahs);
        KeyWork.clickElement(selectMaHsList);
        KeyWork.scrollToElement(scrollTiltelDayStart);
        KeyWork.setText(inputDateTextbox,TimeStart);
        KeyWork.setText(inputEnDDateTextbox,TimeEnd);
        KeyWork.setText(inputBCGDTextbox,TimeBCGD);
        KeyWork.setText(inputTimeGDTextbox,TimeGD);
        KeyWork.setText(inputNTtextbox,TimeBCNT);
        KeyWork.setText(inputTimeNtTextbox,TimeNT);
        KeyWork.clickElement(clickOnAddBCTDIcon);
        KeyWork.setText(inputTimeBCTDTextbox,TimeBCTD);
        KeyWork.clickElement(clickOnNameTextbox);
        KeyWork.clickElement(clickonNameList);
        KeyWork.clickElement(clickOnContinueButton);
        KeyWork.verifyElementText(getText2Step,"Chức vụ *","chuyen toi buoc 2 thanh cong");

    }
    public void inputIfThuchien(String Role) {
        KeyWork.setText(inputChucVuTextbox,Role);
        KeyWork.clickElement(clickOnTieptheoButton);
        KeyWork.verifyElementText(getTiltelStep3,"Kinh phí *","Đã chuyển tơi bước 3");
    }
    public void checkBackStep1(){
        KeyWork.clickElement(clickOnBackbutton1);
        KeyWork.verifyElementText(getTiltleButtonClose,"Đóng","Đều hướng trở về bước 1");
    }
    public void inputIfKinhphi(String KinhPhi,String KPNS,String Dot1, String Dot2){
        KeyWork.setText(inputKinhPhiTextbox,KinhPhi);
        KeyWork.setText(inputKinhPhiNSTextbox,KPNS);
        KeyWork.clickElement(clickOnAddDotCapIcon);
        KeyWork.setText(inputKPDot1Textbox,Dot1);
        KeyWork.clickElement(clickOnAddDotCapIcon);
        KeyWork.setText(inputKPDot2Textbox,Dot2);
        KeyWork.clickElement(clickOnHoanThanhButton);
        KeyWork.clickElement(clickOnAllProgramTexbox);
        KeyWork.setText(inputNameProgram,"Y tế | YT | 12");
        KeyWork.clickElement(clickOnNameinList);
        KeyWork.verifyElementText(getNameprogrambody,"Nghiên cứu hiệu quả khử/ tiệt khuẩn không khí, nước thải, và bề mặt của Module Container cách ly tạm áp ","Hop dong da duoc them thanh cong");


    }
    public void checkBackStep2(){
        KeyWork.clickElement(clickOnBackButton2);
        KeyWork.verifyElementText(getTiltleStep2,"Đại diện *","Điều hướng thành công về bước 2");
    }

}
