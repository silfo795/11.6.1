import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y;
        x=in.nextInt();
        y=in.nextInt();
        switch(x){
            case 1:
                if(y<21)
                    System.out.println("Capricorn");
                else
                    System.out.println("Aquarius");
                break;
            case 2:
                if(y<18)
                    System.out.println("Aquarius");
                else
                    System.out.println("Pisces");
                break;
                case 3:
                if(y<20)
                    System.out.println("Pisces");
                else
                    System.out.println("Aries");
                break;
                case 4:
                if(y<20)
                    System.out.println("Aries");
                else
                    System.out.println("Taurus");
                break;
                case 5:
                if(y<21)
                    System.out.println("Taurus");
                else
                    System.out.println("Gemini");
                break;
                case 6:
                if(y<21)
                    System.out.println("Gemini");
                else
                    System.out.println("Cancer");
                break;
                case 7:
                if(y<22)
                    System.out.println("Cancer");
                else
                    System.out.println("Leo");
                break;
                case 8:
                if(y<23)
                    System.out.println("Leo");
                else
                    System.out.println("Virgo");
                break;
                case 9:
                if(y<23)
                    System.out.println("Virgo");
                else
                    System.out.println("Libra");
                break;
                case 10:
                if(y<23)
                    System.out.println("Libra");
                else
                    System.out.println("Scorpio");
                break;
                case 11:
                if(y<22)
                    System.out.println("Scorpio");
                else
                    System.out.println("Sagittarius");
                break;
            case 12:
                if(y<22)
                    System.out.println("Sagittarius");
                else
                    System.out.println("Capricorn");
                break;



        }
    }
}
