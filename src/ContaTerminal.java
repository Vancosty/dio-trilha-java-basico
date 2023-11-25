import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nome;
        int conta;
        int agencia = 1021-1;
        double saque;
        double deposito;
        double saldoAtual;
        int selecao;
        Scanner sc = new Scanner(System.in);

        System.out.println( " Digite seu nome e em seguida o numero da sua conta:");
        nome = sc.next();
        conta = sc.nextInt();
        saldoAtual = 0;

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia " + agencia + ", conta " + conta + " e seu saldo " + saldoAtual + " ja esta disponivel" );
        System.out.println("1- deseja realizar um deposito");
        System.out.println("2- deseja realizar um saque");
        System.out.println("3- sair");

        selecao = sc.nextInt();

if(selecao == 1){
    System.out.println("digite o valor a ser depositado");
    deposito = sc.nextDouble(); if (deposito > 0){
        saldoAtual = saldoAtual+deposito;
        System.out.print("novo saldo:" + saldoAtual);
    }else {
        System.out.println("valor nao aceito");
    }

} else if (selecao == 2) {
    System.out.println("digite o valor a ser sacado");
    saque = sc.nextDouble();if(saque <= saldoAtual){
    saldoAtual = saldoAtual - saque;
        System.out.print("novo saldo:" + saldoAtual);
    }else {
        System.out.print("valor invalido");}

    }else {        System.out.print("obrigado por usar o nosso banco");



}

    }
}
