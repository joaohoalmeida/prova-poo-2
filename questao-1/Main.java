import java.util.*;

class Assalariado{

    private String nome;
    private double salarioBase;
    
    public Assalariado(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return this.salarioBase;
    }

    public String toString(){
        return "Funcionario[nome=" + this.nome + ", " + "salarioFinal= " + calcularSalario() + "]"; 
    }
}

class Comissionado{

    private String nome;
    private double salarioBase;
    private int vendas;

    public Comissionado(String nome, double salarioBase, int vendas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.vendas = vendas;
    }

    public Comissionado(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.vendas = 0;
    }

    public double calcularSalario(){
        return this.salarioBase + this.vendas*0.10;
    }

    public String toString(){
        return "Funcionario[nome=" + this.nome + ", " + "salarioFinal= " + calcularSalario() + "]"; 
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Assalariado> assalariado = new ArrayList();
        ArrayList<Comissionado> comissionado = new ArrayList();

        Assalariado funcionario_1 = new Assalariado("João", 3000);
        Assalariado funcionario_2 = new Assalariado("Braulio", 3500);
        Comissionado funcionario_3 = new Comissionado("Lucena", 5000, 100);

        assalariado.add(funcionario_1);
        assalariado.add(funcionario_2);
        comissionado.add(funcionario_3);

        System.out.println(assalariado.get(1));
        System.out.println(comissionado.get(0));
    }
}