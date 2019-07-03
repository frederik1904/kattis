using System;

namespace C__Test
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            double sum = 0;
            for (int i = 0; i < N; i++)
            {
                string temp = Console.ReadLine();
                string[] tempArray = temp.Split(' ');
                sum += double.Parse(tempArray[0]) * double.Parse(tempArray[1]);
            }
            Console.WriteLine(sum);
        }
    }
}