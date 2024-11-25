import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //O Input
        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = lerNumeros.nextInt();
        //O codigo
        if(num < 9 && num >= 1){
            System.out.println("Este número tem 1 dígito");
        }
        else if(num < 100 && num >= 10){
            System.out.println("Este número tem 2 dígitos");
        }
        else if(num < 1000 && num >=100){
            System.out.println("Este número tem 3 dígitos");
        }
        else if(num < 10000 && num >=1000){
            System.out.println("Este número tem 4 dígitos");
        }
        else if(num < 100000 && num >= 10000){
            System.out.println("Este número tem 5 dígitos");
        }
        else{
            System.out.println("Este número tem 5 ou mais dígitos");
        }
    }
}