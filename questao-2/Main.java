import java.util.*;

class Retangulo{
    private double largura;
    private double altura;

    public Retangulo(double l, double a){
        this.largura = l;
        this.altura = a;
    }

    public double area(){
        return this.largura*this.altura;
    }

    public double perimetro(){
        return 2*(this.largura + this.altura);
    }
}

class Circulo{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double area(){
        return Math.PI*Math.pow(this.raio, 2);
    }

    public double perimetro(){
        return 2*Math.PI*this.raio;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de forma (C para círculo, R para retângulo):");
        
        String f = sc.next();
        
        if (f.equals("C")){
            System.out.println("Digite o raio");
            double r = sc.nextDouble();
            Circulo c = new Circulo(r);
        }

        if (f.equals("R")){
            System.out.println("Digita largura e altura");
            double l = sc.nextDouble();
            double a = sc.nextDouble();
            Retangulo r = new Retangulo(l, a);

        }
    }
}