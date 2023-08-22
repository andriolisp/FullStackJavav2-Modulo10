import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodo1();
    }

    private static void Metodo5() {
        List<Double> notas = new ArrayList<Double>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre as notas do aluno: ");
            while (notas.size() != 4) {
                try {
                    int nota = notas.size() + 1;
                    System.out.printf("Entre a nota %d: ", nota);
                    double notaValue = sc.nextDouble();

                    if (notaValue > 10 || notaValue < 0) {
                        System.out.println("Nota inválida, a nota só pode ser entre 0 e 10");
                    } else {
                        notas.add(notaValue);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Nota inválida, a nota deve ser um número");
                    sc.next();
                }
            }
        }

        double totalNota = notas.stream().mapToDouble(Double::doubleValue).sum();
        double media = totalNota / notas.size();
        if(media >= 7) {
            System.out.printf("O aluno passou de ano com a média: %.2f", media);
        } else if (media >= 5) {
            System.out.printf("O aluno ficou de recuperação com a média:  %.2f", media);
        } else {
            System.out.printf("O aluno reprovou com a média:  %.2f", media);
        }
    }
    private static void Metodo4() {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<Double>();

        System.out.println("Entre as notas do aluno: ");
        while(notas.size() != 4) {
            try {
                int nota = notas.size() + 1;
                System.out.printf("Entre a nota %d:", nota);
                double notaValue = sc.nextDouble();

                if (notaValue > 10 || notaValue < 0) {
                    System.out.println("Nota inválida, a nota só pode ser entre 0 e 10");
                } else {
                    notas.add(notaValue);
                }
            } catch(InputMismatchException e) {
                System.out.println("Nota inválida, a nota deve ser um número");
                sc.next();
            }
        }
        sc.close();

        double totalNota = 0;
        for(double nota : notas) {
            totalNota = totalNota+nota;
        }

        double media = totalNota / notas.size();
        if(media >= 7) {
            System.out.printf("O aluno passou de ano com a média: %.2f", media);
        } else if (media >= 5) {
            System.out.printf("O aluno ficou de recuperação com a média:  %.2f", media);
        } else {
            System.out.printf("O aluno reprovou com a média:  %.2f", media);
        }
    }

    private static void Metodo3() {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<Double>();

        System.out.println("Entre as notas do aluno: ");
        while(notas.size() != 4) {
            int nota = notas.size() + 1;
            System.out.printf("Entre a nota %d:", nota);
            double notaValue = sc.nextDouble();

            if(notaValue > 10 || notaValue < 0) {
                System.out.println("Nota inválida, a nota só pode ser entre 0 e 10");
            } else {
                notas.add(notaValue);
            }
        }
        sc.close();

        double totalNota = 0;
        for(double nota : notas) {
            totalNota = totalNota+nota;
        }

        double media = totalNota / notas.size();
        if(media >= 7) {
            System.out.printf("O aluno passou de ano com a média: %.2f", media);
        } else if (media >= 5) {
            System.out.printf("O aluno ficou de recuperação com a média:  %.2f", media);
        } else {
            System.out.printf("O aluno reprovou com a média:  %.2f", media);
        }
    }

    private static void Metodo2() {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<Double>();

        System.out.println("Entre as notas do aluno: ");
        while(notas.size() != 4) {
            int nota = notas.size() + 1;
            System.out.printf("Entre a nota %d:", nota);
            notas.add(sc.nextDouble());
        }
        sc.close();

        double totalNota = 0;
        for(double nota : notas) {
            totalNota = totalNota+nota;
        }

        double media = totalNota / notas.size();
        if(media >= 7) {
            System.out.printf("O aluno passou de ano com a média: %.2f", media);
        } else if (media >= 5) {
            System.out.printf("O aluno ficou de recuperação com a média:  %.2f", media);
        } else {
            System.out.printf("O aluno reprovou com a média:  %.2f", media);
        }
    }
    private static void Metodo1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre as notas do aluno: ");

        System.out.println("Nota 1: ");
        double nota1 = sc.nextFloat();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextFloat();

        System.out.println("Nota 3: ");
        double nota3 = sc.nextFloat();

        System.out.println("Nota 4: ");
        double nota4 = sc.nextFloat();
        sc.close();

        double media = (nota1+nota2+nota3+nota4)/4;
        if(media >= 7) {
            System.out.printf("O aluno passou de ano com a média: %.2f", media);
        } else if (media >= 5) {
            System.out.printf("O aluno ficou de recuperação com a média:  %.2f", media);
        } else {
            System.out.printf("O aluno reprovou com a média:  %.2f", media);
        }
    }
}