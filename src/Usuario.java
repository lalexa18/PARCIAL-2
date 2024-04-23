public class Usuario {
    private String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public boolean validar() {
        return Datos.NOMBRE_PATTERN.matcher(nombre).matches()
                && Datos.EMAIL_PATTERN.matcher(email).matches()
                && Datos.PASSWORD_PATTERN.matcher(password).matches();
    }

    // Getters y setters
}