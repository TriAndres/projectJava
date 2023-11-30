import java.util.Arrays;
import java.util.List;

public class MathAction {
    private final String[] roman = {
             "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    private final List<String> list = Arrays.asList(roman);

    public void actionMath(String math, String num1, String action, String num2) {
        try {
            sum(math, num1, action, num2);
            sub(math, num1, action, num2);
            mull(math, num1, action, num2);
            div(math, num1, action, num2);
        } catch (CustomException e) {
            System.err.println("Ошибка+: " + e.getMessage());
        }
    }

    public void sum(String math, String num1, String action, String num2) throws CustomException {
        if (action.equals("+")) {
            if (math.equals("arabik")) {
                System.out.println(String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2)));
            }
            if (math.equals("roman")) {
                try {
                    System.out.println(list.get((list.indexOf(num1) + 1) + (list.indexOf(num2) + 1) - 1));
                } catch (Exception e) {
                    throw new CustomException("Таких нет, нужно дописать цифры в массиве, сейчас их " + list.size());
                }

            }
        }
    }

    public void sub(String math, String num1, String action, String num2) throws CustomException {
        if (action.equals("-")) {
            if (math.equals("arabik")) {
                System.out.println(String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2)));
            }
            if (math.equals("roman")) {
                try {
                    System.out.println(list.get((list.indexOf(num1) + 1) - (list.indexOf(num2) + 1) - 1));
                } catch (Exception e) {
                    throw new CustomException("В римских  нет отрецательных цифр");
                }
            }
        }
    }

    public void mull(String math, String num1, String action, String num2) throws CustomException {
        if (action.equals("*")) {
            if (math.equals("arabik")) {
                System.out.println(String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2)));
            }
            if (math.equals("roman")) {
                try {
                    System.out.println(list.get((list.indexOf(num1) + 1) * (list.indexOf(num2) + 1) - 1));
                } catch (Exception e) {
                    throw new CustomException("Таких нет, нужно дописать цифры в массиве, сейчас их " + list.size());
                }
            }
        }
    }

    public void div(String math, String num1, String action, String num2) throws CustomException {
        if (action.equals("/")) {
            if (math.equals("arabik")) {
                System.out.println(String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2)));
            }
            if (math.equals("roman")) {
                try {
                    System.out.println(list.get((list.indexOf(num1) + 1) / (list.indexOf(num2) + 1) - 1));
                } catch (Exception e) {
                    throw new CustomException("В римских  нет отрецательных цифр");
                }
            }
        }
    }
}