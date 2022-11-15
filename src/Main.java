import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number , total=0, avarage=0 , counter=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number=input.nextInt();



        for(int i=1; i<=number; i++){
            if(i%3==0 && i%4==0){
                total += i;
                counter++;
            }
            if(counter==0)
                counter=1;
        }

        double average = total / counter;
        if(total != 0){
            System.out.println("Ortalama : "+average);
        }else if (counter ==1)
            System.out.println(number + " sayisina kadar 3 ve 4'e bölünebilen sayı yoktur!");
    }
}