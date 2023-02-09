import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner updown = new Scanner(System.in);
    int num = 0;
    while(true){
    System.out.println("m for more stars, f for less");
    String resp = updown.nextLine();
      if (resp.equals("f") && num != 1 && num != 0){
        num -= 1;
        System.out.print("\033[H\033[2J");
        System.out.flush();   
        System.out.println("Number of stars: "+ num + "\n");
        if (num == 1){
          e(1,1);
        }
        if (num == 2){
          p(1,2);
        }
        if (num == 3){
          e(1,2);
        }
        if (num == 4){
          q(2,2);
        }
        if (num == 5){
          p(2,2);
        }
        if (num == 6){
          e(2,2);
        }
        if (num == 7){
          e(1,4);
        }
        if (num == 8){
          p(2,3);
        }
        if (num == 9){
          q(3,3);
        }
        if (num == 10){
          e(2,3);
        }
        if (num == 11){
          p(2,4);
        }
        if (num == 12){
          q(3,4);
        }
        if (num == 13){
          p(3,3);
        }
        if (num == 14){
          e(2,4);
        }
        if (num == 15){
          e(3,3);
        }
        if (num == 16){
          q(4,4);
        }
        if (num == 17){
          r(3,3);
        }
        if (num == 18){
          p(3,4);
        }
        if (num == 19){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 20){
          q(4,5);
        }
        if (num == 21){
          e(3,4);
        }
        if (num == 22){
          r(2,5);
        }
        if (num == 23){
          p(3,5);
        }
        if (num == 24){
          r(3,4);
        }
        if (num == 25){
          q(5,5);
        }
        if (num == 26){
          e(2,7);
        }
        if (num == 27){
          e(3,5);
        }
        if (num == 28){
          e(4,4);
        }
        if (num == 29){
          p(2,10);
        }
        if (num == 30){
          q(5,6);
        }
        if (num == 31){
          r(4,4);
        }
        if (num == 32){
          p(4,5);
        }
        if (num == 33){
          e(3,6);
        }
        if (num == 34){
          e(2,9);
        }
        if (num == 35){
          q(5,7);
        }
        if (num == 36){
          q(6,6);
        }
        if (num == 37){
          r(2,8);
        }
        if (num == 38){
          r(3,6);
        }
        if (num == 39){
          p(4,6);
        }
        if (num == 40){
          r(4,5);
        }
        if (num == 41){
          p(5,5);
        }
        if (num == 42){
          q(6,7);
        }
        if (num == 43){
          p(3,9);
        }
        if (num == 44){
          e(4,6);
        }
        if (num == 45){
          e(5,5);
        }
        if (num == 46){
          p(4,7);
        }
        if (num == 47){
          r(2,10);
        }
        if (num == 48){
          q(6,8);
        }
        if (num == 49){
          q(7,7);
        }
        if (num == 50){
          p(5,6);
        }
        if (num == 51){
          e(3,9);
        }
        if (num == 52){
          e(4,7);
        }
        if (num == 53){
          p(4,8);
        }
        if (num == 54){
          q(6,9);
        }
        if (num == 55){
          e(5,6);
        }
        if (num == 56){
          q(7,8);
        }
        if (num == 57){
          e(3,10);
        }
        if (num == 58){
          r(4,7);
        }
        if (num == 59){
          p(5,7);
        }
        if (num == 60){
          r(5,6);
        }
        if (num == 61){
          p(6,6);
        }
        if (num == 62){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 63){
          q(7,9);
        }
        if (num == 64){
          q(8,8);
        }
        if (num == 65){
          e(5,7);
        }
        if (num == 66){
          e(6,6);
        }
        if (num == 67){
          r(4,8);
        }
        if (num == 68){
          p(5,8);
        }
        if (num == 69){
          e(3,12);
        }
        if (num == 70){
          q(7,10);
        }
        if (num == 71){
          r(6,6);
        }
        if (num == 72){
          q(8,9);
        }
        if (num == 73){
          r(3,11);
        }
        if (num == 74){
          p(4,11);
        }
        if (num == 75){
          e(5,8);
        }
        if (num == 76){
          r(4,9);
        }
        if (num == 77){
          p(5,9);
        }
        if (num == 78){
          e(6,7);
        }
        if (num == 79){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 80){
          q(8,10);
        }
        if (num == 81){
          q(9,9);
        }
        if (num == 82){
          r(5,8);
        }
        if (num == 83){
          p(6,8);
        }
        if (num == 84){
          r(6,7);
        }
        if (num == 85){
          p(7,7);
        }
        if (num == 86){
          p(5,10);
        }
        if (num == 87){
          r(3,13);
        }
        if (num == 88){
          q(8,11);
        }
        if (num == 89){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 90){
          q(9,10);
        }
        if (num == 91){
          e(7,7);
        }
        if (num == 92){
          e(4,12);
        }
        if (num == 93){
          r(5,9);
        }
        if (num == 94){
          p(6,9);
        }
        if (num == 95){
          e(5,10);
        }
        if (num == 96){
          q(8,12);
        }
        if (num == 97){
          r(7,7);
        }
        if (num == 98){
          p(7,8);
        }
        if (num == 99){
          q(9,11);
        }
        if (num == 100){
          q(10,10);
        }
      }
    else if (resp.equals("m") && num != 100){
      num += 1;
      System.out.print("\033[H\033[2J");
      System.out.flush();   
      System.out.println("Number of stars: "+ num + "\n");
        if (num == 1){
          e(1,1);
        }
        if (num == 2){
          p(1,2);
        }
        if (num == 3){
          e(1,2);
        }
        if (num == 4){
          q(2,2);
        }
        if (num == 5){
          p(2,2);
        }
        if (num == 6){
          e(2,2);
        }
        if (num == 7){
          e(1,4);
        }
        if (num == 8){
          p(2,3);
        }
        if (num == 9){
          q(3,3);
        }
        if (num == 10){
          e(2,3);
        }
        if (num == 11){
          p(2,4);
        }
        if (num == 12){
          q(3,4);
        }
        if (num == 13){
          p(3,3);
        }
        if (num == 14){
          e(2,4);
        }
        if (num == 15){
          e(3,3);
        }
        if (num == 16){
          q(4,4);
        }
        if (num == 17){
          r(3,3);
        }
        if (num == 18){
          p(3,4);
        }
        if (num == 19){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 20){
          q(4,5);
        }
        if (num == 21){
          e(3,4);
        }
        if (num == 22){
          r(2,5);
        }
        if (num == 23){
          p(3,5);
        }
        if (num == 24){
          r(3,4);
        }
        if (num == 25){
          q(5,5);
        }
        if (num == 26){
          e(2,7);
        }
        if (num == 27){
          e(3,5);
        }
        if (num == 28){
          e(4,4);
        }
        if (num == 29){
          p(2,10);
        }
        if (num == 30){
          q(5,6);
        }
        if (num == 31){
          r(4,4);
        }
        if (num == 32){
          p(4,5);
        }
        if (num == 33){
          e(3,6);
        }
        if (num == 34){
          e(2,9);
        }
        if (num == 35){
          q(5,7);
        }
        if (num == 36){
          q(6,6);
        }
        if (num == 37){
          r(2,8);
        }
        if (num == 38){
          r(3,6);
        }
        if (num == 39){
          p(4,6);
        }
        if (num == 40){
          r(4,5);
        }
        if (num == 41){
          p(5,5);
        }
        if (num == 42){
          q(6,7);
        }
        if (num == 43){
          p(3,9);
        }
        if (num == 44){
          e(4,6);
        }
        if (num == 45){
          e(5,5);
        }
        if (num == 46){
          p(4,7);
        }
        if (num == 47){
          r(2,10);
        }
        if (num == 48){
          q(6,8);
        }
        if (num == 49){
          q(7,7);
        }
        if (num == 50){
          p(5,6);
        }
        if (num == 51){
          e(3,9);
        }
        if (num == 52){
          e(4,7);
        }
        if (num == 53){
          p(4,8);
        }
        if (num == 54){
          q(6,9);
        }
        if (num == 55){
          e(5,6);
        }
        if (num == 56){
          q(7,8);
        }
        if (num == 57){
          e(3,10);
        }
        if (num == 58){
          r(4,7);
        }
        if (num == 59){
          p(5,7);
        }
        if (num == 60){
          r(5,6);
        }
        if (num == 61){
          p(6,6);
        }
        if (num == 62){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 63){
          q(7,9);
        }
        if (num == 64){
          q(8,8);
        }
        if (num == 65){
          e(5,7);
        }
        if (num == 66){
          e(6,6);
        }
        if (num == 67){
          r(4,8);
        }
        if (num == 68){
          p(5,8);
        }
        if (num == 69){
          e(3,12);
        }
        if (num == 70){
          q(7,10);
        }
        if (num == 71){
          r(6,6);
        }
        if (num == 72){
          q(8,9);
        }
        if (num == 73){
          r(3,11);
        }
        if (num == 74){
          p(4,11);
        }
        if (num == 75){
          e(5,8);
        }
        if (num == 76){
          r(4,9);
        }
        if (num == 77){
          p(5,9);
        }
        if (num == 78){
          e(6,7);
        }
        if (num == 79){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 80){
          q(8,10);
        }
        if (num == 81){
          q(9,9);
        }
        if (num == 82){
          r(5,8);
        }
        if (num == 83){
          p(6,8);
        }
        if (num == 84){
          r(6,7);
        }
        if (num == 85){
          p(7,7);
        }
        if (num == 86){
          p(5,10);
        }
        if (num == 87){
          r(3,13);
        }
        if (num == 88){
          q(8,11);
        }
        if (num == 89){
          System.out.println("Cannot return appealing flag");
        }
        if (num == 90){
          q(9,10);
        }
        if (num == 91){
          e(7,7);
        }
        if (num == 92){
          e(4,12);
        }
        if (num == 93){
          r(5,9);
        }
        if (num == 94){
          p(6,9);
        }
        if (num == 95){
          e(5,10);
        }
        if (num == 96){
          q(8,12);
        }
        if (num == 97){
          r(7,7);
        }
        if (num == 98){
          p(7,8);
        }
        if (num == 99){
          q(9,11);
        }
        if (num == 100){
          q(10,10);
        }
      }
    }
  }

  public static String q(int h, int w){
    String flag = "";
    int i = 0;
    while (i < h){
      for (int j = 0; j < w; j++){
        flag = flag + "* ";
      }
      flag = flag + "\n";
      i += 1;
    }
    System.out.println(flag);
    return flag;
  }
  
  public static String e(int h, int w){
    String flag = "";
    int i = 0;
    while (i < h){
      for (int j = 0; j < w; j++){
        flag = flag + "* ";
      }
      flag = flag + "\n";
      for (int j = 0; j < w-1; j++){
        flag = flag + " *";
      }
      flag = flag + "\n";
      i += 1;
    }
    System.out.println(flag);
    return flag;
  }

  public static String p(int h, int w){
    String flag = "";
    int i = 0;
    while (i < h){
      for (int j = 0; j < w; j++){
        flag = flag + "* ";
      }
      flag = flag + "\n";
      if (i < h-1){
        for (int j = 0; j < w-1; j++){
          flag = flag + " *";
        }
      }
      flag = flag + "\n";
      i += 1;
    }
    System.out.println(flag);
    return flag;
  }

  public static String r(int h, int w){
    String flag = "";
    int i = 0;
    while (i < h+1){
      for (int j = 0; j < w-1; j++){
        flag = flag + " *";
      }
      flag = flag + "\n";
      if (i < h){
        for (int j = 0; j < w; j++){
          flag = flag + "* ";
        }
      }
      flag = flag + "\n";
      i += 1;
    }
    System.out.println(flag);
    return flag;
  }
  
  
}