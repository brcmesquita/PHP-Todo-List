// Fazer um programa para ler os dados de duas pessoas
// depois mostrar o nome da pessoa mais velha

using System;

namespace PessoaMaisVelha {
  class Program {
    static void Main(string[] args) {
      Pessoa p1, p2;
      p1 = new Pessoa();
      p2 = new Pessoa();

      Console.WriteLine("Digite o nome da primeira pessoa: ");
      p1.Nome = Console.ReadLine();

      Console.WriteLine("Digite a idade da primeira pessoa: ");
      p1.Idade = int.Parse(Console.ReadLine());

      Console.WriteLine("Digite o nome da segunda pessoa: ");
      p2.Nome = Console.ReadLine();

      Console.WriteLine("Digite a idade da segunda pessoa: ");
      p2.Idade = int.Parse(Console.ReadLine());

      if (p1.Idade > p2.Idade) {
        Console.WriteLine("A pessoa mais velha é: " + p1.Nome);
      } else {
        Console.WriteLine("A pessoa mais velha é: " + p2.Nome);
      }
    }
  }
}