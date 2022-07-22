public class Tema_3 {
    public static void main(String[] args){
        coche miCoche = new coche();
        miCoche.IncPuertas();

        System.out.println(suma(10,20, 30));
        System.out.println(miCoche.puertas);
    }
    public static int suma(int x, int y, int z){
        return x+y+z;
    }
}

class coche{
    public int puertas = 2;

    public void IncPuertas(){
        this.puertas++;
    }
}
