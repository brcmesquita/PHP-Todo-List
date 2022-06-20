using System;

namespace exercicios_mod_03
{
    class Program
    {
        static void Main(string[] args)
        {
            // Exercício 1
            Console.WriteLine("Exercício 1");
            // Ler dois números inteiros e imprimir a soma entre eles.
            Console.WriteLine("Digite o primeiro número: ");
            int num1 = int.Parse(Console.ReadLine());
            
            Console.WriteLine("Digite o segundo número: ");
            int num2 = int.Parse(Console.ReadLine());

            Console.WriteLine("A soma entre {0} e {1} é {2}", num1, num2, num1 + num2);
        }
    }
}
