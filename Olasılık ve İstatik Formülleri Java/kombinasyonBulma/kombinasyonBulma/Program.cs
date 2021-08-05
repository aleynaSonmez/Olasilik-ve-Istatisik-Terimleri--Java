using System;
using System.Numerics;

namespace kombinasyonBulma
{
    class Program
    {
        static void Main(string[] args)
        {



            BigInteger n, r;

            Console.Write("n Değerini Giriniz :");
            n = Convert.ToInt16(Console.ReadLine());

            Console.Write("r Değeri Giriniz:");
            r = Convert.ToInt16(Console.ReadLine());

            BigInteger a = 1;
            for (int i = 1; i <= n; i++)
            {
                a = a * i;
            }

          BigInteger b = 1;
            for (int i = 1; i <= r; i++)
            {
                b = b * i;
            }

            BigInteger c = 1;
            for (int i = 1; i <= (n - r); i++)
            {
                c = c * i;
            }

            Console.Write(n + "'in " + r + "'li permütasyonu = " + (a / (b * c)));
            Console.ReadKey();
            Console.ReadLine();


        }
    }
}
