import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel exercice ? Saisissez :\n" +
                "1. Discriminant\n" + "2. Parité d’un nombre\n" +
                "3. Calcul d’extremum\n" + "4. Égalité entre chaînes de caractères\n" +
                "5. Factorielle\n" + "6. Compte à rebous\n" +
                "7. Valeurs de carrés\n" + "8. Table de multiplication\n" +
                "9. Division d’entiers\n" + "10. Règle graduée\n" +
                "11. Nombres premiers\n" + "12. Manipulations sur un tableau");
        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
                min();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                initialisationTableau();
                int[] tableau = new int[11];
                Scanner scannerNew = new Scanner(System.in);
                int max = -2147483648;
                int min = 2147483647;
                System.out.println("\nOn va mainteant inverser un tableau dont vous allez entrer les valeurs");
                for (int i = 0; i < tableau.length; i++) {
                    System.out.println("\nSaisir un entier");
                    int entier = scannerNew.nextInt();
                    tableau[i] = entier;
                }
                inverseTableau(tableau);
                System.out.println("Votre tableau inversé donne: ");
                for (int i = 0; i < tableau.length; i++) {
                    System.out.print(tableau[i] + " ");
                }

                break;
        }



    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            double xr = (-b) / (2 * a);
            double xi = Math.sqrt(-delta) / (2 * a);
            double yr = (-b) / (2 * a);
            double yi = (-Math.sqrt(-delta)) / (2 * a);
            System.out.println("Ce polynome a deux racines complexes : " + xr + " + " + xi + " i " + " et " + yr + " + " + yi + " i ");
        } else if (delta == 0) {
            int r = (-b) / (2 * a);
            System.out.println("Ce polynome a une racine double " + r);
        } else {
            double x = (-b + Math.sqrt(delta)) / (2 * a);
            double y = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Ce polynome a deux racines : " + x + " et " + y);
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un entier");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Le nombre " + x + " est pair");
        } else {
            System.out.println("Le nombre " + x + " est impair");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir deux entiers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("L'entier maximum est " + x);
        } else if (x < y) {
            System.out.println("L'entier maximum est " + y);
        } else {
            System.out.println("Les deux entiers sont égaux");
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir deux entiers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("L'entier minimum est " + y);
        } else if (x < y) {
            System.out.println("L'entier minimum est " + x);
        } else {
            System.out.println("Les deux entiers sont égaux");
        }
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir deux chaînes de caractères");
        String premiereChaine = scanner.nextLine();
        String deuxiemeChaine = scanner.nextLine();
        boolean test = premiereChaine.equals(deuxiemeChaine);
        if (test) {
            System.out.println("Les deux chaînes de caractères sont égales");
        } else {
            System.out.println("Les deux chaînes de caractères ne sont pas égales");
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    public static void countdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + "\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BOOM");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int entier = scanner.nextInt();
        int squareentier = entier * entier;
        System.out.println("x = " + entier + "\tx² = " + squareentier);
    }

    public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir deux entiers");
        int premierEntier = scanner.nextInt();
        int deuxiemeEntier;
        do {
            deuxiemeEntier = scanner.nextInt();
        } while (deuxiemeEntier == 0);

        int quotient = premierEntier / deuxiemeEntier;
        int reste = premierEntier % deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier + " donne " + quotient + " avec un reste égal à " + reste);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int entier;
        do {
            System.out.println("Saisir un entier strictement positif");
            entier = scanner.nextInt();
        } while (entier <= 0);
        for (int i = 0; i <= entier; i++) {
            if (i % 10 != 0) {
                System.out.print("-");
            } else {
                System.out.print("|");
            }
        }
    }

    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int entier;
        do {
            System.out.println("Saisir un entier strictement positif");
            entier = scanner.nextInt();
        } while (entier <= 0);
        int entierSquare = (int) Math.sqrt(entier);
        for (int i = 2; i <= entierSquare; i++) {
            if (entier % i == 0) {
                System.out.println(entier + " n'est pas un nombre premier");
                return;
            }

        }
        System.out.println(entier + " est un nombre premier");
    }

    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        int max = -2147483648;
        int min = 2147483647;
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
            if (tableau[i] >= max) {
                max = tableau[i];
            } else if (tableau[i] < min) {
                min = tableau[i];
            }
            somme += tableau[i];
        }
        System.out.println("Le maximum du tableau est " + max + "\nLe minimum du tableau est " + min);
        System.out.println("La somme des éléments du tableau donne " + somme);
        System.out.println("Les éléments pairs du tableau sont: ");

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] % 2 == 0) {
                System.out.print(tableau[i] + " ");
            }
        }
        System.out.println("\nLes éléments d'indice pair du tableau sont: ");
        for (int i = 0; i < tableau.length; i += 2) {
            System.out.print(tableau[i] + " ");
        }

    }

    public static void inverseTableau(int[] tableau) {
        for (int i = 0; i < tableau.length / 2; i++) {
            int temporaire = tableau[i];
            tableau[i] = tableau[tableau.length - i - 1];
            tableau[tableau.length -i - 1] = temporaire;
        }
    }

}





