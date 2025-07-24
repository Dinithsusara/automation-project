package dto;

import lombok.Data;

@Data
public class UpdateProgramRoot {

    public int StatusCode;

    public Object ErrorDescription;

    public UpdateProgramData Data;
    public int totalItems;
}
