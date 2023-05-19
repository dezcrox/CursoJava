class EjemploIf{

public static void main(String args[]){
 int edad = 16;
 boolean puedenEntrar = edad >= 18;
 if(puedenEntrar){
    System.out.println("Puedes ingresar al lugar");
 }else if(edad <= 15){
    System.out.println("Llamar a sus padres y no permitir entrar");
 }else{
    System.out.println("Solo se permiten mayores de edad");
 }

}
}