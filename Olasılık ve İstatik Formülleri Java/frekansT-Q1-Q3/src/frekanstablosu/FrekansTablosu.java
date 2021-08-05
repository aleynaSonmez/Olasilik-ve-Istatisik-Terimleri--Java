/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frekanstablosu;

import java.util.Scanner;

/**
 *
 * @author Aleyna
 */
public class FrekansTablosu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int n, R;
        double k, h;
         
        System.out.println("n Degerini giriniz:");
        n = s.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". degeri giriniz:");
            dizi[i] = s.nextInt();
        } 
        sirala(dizi);
        R = dizi[n-1] - dizi[0];
        k = Math.ceil(Math.sqrt(n));
        h = Math.ceil(R / k);
        float[] alt_sinirlar = new float[(int)k] ;
        float[] ust_sinirlar = new float[(int)k];
        alt_sinirlar[0] = dizi[0];
        ust_sinirlar[0] = (float) (alt_sinirlar[0] + (h - 1));
        for(int i=1;i<=alt_sinirlar.length-1;i++){
            alt_sinirlar[i]=(float) (alt_sinirlar[i-1]+h);
        }
        for(int i=1;i<alt_sinirlar.length;i++){
            ust_sinirlar[i]=(float) (alt_sinirlar[i]-1+h);
        }
        int[] frekanslar = new int [(int)k];
        for (int i = 0; i < alt_sinirlar.length; i++) {
            int frekans = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j] >=alt_sinirlar[i] && dizi[j] < ust_sinirlar[i]) {
                    frekans++;
                }
            }
            frekanslar[i] = frekans;
        }
        float[] sinif_altsinir = new float[(int)k];
        float[] sinif_ustsinir = new float[(int)k];
        for (int i = 0; i < alt_sinirlar.length; i++) {
            sinif_altsinir[i] = (float) (alt_sinirlar[i] - 0.5);
            sinif_ustsinir[i] = (float) (ust_sinirlar[i] + 0.5);
        }
        float[] sinif_degerler = new float[(int)k];
        for (int i = 0; i < alt_sinirlar.length; i++) {
            sinif_degerler[i] = (sinif_altsinir[i] + sinif_ustsinir[i]) / 2;
        }
        float[] sinif_frekanslar = new float[(int)k];
        
        for(int i=0;i<alt_sinirlar.length;i++){
            int frekanss=0;
            for(int j=0;j<dizi.length;j++){
                if(dizi[j]>=sinif_altsinir[i] && dizi[j]<sinif_ustsinir[i]){
                    frekanss++;
                }
            }
            sinif_frekanslar[i]=frekanss;
        }
        
        float[] sinif_ortanokta=new float[(int)k];
        for(int i=0;i<alt_sinirlar.length;i++){
            sinif_ortanokta[i]=(sinif_altsinir[i]+sinif_ustsinir[i])/2;
        }
        
        float[] sinif_eklenikfrekanslari=new float[(int)k];
        float eklenik_temp=0;
        for(int i=0;i<alt_sinirlar.length;i++){
            eklenik_temp+=sinif_frekanslar[i];
            sinif_eklenikfrekanslari[i]=eklenik_temp;
        }
        
        float[] sinif_oransalfrekans=new float[(int)k];
        for(int i=0;i<alt_sinirlar.length;i++){
            sinif_oransalfrekans[i]=sinif_frekanslar[i]/(float)dizi.length;
        }
        
        float[] sinif_eklenik_oransalfrekans=new float[(int)k];
        for(int i=0;i<alt_sinirlar.length;i++){
            sinif_eklenik_oransalfrekans[i]=sinif_eklenikfrekanslari[i]/(float)dizi.length;
        }
        
        float alt_ceyrek_n= n/alt_sinirlar.length;
        int alt_ceyreklik_sinif = 0;
        for(int i=0;i<alt_sinirlar.length;i++){
            if(sinif_eklenikfrekanslari[i]>=alt_ceyrek_n){
                 alt_ceyreklik_sinif=i;
            break;
        }
          
        }
int alt_ceyreklik_j=0;
if(alt_ceyreklik_sinif>0){
    for(int i=0;i<alt_ceyreklik_sinif;i++){
        alt_ceyreklik_j+=sinif_frekanslar[i];
    }
    
}

alt_ceyreklik_j=(int) (alt_ceyrek_n - alt_ceyreklik_j);
float alt_ceyreklik_fq=sinif_frekanslar[alt_ceyreklik_sinif];
float alt_ceyreklik_alt_sinir=sinif_altsinir[alt_ceyreklik_sinif];
float alt_ceyreklik=(float) (alt_ceyreklik_alt_sinir +((alt_ceyreklik_j*h)/alt_ceyreklik_fq));
float ust_ceyreklik_n=3*alt_ceyrek_n;
int ust_ceyreklik_sinif=0;
for(int i=0;i<alt_sinirlar.length;i++){
    if(sinif_eklenikfrekanslari[i]>=ust_ceyreklik_n){
     ust_ceyreklik_sinif=i;
     break;
    }
}
float ust_ceyreklik_j=0;
if(ust_ceyreklik_sinif>0){
    for(int i=0;i<ust_ceyreklik_sinif;i++){
        ust_ceyreklik_j+=sinif_frekanslar[i];
    }
}
    ust_ceyreklik_j=ust_ceyreklik_n - ust_ceyreklik_j;
float ust_ceyreklik_fq = sinif_frekanslar[ust_ceyreklik_sinif];  
float ust_ceyreklik_alt_sinir =sinif_altsinir[ust_ceyreklik_sinif];
float ust_ceyreklik=(float) ((float) ust_ceyreklik_alt_sinir + ((ust_ceyreklik_j*h)/ust_ceyreklik_fq));

for(int i=0;i<alt_sinirlar.length;i++){
    System.out.println((alt_sinirlar[i]) + " - " + (ust_sinirlar[i]) + "\t\t" + (frekanslar[i]) + "\t" + (sinif_altsinir[i]) + " - " + (sinif_ustsinir[i]) + "\t\t" + (sinif_frekanslar[i]) + "\t    " + (sinif_ortanokta[i]) + "\t  " + (sinif_eklenikfrekanslari[i]) + "\t  " + (sinif_oransalfrekans[i]) + "\t  " + (sinif_eklenik_oransalfrekans[i]));
 
    
}
   System.out.println("\n\n");
System.out.println("Alt Ceyreklik(Q1)="+alt_ceyreklik);
    System.out.println("Ust Ceyreklik(Q3)="+ust_ceyreklik);
    System.out.println(s.nextInt());

    }
    public static void sirala(int a[]){
int tut;
for(int i=1;i<a.length;i++){
    for(int j=1;j<a.length;j++){
        if(a[j]<a[j-1]){
            tut=a[j];
            a[j]=a[j-1];
            a[j-1]=tut;
        }
    }
}

}

    }
    
