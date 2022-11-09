import Objetos.*;

public class main{
    public static void main (String[] args) {
        System.out.println("-----------Círculo-----------");
        circulo circulo = new circulo(6);
        circulo.calcularArea();
        circulo.dibujar();

        System.out.println("-----------Cuadrado-----------");
        cuadrado cuadrado = new cuadrado(10);
        cuadrado.calcularArea();
        cuadrado.dibujar();

        System.out.println("-----------Texto-----------");
        texto texto = new texto("Hola mundo soy Julieth");
        texto.dibujar();

        System.out.println("-------------------Grupo-------------------");
        grupo grupo = new grupo();
        grupo.addObjetos(circulo);
        grupo.addObjetos(cuadrado);
        grupo.dibujar();

        System.out.println("-------------------Hoja-------------------");
        hoja hoja = new hoja("21cm x 29cm");
        hoja.addObjetos(grupo);
        System.out.println(hoja);

        System.out.println("-------------------Documento-------------------");
        documento doc = new documento("Documento de prueba");
        doc.addHojas(hoja);
        System.out.println(doc);
    }
}