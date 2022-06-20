using System;

namespace ProgramaDeEstoque
{
    class Program
    {
        static void Main(string[] args)
        {
          Produto p1;
          p1 = new Produto();
          
          Console.WriteLine("Entre com os dados do produto:");
          Console.Write("Nome: ");
          p1.Nome = Console.ReadLine();

          Console.Write("Preço: ");
          p1.Preco = double.Parse(Console.ReadLine());

          Console.Write("Quantidade: ");
          p1.Quantidade = int.Parse(Console.ReadLine());

          Console.WriteLine("Dados do produto: " + p1);

          Console.WriteLine();
          Console.Write("Digite o número de produtos a serem adicionados ao estoque: ");
          int qte = int.Parse(Console.ReadLine());
          p1.AdicionarProdutos(qte);
          Console.WriteLine("Dados atualizados: " + p1);

          Console.WriteLine();
          Console.WriteLine("Digite o número de produtos a serem removidos do estoque: ");
          qte = int.Parse(Console.ReadLine());
          p1.RemoverProdutos(qte);
          Console.WriteLine("Dados atualizados: " + p1);

        }
    }
}