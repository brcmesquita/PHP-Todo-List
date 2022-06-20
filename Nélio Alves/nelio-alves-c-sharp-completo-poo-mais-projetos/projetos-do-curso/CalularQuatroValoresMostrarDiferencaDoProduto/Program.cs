using System;

namespace exercicios_mod_03
{
    class Program
    {
        static void Main(string[] args)
        {
            // Ler quatro números inteiros A, B, C e D. Calcular e mostrar a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B) - (C * D).
            Console.WriteLine("Digite o primeiro número: ");
            int a = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o segundo número: ");
            int b = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o terceiro número: ");
            int c = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o quarto número: ");
            int d = int.Parse(Console.ReadLine());

            Console.WriteLine("A diferença do produto de {0} e {1} pelo produto de {2} e {3} é {4}", a, b, c, d, (a * b) - (c * d));
        }
    }
}
