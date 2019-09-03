package _20_annotation._01_basic_grammar._01_define;

import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/3 18:57
 **/
public class PasswordUtils {
    @UseCase(id = 47, description =
    "Passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }
    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description =
    "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(
        List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
