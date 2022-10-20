package com.company;

public class Main {

    public static <var> void main(String[] args) {
	// write your code here

        //  If
        System.out.println("- If");
        int numeroIf = 10;
        if (numeroIf > 0) {
            System.out.println("El número "+numeroIf+" es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número "+numeroIf+" es negativo");
        } else{
            System.out.println("El número "+numeroIf+" es igual a 0");
        }

        //  While
        System.out.println("- While");
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            System.out.println("El número While es "+numeroWhile);
            numeroWhile++;
        }

        //  Do While
        System.out.println("- Do While");
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("El número Do While es "+numeroDoWhile);
        }while (numeroDoWhile <3);

        //  For
        System.out.println("- For");
        for (int numeroFor = 1; numeroFor <= 3; numeroFor++) {
            System.out.println("El número For es "+numeroFor);
        }

        //  Swicth
        System.out.println("- Switch");
        String estacion = "Verano";
        switch(estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Estación incorrecta");
        }
    }
}
