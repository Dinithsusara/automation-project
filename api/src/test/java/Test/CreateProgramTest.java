package Test;

import dto.ProgramCreationData;
import dto.ProgramCreationRoot;
import functions.ProgramCreation;
import org.testng.annotations.Test;
import utils.Base;

public class CreateProgramTest extends Base {

    @Test(description = "verify program creation status Code ")
    public void verifyProgramCreationStatusCode() {

        ProgramCreationRoot programCreatrionRoot = ProgramCreation.createProgram();
        softAssert.assertEquals(programCreatrionRoot.getStatusCode(), 200);
    }


    @Test(description = "verify program creation data")
    public void verifyProgramCreationData() {


        ProgramCreationData programCreationData = ProgramCreation.createProgram().getData();


        softAssert.assertEquals(programCreationData.getName(), "TestProgramForWebAPI");
        softAssert.assertEquals(programCreationData.getDescription(), "Test");
        softAssert.assertFalse(programCreationData.IsPrivate, String.valueOf(false));
        softAssert.assertEquals(programCreationData.getStartDate(), "2025-02-12T14:48:00Z");
        softAssert.assertEquals(programCreationData.getPromotionalText(), "promotionText");
        softAssert.assertFalse(programCreationData.IsUserJoined, String.valueOf(false));


    }
}
