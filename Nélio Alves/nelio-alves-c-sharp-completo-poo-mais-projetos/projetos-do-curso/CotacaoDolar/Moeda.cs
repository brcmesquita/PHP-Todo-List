namespace CotacaoDolar
{
    class Moeda
    {
        public static double IoF = 6.0;
        public static double ConverterEmDolar(double cotacao, double quantidade)
        {
            double total = cotacao * quantidade;
            return total + total * IoF / 100.0; 
        }
    }
}