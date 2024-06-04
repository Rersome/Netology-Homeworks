public class PasswordChecker {

    private int minLength = -1;
    private int maxRepeats = -1;


    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Минимальная длина пароля не может быть отрицательной");
        }
        this.minLength = minLength;
    }
    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Максимальное количество повторений символа не может быть отрицательным или нулевым");
        }
        this.maxRepeats = maxRepeats;
    }
    public boolean verify(String password) {
        //int counter = 0;
        if (minLength == -1 || maxRepeats == -1) {
            throw new IllegalStateException("Не все настройки чекера были пройдены");
        }
        if (password.length() < minLength) {
            return false;
        }
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                int repeatCount = 1;
                while (i < password.length() - 1 && password.charAt(i) == password.charAt(i + 1)) {
                    repeatCount++;
                    i++;
                }
                if (repeatCount > maxRepeats){
                    return false;
                }
            }
        }
        return true;
    }
}
