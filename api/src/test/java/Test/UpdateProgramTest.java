package Test;

import dto.UpdateProgramData;
import dto.UpdateProgramRoot;
import functions.ProgramUpdate;
import org.testng.annotations.Test;
import utils.Base;


public class UpdateProgramTest extends Base {


    @Test(description = "verify status code for successful program Update")
    public void verifyUpdateProgramStatusCode() {

        UpdateProgramRoot updateProgramRoot = ProgramUpdate.updateProgram();

        softAssert.assertEquals(updateProgramRoot.getStatusCode(), 200);


    }


    @Test(description = "verify updated program data")
    public void verifyUpdateProgramData() {

        UpdateProgramData updateProgramData = ProgramUpdate.updateProgram().getData();


        softAssert.assertEquals(updateProgramData.getName(), "APIAutomation");
        softAssert.assertEquals(updateProgramData.getDescription(), "description");
        softAssert.assertEquals(updateProgramData.getDuration(), 1);
        softAssert.assertFalse(updateProgramData.IsPrivate, String.valueOf(false));
        softAssert.assertEquals(updateProgramData.getImageUrl(), "imageUrl");
        softAssert.assertEquals(updateProgramData.getGetSocialLink(), "https://sprintcrowd.onelink.me/woHB/yvh2ymxg");
        softAssert.assertEquals(updateProgramData.getProgramCode(), "PROMO");
        softAssert.assertEquals(updateProgramData.getStartDate(), "2025-09-12T14:48:00.000Z");
        softAssert.assertEquals(updateProgramData.getStatus(), 0);
        softAssert.assertFalse(updateProgramData.IsPublish, String.valueOf(false));
        softAssert.assertFalse(updateProgramData.IsPromoteInApp, String.valueOf(false));
        softAssert.assertEquals(updateProgramData.getPromotionalText(), "promotionText");
        softAssert.assertEquals(updateProgramData.getEndDate(), "2025-02-19T14:48:00Z");
        softAssert.assertEquals(updateProgramData.getProgramParticipantCount(), 0);
        softAssert.assertFalse(updateProgramData.IsUserJoined, String.valueOf(false));


    }
}
