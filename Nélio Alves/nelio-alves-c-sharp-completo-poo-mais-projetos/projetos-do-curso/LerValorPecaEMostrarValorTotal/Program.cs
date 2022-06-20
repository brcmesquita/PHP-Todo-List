using System;

namespace exercicios_mod_03
{
    class Program
    {
        static void Main(string[] args)
        {
            // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
            Console.WriteLine("Digite o código da primeira peça: ");
            int codPeca1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o número de peças da primeira peça: ");
            int numPecas1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o valor unitário da primeira peça: ");
            double valorPeca1 = double.Parse(Console.ReadLine());

            Console.WriteLine("Digite o código da segunda peça: ");
            int codPeca2 = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o número de peças da segunda peça: ");
            int numPecas2 = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o valor unitário da segunda peça: ");
            double valorPeca2 = double.Parse(Console.ReadLine());

            double valorTotal = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);
            Console.WriteLine("O valor total a ser pago é U$ {0}", valorTotal.ToString("F2"));
        }
    }
}
