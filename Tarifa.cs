using System;

namespace open_kattis
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());
            int sum = x;
            for (int i = 0; i < n; i++) {
                sum += x - int.Parse(Console.ReadLine());
            }
            Console.WriteLine(sum);
        }
    }
}