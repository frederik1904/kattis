using System;

namespace C__Test
{
    class Program
    {
        static void Main(string[] args)
        {
            int chantTimes = int.Parse(Console.ReadLine());
            for (int i = 1; i <= chantTimes; i++) {
                Console.WriteLine(i + " Abracadabra");
            }
        }
    }
}