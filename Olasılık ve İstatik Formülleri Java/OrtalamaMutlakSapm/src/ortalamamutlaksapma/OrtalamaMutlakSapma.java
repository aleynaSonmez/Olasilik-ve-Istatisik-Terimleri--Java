
package ortalamamutlaksapma;

import java.util.Scanner;


public class OrtalamaMutlakSapma {

   
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        float deger;
        System.out.println("Serideki örneklem sayısını giriniz:");
        deger = s.nextInt();
        float[] seri = new int[deger];
        float[] dizi =new int[deger];
        for (int i = 0; i < deger; i++) {
            System.out.println("Serinin "+(i+1)+". "+"elemanını giriniz:");
          seri[i]=s.nextInt();
        }
        float Aort;
        float top=0;
        for(int i=0;i<deger;i++){
            top+=seri[i];
        }
        Aort=(float)top/(float)deger;
        System.out.println("Serinin aritmetik ortalaması="+Aort);
        
        for(int j=0;j<deger;j++){ //Aritmetik ortalama ve serideki sayıların pozitif farklarını hesaplayan blok
            if(seri[j]<Aort){
                dizi[j]=(int) (Aort-seri[j]);
            }
            else{
                dizi[j]=(int)(seri[j]-Aort);
            }
        }
        float diziTop=0;
        for(int k=0;k<deger;k++){
            diziTop+=dizi[k];
        }
        float OMS=(float)diziTop/(float)deger;
        System.out.println("Girilen serinin ortalama mutlak sapması="+OMS);
        
System.out.println(s.nextInt());
    }
    
}
