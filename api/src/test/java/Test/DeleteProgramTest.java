package Test;

import dto.DeleteProgramRoot;
import functions.ProgramDelete;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteProgramTest {

    @Test(description = "verify status code for successful program deletion")
    public void verifyDeleteProgramStatusCode() {


        DeleteProgramRoot deleteProgramRoot = ProgramDelete.deleteProgram();

        Assert.assertEquals(deleteProgramRoot.getStatusCode(), 200);


    }

    @Test(description = "verify program deletion for invalid id")
    public void verifyInvalidDeleteProgramStatusCode() {


        DeleteProgramRoot deleteProgramRoot = ProgramDelete.deleteInvalidProgramId();

        Assert.assertEquals(deleteProgramRoot.getStatusCode(), 500);


    }
}
