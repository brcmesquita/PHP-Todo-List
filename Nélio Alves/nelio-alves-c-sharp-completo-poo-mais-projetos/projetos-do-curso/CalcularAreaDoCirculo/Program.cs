using System;

namespace exercicios_mod_03
{
    class Program
    {
        static void Main(string[] args)
        {
            // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo, com quatro casas decimais após o ponto.
            Console.WriteLine("Digite o raio do círculo: ");
            double raio = double.Parse(Console.ReadLine());
            double area = Math.PI * Math.Pow(raio, 2);
            Console.WriteLine("A área do círculo é {0}", area.ToString("F4"));
        }
    }
}
