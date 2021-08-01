package utp.misiontic2022;

public class NuevoProyecto {
    
//Atributos
private double pMonto;
private double pInteres;
private int pTiempo;
private Double interesSimple;
private Double interesCompuesto;



//Constructores
NuevoProyecto(){
this.pMonto = 0.0;
this.pInteres = 0.0;
this.pTiempo = 0;

}

NuevoProyecto(int pTiempo, double pMonto, double pInteres){
this.pTiempo = pTiempo;
this.pMonto = pMonto;
this.pInteres = pInteres;
}

//Metodos
public double calcularInteresCompuesto(){
this.interesCompuesto = pMonto * (((Math.pow(1+(pInteres/100),pTiempo ))-1));
return Math.round(interesCompuesto);
}

public double calcularInteresSimple(){
this.interesSimple = pMonto * (pInteres/100) * pTiempo;
return Math.round(interesSimple);
}

public double compararInversion(int pTiempo, double pMonto, double pInteres){
    this.pTiempo = pTiempo;
    this.pMonto = pMonto;
    this.pInteres = pInteres;
    this.calcularInteresCompuesto();
    this.calcularInteresSimple();
    double diferencia = interesCompuesto - interesSimple;
    return Math.round(diferencia);
}

public double compararInversion(){
this.calcularInteresCompuesto();
this.calcularInteresSimple();
double diferencia = interesCompuesto - interesSimple;
return Math.round(diferencia);
}

public static void main( String[] args )
{
    
    NuevoProyecto np = new NuevoProyecto();
    System.out.println(np.calcularInteresSimple());
    System.out.println(np.calcularInteresCompuesto());
    System.out.println(np.compararInversion(6,10000000,1.2));

}

}
