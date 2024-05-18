package org.example;

// Klavyeden girilen N elemanlı A dizisini küçükten büyüğe doğru "Parçalı Sıralama (Stooge Sort)"
// algoritmasıyla sıralayan program

import java.util.Scanner;

public class Main {

    public static void parcaliSirala(int[] a, int sol, int sag) {

        int k, g;

        if (a[sol] > a[sag]) {
            g = a[sol];
            a[sol] = a[sag];
            a[sag] = g;
        }

        if (sag - sol > 1) {
            k = (int) ((sag - sol + 1) / 3);
            parcaliSirala(a, sol, sag - k);
            parcaliSirala(a, sol + k, sag);
            parcaliSirala(a, sol, sag - k);
        }

    }

    public static void main(String[] args) {

        int i, n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDizinin Eleman Sayısı : ");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println();

        for (i = 0; i < n; i++) {
            System.out.printf("Dizinin " + (i + 1) + ". Elemanı : ");
            a[i] = scanner.nextInt();
        }

        parcaliSirala(a, 0, n - 1);
        System.out.printf("\nSıralı Dizi : \n------------\n");
        for (i = 0; i < n; i++)
            System.out.printf("%d\t",a[i]);

    }
}