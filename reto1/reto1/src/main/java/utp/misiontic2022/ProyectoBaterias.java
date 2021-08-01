package utp.misiontic2022;

public class ProyectoBaterias {

//Atributos
    private int tiempo;
    private double capital;
    private double interes;
    private Double interesSimple;
    private Double interesCompuesto;
    private Double compararInteres;

// Constructor
ProyectoBaterias(){
    this.tiempo = 0;
    this.capital = 0.0;
    this.interes = 0.0;
}

public ProyectoBaterias(int tiempo, double capital, double interes) {
    this.tiempo = tiempo;
    this.capital = capital;
    this.interes = interes;
   
}

public double calcInteresSimple() {
    this.interesSimple = capital * (interes/100) * tiempo;
    return Math.round(interesSimple);
}

public double calcInteresCompuesto() {
    this.interesCompuesto = capital * ((Math.pow(1+(interes/100),tiempo ))-1);
    return Math.round(interesCompuesto);
}

public double comparar() {
    this.compararInteres = this.calcInteresCompuesto() - this.calcInteresSimple();
    return Math.round(compararInteres);
}

public static void main( String[] args )
{
    ProyectoBaterias prueba1 = new ProyectoBaterias(2, 10000000, 6);
    System.out.println(prueba1.calcInteresSimple());
    System.out.println(prueba1.calcInteresCompuesto());
    System.out.println(prueba1.comparar());

}

}
