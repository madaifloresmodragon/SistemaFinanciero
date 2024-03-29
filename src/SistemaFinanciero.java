import java.util.Arrays;

public class SistemaFinanciero {
    private double[] beneficios;
    private double[] beneIntervalo;
    private int[] frecuencia;
    private double minBeneficio;
    private double maxBeneficio;
    private double media;
    private double varianza;
    private double desviacion;
    
    private int indiceMax;
    private int indiceMin;
    
    private double [] arrIngresos;
    private double [] arrGastos;
    private double [] arrCostesVariables;
    private double [] arrPrecio;
    private double [] arrCostesFijos;
    private double [] arrCosteUnitario;      
    private double [] arrCantidadVendida;            
            
    public void simular(int numIteraciones) {
        beneficios = new double[numIteraciones]; // Array para almacenar los beneficios de cada iteración
        arrIngresos =new double[numIteraciones];
        arrGastos=new double[numIteraciones];
        arrCostesVariables=new double[numIteraciones];
        arrPrecio=new double[numIteraciones];
        arrCostesFijos=new double[numIteraciones];
        arrCosteUnitario=new double[numIteraciones];
        arrCantidadVendida=new double[numIteraciones];
        
        //Generar beneficios
        for (int i = 0; i < numIteraciones; i++) {
            // Generar valores aleatorios para las variables
            double precio = distribucionNormal(100,20);
            double costesFijos = distribucionUniforme(120000,160000);
            double costeUnitario = distribucionTriangular();
            double cantidadVendida = distribucionLognormal(10000,1.2);
            //double cantidadVendida = Math.exp(rand.nextGaussian() * 1.2 + Math.log(10000));
            
            // Calcular ingresos y gastos
            double ingresos = Math.round((precio * cantidadVendida) * 100.0) / 100.0;
            double costesVariables = Math.round((costeUnitario * cantidadVendida) * 100.0) / 100.0;
            double gastos = Math.round((costesFijos + costesVariables) * 100.0) / 100.0;

            // Calcular beneficio
            double beneficio = Math.round((ingresos - gastos) * 100.0)/100.0;
            
            //Ingresar valores a los arreglos
            beneficios[i] = beneficio;
            arrIngresos[i] = ingresos;
            arrGastos[i] = gastos;
            arrCostesVariables[i] = costesVariables;
            arrPrecio[i] = precio;
            arrCostesFijos[i] = costesFijos;
            arrCosteUnitario[i] = costeUnitario;
            arrCantidadVendida[i] = cantidadVendida;
            
        }
        
        /*// Mostrar los beneficios obtenidos en cada iteración
        for (int i = 0; i < numIteraciones; i++) {
            System.out.println("Iteracion " + (i + 1) + ": Beneficio = " + beneficios[i] + " Precio = " + arrPrecio[i] + " CosF = "+ arrCostesFijos[i] + " CosU = " + arrCosteUnitario[i]+" CantV = " + arrCantidadVendida[i]);
        }*/
        for(int i = 0; i< numIteraciones;i++){
            System.out.println("Iteracion " + (i + 1) + ": Coste unitario = " + arrCosteUnitario[i]);
        }

        
        // Calcular la variación máxima y mínima de los beneficios
        minBeneficio = (Arrays.stream(beneficios).min().orElse(0))-0.0000000001;
        maxBeneficio = (Arrays.stream(beneficios).max().orElse(0))+0.0000000001;
        
        // Buscamos el indice del maximo beneficio
        for(int i = 0; i< beneficios.length; i++){
            if(beneficios[i]==maxBeneficio){
                indiceMax = i;
            }
        }
        
        // Buscamos el indice del minimo beneficio
        for(int i = 1; i< beneficios.length; i++){
            if(beneficios[i]==minBeneficio){
                indiceMin = i;
            }
        }
        

        //Creamos los dos arrays
        beneIntervalo = new double[100];
        frecuencia = new int[100];
        
        //Llenamos el arreglo de beneficios segun el intervalo
        beneIntervalo[0]= minBeneficio;
        for(int i = 1; i < beneIntervalo.length; i++){
            beneIntervalo[i] = beneIntervalo[i-1] + (maxBeneficio - (minBeneficio))/beneIntervalo.length;
        }
           
        //Calculamos valor de la frecuencia
        for(int a = 0,b = 1; b < beneIntervalo.length;b++,a++){
            int contador = 0;
            for(int i = 0; i < beneficios.length;i++){
                if((beneIntervalo[a] < beneficios[i])&&(beneficios[i]<= beneIntervalo[b])){
                    contador ++;
                }
            }
            frecuencia[b] = contador;
        }   
        
        //Calculamos media
        double suma = 0;
        for(double i: beneficios){
            suma = suma+i;
        }
        media = suma / beneficios.length;
        
        //Calculo de la varianza
        double sumatoria;
        for(int i=0; i< beneficios.length;i++){
            sumatoria = Math.pow(beneficios[i] - media,2);
            varianza = varianza + sumatoria;
        }
        varianza = varianza / (beneficios.length-1);
        
        //Calculo de la desviacion tipica o estandar
        desviacion = Math.sqrt(varianza);
          
    }
    
    private static double distribucionNormal(double med,double desv){
        double z = doceUniformes();
        double varAleatoria = med + desv*z;
        return varAleatoria;
    }
    private static double doceUniformes(){
        double sumaNumAleatorios = 0;
        for(int i = 0; i < 12; i++){
            sumaNumAleatorios += Math.random();
        }
        return sumaNumAleatorios - 6;
    }
    
    private static double distribucionUniforme(double a, double b){
        double u = Math.random();
        return a + u*(b-a);
    }
    private static double distribucionTriangular(){
        double r = Math.random();
        double x = 0;
        if(r<0.5){
            x = 50 + Math.sqrt(200*r);
        }else{
            x = 70 - Math.sqrt(200*(1-r));
        }
        return x;
    }
    private static double distribucionLognormal(double med, double desv){
        double m = Math.log(med);
        double sigma = Math.log(desv);
        double z = doceUniformes();
        return Math.exp(m + sigma * z);
    } 
    
    public double[] getBeneficios() {
        return beneficios;
    }

    public double[] getBeneIntervalo() {
        return beneIntervalo;
    }

    public int[] getFrecuencia() {
        return frecuencia;
    }
    public double getMinBeneficio() {
        return minBeneficio;
    }

    public double getMaxBeneficio() {
        return maxBeneficio;
    }

    public double getMedia() {
        return media;
    }
    
    public double getDesviacion(){
        return desviacion;
    }

    public int getIndiceMin() {
        return indiceMin;
    }
    public int getIndiceMax() {
        return indiceMax;
    }
    public double[] getArrIngresos() {
        return arrIngresos;
    }
    public double[] getArrGastos() {
        return arrGastos;
    }
    public double[] getArrCostesVariables() {
        return arrCostesVariables;
    }
    public double[] getArrPrecio() {
        return arrPrecio;
    }
    public double[] getArrCostesFijos() {
        return arrCostesFijos;
    }
    public double[] getArrCosteUnitario() {
        return arrCosteUnitario;
    }
    public double[] getArrCantidadVendida() {
        return arrCantidadVendida;
    }
    
}

