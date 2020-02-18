package Clases;

public class Persona extends Thread {

    private String nombre;

    public Persona(String nombre) {
        super(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void accion(int i)
    {
        switch(i)
        {
            case 0:
                System.out.println("Comiendo");
                break;
                
            case 1:
                System.out.println("Limpiando");
                break;
                
            case 2:
                System.out.println("Cocinando");
                break;
        }
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            //System.out.println(i + " " + getName());
            System.out.print(getName() + " esta");
            accion(i);
        }
        System.out.println("Termina thread " + getName());
    }
}
