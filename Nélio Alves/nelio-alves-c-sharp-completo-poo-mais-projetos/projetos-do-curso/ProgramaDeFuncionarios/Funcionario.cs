using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ProgramaDeFuncionarios
{
    public class Funcionario
    {
        public string? Nome;
        public double Salario;
        public double Imposto;

        public void AumentarSalario(double porcentagem)
        {
            Salario = Salario + (Salario * porcentagem / 100);
        }
         public double SalarioLiquido()
        {
            return Salario - Imposto;
        }

        //toString
        public override string ToString()
        {
            return $"Funcionario: {Nome}, Salario: R${SalarioLiquido()}.";
        }
    }
}