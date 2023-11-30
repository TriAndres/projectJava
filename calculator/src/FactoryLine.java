import java.util.Scanner;

public class FactoryLine {
    private Scanner scanner;
    private MathAction mathAction;
    private Line line;

    public FactoryLine() {
        scanner = new Scanner(System.in);
        mathAction = new MathAction();
        line = new Line();
    }

    public void game() {

        while (true) {
            System.out.println("Введите римскими или арбскими действие +-/* от 1 до 10 или 0 для выхода,\n" +
                    "пример: 1 + 1 или I + I");
            line.setLine(scanner.nextLine());
            String[] s = line.getLine().split(" +");
            if (s.length == 3) {
                try {
                    calc(s);
                } catch (CustomException e) {
                    System.err.println("Ошибка+: " + e.getMessage());
                }
            }
        }
    }
    private void calc(String[] line) throws CustomException {
        String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] actions = {"+", "-", "*", "/"};

        boolean isArabicNum1 = isBool(arabic, line[0]);
        boolean isArabicNum2 = isBool(arabic, line[2]);
        boolean isRomanNum1 = isBool(roman, line[0]);
        boolean isRomanNum2 = isBool(roman, line[2]);
        boolean isActions = isBool(actions, line[1]);

        if (line[0].equals("0") || line[2].equals("0")) {
            throw new CustomException("в списке от 1 до 10 или от I до X");
        } else if (!(line[1].equals("+") ||  line[1].equals("-") || line[1].equals("*") || line[1].equals("/")) ) {
            throw new CustomException("действие + - * /");
        } else if (isActions) {
            if (isArabicNum1 && isArabicNum2 && !isRomanNum1 && !isRomanNum2) {
                System.out.println("Input\n" + line[0] + " " + line[1] + " " + line[2] + "\nOutput:");
                mathAction.actionMath("arabik", line[0], line[1], line[2]);
            } else if (isRomanNum1 && isRomanNum2 && !isArabicNum1 && !isArabicNum2) {
                System.out.println("Input\n" + line[0] + " " + line[1] + " " + line[2] + "\nOutput:");
                mathAction.actionMath("roman", line[0], line[1], line[2]);
            }  else {
                System.out.println("Input\n" + line[0] + " " + line[1] + " " + line[2]);
                throw new CustomException("используются одновременно разные системы счисления\n" +
                        "или > 10 и > X\n" +
                        "в списке от 1 до 10 или от I до X");
            }
        }
    }

    private boolean isBool(String[] array, String a) {
        boolean flag = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j].equals(a)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}