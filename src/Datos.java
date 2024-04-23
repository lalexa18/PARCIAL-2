import java.util.regex.Pattern;

public class Datos {
    public static final Pattern NOMBRE_PATTERN = Pattern.compile("^[a-zA-Z ]{2,30}$");
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    public static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");
}