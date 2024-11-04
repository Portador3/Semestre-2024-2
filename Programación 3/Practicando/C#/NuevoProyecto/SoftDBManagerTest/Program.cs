using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SoftDBManager;
using MySql.Data.MySqlClient;


namespace SoftDBManagerTest
{
    internal class Program
    {
        static void Main(string[] args)
        {
            System.Console.WriteLine("Error");
            DBManager dbManager = null;
            System.Console.WriteLine(dbManager);
            dbManager = DBManager.Instance;
            MySqlConnection conn = dbManager.Conexion;
            conn.Open();
            conn.Close();
            System.Console.WriteLine(dbManager);
            System.Console.ReadLine();
        }
    }
}
