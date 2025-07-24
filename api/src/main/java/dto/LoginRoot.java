package dto;


import lombok.Data;

@Data
public class LoginRoot {
    public String access_token;
    public int expires_in;
    public String token_type;
    public String refresh_token;
}
