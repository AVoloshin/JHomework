public class exercises {
    public static void exerc1 (){
        int[] odd = new int[10];
        for (int i=0,j=1; i<10;i++,j+=2){
            odd[i]=j;
            if (i==9){
                System.out.print(odd[i]);
            }else
                System.out.print(odd[i]+",");
        }
    }
    public static void exerc2 (int n){
        int[] nArray = new int [n];
        for (int i=0; i<nArray.length; i++){
            nArray[i]= (int) Math.round((Math.random() * 100));
            System.out.print(nArray[i]+" ");
        }
        int min = nArray[0];
        int minIndex = 0;
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]<min){
                min=nArray[i];
                minIndex=i;
            }
        }
        System.out.println("\n"+minIndex);
        int max = 0;
        int maxIndex = 0;
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]>max){
                max=nArray[i];
                maxIndex =i;
            }
        }
        System.out.println("\n"+maxIndex);
        System.out.println("\nМинимальные значение в массиве:");
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]==min){
                System.out.println(nArray[i]);
            }
        }
        System.out.println("Максмальные значение в массиве:");
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]==max){
                System.out.println(nArray[i]);
            }
        }
        /**int MIN = nArray[minIndex];
        int MAX = nArray[maxIndex];
        nArray[minIndex]=MAX;
        nArray[maxIndex]=MIN;**/
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]==min) {
                nArray[i]=max;
            }else if
                (nArray[i]==max) {
                nArray[i]=min;
            }
        }
        for(int i=0; i<nArray.length;i++){
            System.out.print(nArray[i]+" ");
        }
        int summa= 0;
        for(int i=0; i<nArray.length;i++){
            summa +=nArray[i];
        }
        int med = summa/nArray.length;
        System.out.println("\nСреднее арифметическое массива:"+med);
    }

}
