using System;
using System.Globalization;

namespace CotacaoDolar
{
  class Program
  {
    static void Main(string[] args)
    {
    Console.WriteLine("=== Cotação do Dólar ===");
    Console.WriteLine();

    Console.Write("Qual é a cotação do dólar? ");
    double cotacao = double.Parse(Console.ReadLine());

    Console.Write("Quanto dólares você vai comprar? ");
    double quantidade = double.Parse(Console.ReadLine());

    double result = Moeda.ConverterEmDolar(cotacao, quantidade);

    Console.WriteLine("Valor a ser pago em reais: " + result.ToString("F2", CultureInfo.InvariantCulture));
    }
  }

}