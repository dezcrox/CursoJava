class IncrementoDecremento{

    public static void main(String args[]){
        //Incremento y preincremento
        int count = 0;
        count++;
        count++;

        //preincremento
        System.out.println(++count);


        count = 10;
        count --;
        count --;

        //predecremento
        System.out.println(--count + " Estoy en esta parte");

        //atajos de asignacion
        //count=count-5;
        System.out.println("Que valor tiene aqui "+count);
        //count-=5;
        //count*=5;
        count+=10;
        System.out.println("Que valor tiene ahora "+count);
    }
    
}