
package degisimkatsayisi;

import java.util.Scanner;


public class DegisimKatsayisi {

   
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int deger;
        System.out.println("Serideki örneklem sayısını giriniz:");
        deger = s.nextInt();
        int[] seri = new int[deger];
        for (int i = 0; i < deger; i++) {
            System.out.println("Serinin "+(i+1)+". "+"elemanını giriniz:");
          seri[i]=s.nextInt();
        }
        float Aort;
        int top = 0;
        int top2=0;

        for (int i = 0; i < deger; i++) {
            top += seri[i];
        }
        Aort = (float) top / (float) deger;
        System.out.println("Serinin aritmetik ortalaması= "+Aort);
        
        for(int j=0;j<deger;j++){
            top2+=(seri[j]-Aort)*(seri[j]-Aort);
        }
        float Sapma=(float) Math.sqrt((float)top2/(float)(deger-1));
        float DK=(float)Sapma/(float)Aort;
        System.out.println("Serinin Degişim Katsayısı= "+DK);
        
        System.out.println(s.nextInt()); 
    }
    
}
