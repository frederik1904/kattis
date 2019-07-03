using System;

namespace open_kattis
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            for (int i = 0; i < t; i++) {
                int n = int.Parse(Console.ReadLine());
                int sum = 1;
                for (int j = 1; j <= n; j++) {
                    sum *= j;
                }
                Console.WriteLine(sum % 10);
            }
            
        }
    }
}