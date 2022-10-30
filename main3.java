import java.util.Scanner;

public class main3 {

    public static void main(String[] args ){

        double mat, fizik,turkce,muzik, kimya;

        Scanner gir = new Scanner(System.in);

        System.out.print("matematik notunu giriniz :");

        mat = gir.nextDouble();

        if(mat>=0&&mat<55){
            System.out.println("matemetik dersinden kaldi");
        }
        else if(mat==55||mat<=100){
            System.out.println("matematik dersinden gecti");

            }
        else if(mat<0||mat>100){
            System.out.println("girdiginiz not gecersizdir");}

        System.out.print("fizik notunu giriniz :");

        fizik = gir.nextDouble();

        if(fizik>=0&&fizik<55){
            System.out.println("fizik dersinden kaldi");
        }
        else if(fizik==55||fizik<=100){
            System.out.println("fizik dersinden gecti");

        }
        else if(fizik<0||fizik>100){
            System.out.println("girdiginiz not gecersizdir");}
        System.out.print("turkce notunu giriniz :");

        turkce = gir.nextDouble();

        if(turkce>=0&&turkce<55){
            System.out.println("turkce dersinden kaldi");
        }
        else if(turkce==55||turkce<=100){
            System.out.println("turkce dersinden gecti");

        }
        else if(turkce<0||turkce>100){
            System.out.println("girdiginiz not gecersizdir");}

        System.out.print("muzik notunu giriniz :");

        muzik = gir.nextDouble();

        if(muzik>=0&&muzik<55){
            System.out.println("muzik dersinden kaldi");
        }
        else if(muzik==55||muzik<=100){
            System.out.println("muzik dersinden gecti");

        }
        else if(muzik<0||muzik>100){
            System.out.println("girdiginiz not gecersizdir");}
        System.out.print("kimya notunu giriniz :");

        kimya = gir.nextDouble();

        if(kimya>=0&&kimya<55){
            System.out.println("kimya dersinden kaldi");
        }
        else if(kimya==55||kimya<=100){
            System.out.println("kimya dersinden gecti");

        }
        else if(kimya<0||kimya>100){
            System.out.println("girdiginiz not gecersizdir");}








    }
}
