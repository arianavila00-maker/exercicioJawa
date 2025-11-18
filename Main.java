import java.util.Scanner;

public class Main
{
    public static void ex1() 
    {
      
        System.out.println("Hello");
        System.out.println("Arian Avila");
        
    }
    public static void ex2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o primeiro número: ");
        int nb = sc.nextInt();
        System.out.print("Escolha o segundo número: ");
        int nb1 = sc.nextInt();
        int total = nb + nb1;
        System.out.println("O resultado da soma é "+ total);


    }

    public static void ex3() 
    {
      Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o primeiro número: ");
        int nb = sc.nextInt();
        System.out.print("Escolha o segundo número: ");
        int nb1 = sc.nextInt();
        int total = nb* nb1;
        System.out.println("O resultado da multiplcação é "+ total);
        
    }

    public static void ex4()
    {
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20+-3*5/8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void ex6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o primeiro número: ");
        int nb = sc.nextInt();
        System.out.print("Escolha o segundo número: ");
        int nb1 = sc.nextInt();

        System.out.println(nb+ " + "+ nb1 + " = " + (nb+nb1));
        System.out.println(nb+ " - "+ nb1 + " = " + (nb-nb1));
        System.out.println(nb+ " x "+ nb1 + " = " + (nb*nb1));
        System.out.println(nb+ " / "+ nb1 + " = " + (nb/nb1));
        System.out.println(nb+ " mod "+ nb1 +" = " +(nb%nb1));

    }

    public static void ex7()
    {
        for(int i = 1;i<=10;i++){
            System.out.println(" 8 "+"x " + i +" = "+ (8*i));
        }
            
        }

    
    public static void main(String[] args) 
    {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex6();
        ex7();

    }
}