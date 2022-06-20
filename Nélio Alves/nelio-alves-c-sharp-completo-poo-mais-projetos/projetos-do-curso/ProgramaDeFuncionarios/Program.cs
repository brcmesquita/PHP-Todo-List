namespace ProgramaDeFuncionarios
{
  class Program
  {
    static void Main(string[] args)
    {
      Funcionario funcionario = new Funcionario();

      Console.Write("Nome: ");
      funcionario.Nome = Console.ReadLine();

      Console.Write("Salário: ");
      funcionario.Salario = double.Parse(Console.ReadLine());

      Console.Write("Imposto: ");
      funcionario.Imposto = double.Parse(Console.ReadLine());

      Console.WriteLine("Funcionario: " + funcionario.ToString());

      Console.WriteLine();
      Console.Write("Digite a porcentagem para aumentar o salário: ");
      double porcentagem = double.Parse(Console.ReadLine());
      funcionario.AumentarSalario(porcentagem);
      Console.WriteLine("Dados atualizados: " + funcionario.ToString());
    }
  }
}