package org.example;



import static spark.Spark.get;
import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        get("hello", (req,res) -> "Hello Docker!");

        get("/sin/:numero", (req, res) -> {
            double numero = Double.parseDouble(req.params(":numero"));
            double resultado = Math.sin(numero);
            return "{\"resultado\": " + resultado + "}";
        });

        get("/cos/:numero", (req, res) -> {
            double numero = Double.parseDouble(req.params(":numero"));
            double resultado = Math.cos(numero);
            return "{\"resultado\": " + resultado + "}";
        });


        get("/esPalindromo/:cadena", (req, res) -> {
            String cadena = req.params(":cadena");
            boolean resultado = esPalindromo(cadena);
            return "{\"resultado\": " + resultado + "}";
        });


        get("/magnitudVector/:x/:y", (req, res) -> {
            double x = Double.parseDouble(req.params(":x"));
            double y = Double.parseDouble(req.params(":y"));
            double magnitud = Math.sqrt(x * x + y * y);
            return "{\"resultado\": " + magnitud + "}";
        });


        get("/cliente", (req, res) -> {
            return "Formulario para llamar a funciones REST asíncronamente";
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }




        private static boolean esPalindromo(String cadena) {

            String invertida = "";

            for (int indice = cadena.length() - 1; indice >= 0; indice--) {
                invertida += cadena.charAt(indice);
            }
            if (cadena == invertida) {
                return true;
            } else {
                return false;
            }
        }
    }


