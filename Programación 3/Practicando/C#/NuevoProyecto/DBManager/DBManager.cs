using System;
using System.Collections.Generic;
using MySql.Data.MySqlClient;
using System.Dynamic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Text.Json;
using System.Globalization;

namespace SoftDBManager
{
    public class DBManager
    {
        private static string NOMBRE_ARCHIVO = "../../../base_de_datos.json";
        private MySqlConnection conexion;
        private string base_de_datos;
        private string nombre_del_host;
        private string puerto;
        private string usuario;
        private string contrasenha;
        private static DBManager dbManager = null;
        private DBManager()
        {

        }

        public static DBManager Instance
        {
            get
            {
                if (dbManager == null)
                {
                    createInstance();
                }
                return dbManager;
            }
        }

        private static void createInstance()
        {
            if (dbManager == null)
            {
                dbManager = new DBManager();
            }
        }

        public MySqlConnection Conexion
        {
            get {
                this.leerArchivoDeConfiguracion();
                string cadenaDeConexion = this.obtenerCadenaDeConexion();
                this.conexion = new MySqlConnection(cadenaDeConexion);
                return conexion;
            }
        }

        public class MySQL_Json
        {
            public string base_de_datos { get; set; }
            public string nombre_del_host { get; set; }
            public string puerto { get; set; }
            public string usuario { get; set; }
            public string contrasenha { get; set; }

        }

        private void leerArchivoDeConfiguracion()
        {
            string cadenaJson = File.ReadAllText(NOMBRE_ARCHIVO);
            Console.WriteLine(cadenaJson);
            MySQL_Json mySQL_Json = JsonSerializer.Deserialize<MySQL_Json>(cadenaJson);
            this.nombre_del_host = mySQL_Json.nombre_del_host;
            this.puerto = mySQL_Json.puerto;
            this.usuario = mySQL_Json.usuario;
            this.contrasenha = mySQL_Json.contrasenha;
            this.base_de_datos = mySQL_Json.base_de_datos;
        }

        private string obtenerCadenaDeConexion()
        {
            string cadenaDeConexion = "server=" + this.nombre_del_host + ";";
            cadenaDeConexion += "user=" + this.usuario + ";";
            cadenaDeConexion += "password=" + this.contrasenha + ";";
            cadenaDeConexion += "port=" + this.puerto + ";";
            cadenaDeConexion += "database=" + this.base_de_datos + ";";
            Console.WriteLine(cadenaDeConexion);
            return cadenaDeConexion;
        }

        
    }
}
