import java.util.Scanner;

class Fraction {
    private String numerator;
    private String denominator;

    public Fraction(String numerator, String denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        if (denominator.equals("1") || numerator.equals("0")) {
            return numerator;
        } else if (numerator.equals("0")) {
            return "0";
        } else if (numerator.length() > denominator.length() || numerator.compareTo(denominator) > 0) {
            int wholePart = Integer.parseInt(numerator) / Integer.parseInt(denominator);
            String numeratorPart = Integer.toString(Integer.parseInt(numerator) % Integer.parseInt(denominator));
            return wholePart + " " + numeratorPart + "/" + denominator;
        } else {
            return numerator + "/" + denominator;
        }
    }

    public static Fraction parseFraction(String input) {
        if (input.contains("/")) {
            String[] parts = input.split("/");
            String numerator = parts[0];
            String denominator = parts[1];
            if (denominator.equals("0")) {
                throw new IllegalArgumentException("Знаменник не може дорівнювати нулю");
            }
            return new Fraction(numerator, denominator);
        } else {
            return new Fraction(input, "1");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть дріб (у форматі 'x/y' або 'x'): ");
        String input = scanner.nextLine();

        Fraction fraction = parseFraction(input);

        System.out.println("Текстове представлення дробу: " + fraction);

        scanner.close();
    }
}
