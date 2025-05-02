package br.edu.fatecpg.view;

import br.edu.fatecpg.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaDeseguranca sistema = new SistemaDeseguranca();

        while (!sistema.isAutenticado()) {
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (sistema.login(usuario, senha)) {
                System.out.println("Bem-vindo, " + usuario + "!");
            } else {
                System.out.println("Credenciais inválidas. Tente novamente.");
            }
        }

        System.out.print("Deseja sair? (s/n): ");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            sistema.logout();
        }

        sc.close();
    }
}
