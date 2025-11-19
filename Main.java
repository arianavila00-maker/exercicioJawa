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

    public static void ex8()
    {
        System.out.println( "  J    a   v     v  a     ");
        System.out.println("   J   a a   v   v  a a   ");
        System.out.println("J  J  aaaaa   V V  aaaaa  " );
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void ex9()
    {
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }

    public static void ex10()
    {
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }

    public static void ex11()
    {
        Scanner sc= new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Insira o raio da circunferência: ");
        int raio = sc.nextInt();
        System.out.println("O perimetro é " + (2*pi*raio));
        System.out.println("A área é " + (pi*raio*raio));
    }

    public static void ex12()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Insira 3 número para cacular a média: ");
        int nb = sc.nextInt();
        int nb1 = sc.nextInt();
        int nb2 = sc.nextInt();
        System.out.println("A média é "+((nb+nb1+nb2)/3));

    }
    public static void ex13()
    {
        Scanner sc = new Scanner(System. in);
        System.out.print(" Insira a altura do retangulo: ");
        double altura = sc.nextDouble();
        System.out.print(" Insira a largura do retangulo: ");
        double largura = sc.nextDouble();
        System.out.println("O perímetro é " + (altura+largura)*2);
        System.out.println("A área é " + (largura*altura));

    }



    
    public static void main(String[] args) 
    {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
        //ex11();
        //ex12();
        ex13();


    }
}