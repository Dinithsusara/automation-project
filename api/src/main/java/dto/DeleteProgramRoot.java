package dto;

import lombok.Data;

@Data
public class DeleteProgramRoot {
    public int StatusCode;

    public Object ErrorDescription;

    public Object Data;
    public int totalItems;
}
