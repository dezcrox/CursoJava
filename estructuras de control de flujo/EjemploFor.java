class EjemploFor{

    public static void main(String args[]){
        //int tabla = 2;
        /**
         * tabla = 2
         * int = 0 
         * i = 1
         * 
         */
        outer: for(int j = 0; j<= 10; j++){
            System.out.println("Imprimiendo la tabla del " +j+ " ");
        inner: for(int i=0; i<=10; i++){
         if(i%2==0){
               break outer;
         }
            System.out.println(j+ "x" + i + "=" +(j*i));
        }
        }
    }

}