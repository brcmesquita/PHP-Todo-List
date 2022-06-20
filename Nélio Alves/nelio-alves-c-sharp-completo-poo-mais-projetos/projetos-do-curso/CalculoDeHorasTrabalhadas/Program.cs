using System;

namespace exercicios_mod_03
{
    class Program
    {
        static void Main(string[] args)
        {
            // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
            Console.WriteLine("Digite o número do funcionário: ");
            int numFunc = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o número de horas trabalhadas: ");
            int numHoras = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite o valor que recebe por hora: ");
            double valorHora = double.Parse(Console.ReadLine());

            double salario = numHoras * valorHora;

            Console.WriteLine("O salário do funcionário {0} é U$ {1}", numFunc, salario.ToString("F2"));
        }
    }
}
