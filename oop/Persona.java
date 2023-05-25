//definicion de la clase
class Persona {
    //atributos - caracteristicas
    String nombre;
    int edad;
    char genero;

    //metodos - acciones
    void imprimirInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad "+edad);
        System.out.println("Genero "+genero);
    }

    public static void main(String args[]){
        Persona p=new Persona();
        p.nombre = "Alex";
        p.edad = 32;
        p.genero = 'M';
        p.imprimirInformacion();

        Persona p1=new Persona();
        p1.nombre="Juan";
        p1.edad=51;
        p1.genero='M';
        p1.imprimirInformacion();
    }

}