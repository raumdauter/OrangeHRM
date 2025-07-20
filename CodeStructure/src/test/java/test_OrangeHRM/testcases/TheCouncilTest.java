package test_OrangeHRM.testcases;

import org.testng.annotations.Test;

import test_OrangeHRM.base.BaseTest;

public class TheCouncilTest extends BaseTest {
    @Test
    public void createGiamDinhCouncil() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createGiamDinhCouncil");
        getTheCouncilPage().createGiamDinhCouncil(
                getExcel().getCellData("GiamDinhCouncilName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("GiamDinhCouncilName",1));
    }

    @Test (priority = 1)
    public void createNghiemThuCouncil() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createNghiemThuCouncil");
        getTheCouncilPage().createNghiemThuCouncil(
                getExcel().getCellData("NghiemThuCouncilName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("NghiemThuCouncilName",1));
    }

    @Test (priority = 2)
    public void createThamDinhNoiDungCouncil() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createThamDinhNoiDungCouncil");
        getTheCouncilPage().createThamDinhNoiDungCouncil(
                getExcel().getCellData("ThamDinhNoiDungCouncilName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("ThamDinhNoiDungCouncilName",1));
    }

    @Test (priority = 3)
    public void createToThanhDinhKinhPhi() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createToThamDinhKinhPhi");
        getTheCouncilPage().createToThamDinhKinhPhi(
                getExcel().getCellData("ToThamDinhKinhPhiName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("ToThamDinhKinhPhiName",1));
    }

    @Test (priority = 4)
    public void createTuVanKiemTraCouncil() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createTuVanKiemTraCouncil");
        getTheCouncilPage().createTuVanKiemTraCouncil(
                getExcel().getCellData("TuVanKiemTraCouncilName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("TuVanKiemTraCouncilName",1));
    }

    @Test (priority = 5)
    public void createThanhLyCouncil() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createThanhLyCouncil");
        getTheCouncilPage().createThanhLyCouncil(
                getExcel().getCellData("ThanhLyCouncilName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("ThanhLyCouncilName",1));
    }

    @Test (priority = 6)
    public void createTuVanDieuChinhHopDongCouncil() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createDieuChinhHopDongCouncil");
        getTheCouncilPage().createTuVanDieuChinhHopDongCouncil(
                getExcel().getCellData("DieuChinhHopDongCouncilName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("DieuChinhHopDongCouncilName",1));
    }

    @Test (priority = 7)
    public void createLayYKienChuyenGiaCouncil() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createYKienChuyenGiaCouncil");
        getTheCouncilPage().createLayYKienChuyenGiaCouncil(
                getExcel().getCellData("YKienChuyenGiaCouncilCouncilName",1),
                getExcel().getCellData("Description",1),
                getExcel().getCellData("NameOfApprover", 1),
                getExcel().getCellData("Signature", 1),
                getExcel().getCellData("CouncilMember1",1),
                getExcel().getCellData("JobTitleMember1",1),
                getExcel().getCellData("SignatureMember1",1),
                getExcel().getCellData("CouncilMember2",1),
                getExcel().getCellData("JobTitleMember2",1),
                getExcel().getCellData("SignatureMember2",1),
                getExcel().getCellData("TaskCode",1)
        );
        getTheCouncilPage().verifyAddNewCouncil();
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList(getExcel().getCellData("YKienChuyenGiaCouncilCouncilName",1));
    }

    @Test
    public void check() {
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                getExcel().getCellData("Username",1),
                getExcel().getCellData("Password",1));
        getExcel().setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/CouncilPage.xlsx","createYKienChuyenGiaCouncil");
        getTheCouncilPage().verifyCreatedCouncilDisplayedInList("nhap sai du lieu");
        //getTheCouncilPage().verifyAddNewCouncil();
    }
}
