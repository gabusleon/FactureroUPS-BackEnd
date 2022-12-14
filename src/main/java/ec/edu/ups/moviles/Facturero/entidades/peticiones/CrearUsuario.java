package ec.edu.ups.moviles.Facturero.entidades.peticiones;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CrearUsuario {

    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
