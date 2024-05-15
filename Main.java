public class Main {
    public static void main(String[] args) {
        Shape retangulo = new Retangulo(5, 10);
        System.out.println(retangulo.getName());
        System.out.println(retangulo.calculateArea());
        System.out.println(retangulo.calculatePerimeter());

        Shape circulo = new Circulo(5);
        System.out.println(circulo.getName());
        System.out.println(circulo.calculateArea());
        System.out.println(circulo.calculatePerimeter());

        Shape losango = new Losango(6, 8);
        System.out.println(losango.getName());
        System.out.println(losango.calculateArea());
        System.out.println(losango.calculatePerimeter());

        Shape hexagono = new Hexagono(6);
        System.out.println(hexagono.getName());
        System.out.println(hexagono.calculateArea());
        System.out.println(hexagono.calculatePerimeter());

        Shape pentagono = new Pentagono(7);
        System.out.println(pentagono.getName());
        System.out.println(pentagono.calculateArea());
        System.out.println(pentagono.calculatePerimeter());
    }
}