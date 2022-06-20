using System;

namespace ProgramaDeEstoque
{
    class Program
    {
        static void Main(string[] args)
        {          
          Console.WriteLine("Entre com os dados do produto:");
          Console.Write("Nome: ");
          string nome = Console.ReadLine();

          Console.Write("Preço: ");
          double preco = double.Parse(Console.ReadLine());

          Console.Write("Quantidade: ");
          int quantidade = int.Parse(Console.ReadLine());

          Produto p = new Produto(nome, preco, quantidade);

          Console.WriteLine("Dados do produto: " + p);

          Console.WriteLine();
          Console.Write("Digite o número de produtos a serem adicionados ao estoque: ");
          quantidade = int.Parse(Console.ReadLine());
          p.AdicionarProdutos(quantidade);
          Console.WriteLine("Dados atualizados: " + p);

          Console.WriteLine();
          Console.WriteLine("Digite o número de produtos a serem removidos do estoque: ");
          quantidade = int.Parse(Console.ReadLine());
          p.RemoverProdutos(quantidade);
          Console.WriteLine("Dados atualizados: " + p);
        }
    }
}