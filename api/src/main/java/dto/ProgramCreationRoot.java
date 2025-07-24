package dto;

import lombok.Data;

@Data

public class ProgramCreationRoot {

    public int StatusCode;

    public Object ErrorDescription;

    public ProgramCreationData Data;
    public int totalItems;



}
