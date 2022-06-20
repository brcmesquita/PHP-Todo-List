// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");

int n = int.Parse(Console.ReadLine());
double[] vetor = new double[n];

for (int i = 0; i < n; i++)
{
    vetor[i] = double.Parse(Console.ReadLine());
}