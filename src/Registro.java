import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        Usuario usuario = null; // Declarar la variable usuario fuera del bucle
        while (continuar) {
            boolean nombreValido = false;
            String nombre = "";
            while (!nombreValido) {
                System.out.print("\nIngrese su nombre (mínimo 2 caracteres, solo letras): ");
                nombre = scanner.nextLine();
                if (Datos.NOMBRE_PATTERN.matcher(nombre).matches()) {
                    nombreValido = true;
                } else {
                    System.out.print("Nombre inválido. Intente nuevamente.");
                }
            }

            boolean emailValido = false;
            String email = "";
            while (!emailValido) {
                System.out.print("Ingrese su correo electrónico (ejemplo@dominio.com):  ");
                email = scanner.nextLine();
                if (Datos.EMAIL_PATTERN.matcher(email).matches()) {
                    emailValido = true;
                } else {
                    System.out.print("Correo electrónico inválido. Intente nuevamente.");
                }
            }

            boolean passwordValido = false;
            String password = "";
            while (!passwordValido) {
                System.out.print("Ingrese su contraseña (mínimo 8 caracteres, al menos una letra minúscula, una letra mayúscula y un dígito):  ");
                password = scanner.nextLine();
                if (Datos.PASSWORD_PATTERN.matcher(password).matches()) {
                    passwordValido = true;
                } else {
                    System.out.print("Contraseña inválida. Intente nuevamente.");
                }
            }

            usuario = new Usuario(nombre, email, password);
            if (usuario.validar()) {
                System.out.print("Registro exitoso!");
            } else {
                System.out.print("Registro fallido. Verifique su información.");
            }

            System.out.print("¿Desea ingresar nuevos datos? (s/n):  ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
    }
}