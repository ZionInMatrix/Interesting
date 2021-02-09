package Solution;


import java.util.Scanner;

public class Printf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, surname;
        int age;
        System.out.println("Zadej jmeno");
        name = scanner.nextLine();
        System.out.println("Zadej prijmeni");
        surname = scanner.nextLine();
        System.out.println("Zadej svuj vek");
        age = Integer.parseInt(scanner.nextLine());
        int nextYearAge = age + 1;
        System.out.printf("%s %s \nVas vek za rok bude % d \n", name.toUpperCase(), surname.toUpperCase(), nextYearAge);
    }
}
//%d pro celá čísla
//%s pro String
//%f pro float