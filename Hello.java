/*public class Hello {
    import java.util.Scanner;

  class Hello {
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      System.out.print("������:");
      int x = stdIn.nextInt();
      System.out.println("������ �ڸ����� ������ ����" + (x / 10)+ "�Դϴ�.");
      System.out.println("������ �ڸ�����" + (x % 10)+ "�Դϴ�.");
  }
  }
  import java.util.Scanner;
  
  public class Hello {
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      System.out.println("�̸��� �Է��ϼ���");
      String a = stdIn.next();
      System.out.println(a);
  }
  }
  import java.util.Random;
  
  public class Hello {
    public static void main(String[] args) {
      Random stdIn = new Random();
      int a = stdIn.nextInt();
      System.out.println(a);
      System.out.println(stdIn.nextBoolean());
      System.out.println(stdIn.nextDouble());
      System.out.println(stdIn.nextInt(2)+1);
    }
  }
  import java.util.Random;
  import java.util.Scanner;7

  class RandomPlusMinus5 {
    public static void main(String[] args) {
      Random rand = new Random();
      Scanner stdIn = new Scanner(System.in);

      System.out.print("������:");
      int x = stdIn.nextInt();

      System.out.println("�Է� ���� ��5 ������ ������ �����߽��ϴ�.");
      System.out.println("����"+(x-5 + rand.nextInt(11))+"�Դϴ�.");
    }
  }
  public class Hello {
    public static void main(String[] args) {
      int i = 97;
      String s = "JAVA";
      double f = 3.14f;
      System.out.printf("%d\n",i);//%n�� ����
      System.out.printf("%o\n",i);//%o�� 8����
      System.out.printf("%x\n",i);//%x�� 16����
      System.out.printf("%c\n",i);//%c�� ����
      System.out.printf("%5d\n",i);//%5d�� 5�ڸ��� ���ڸ� ����
      System.out.printf("%05d\n",i);//%05d 5�ڸ��� ���ڸ� 0����
      System.out.printf("%s\n",s);//%s�� ����
      System.out.printf("%5s\n",s);//%5s�� 5�ڸ��� ���ڸ� ����
      System.out.printf("%-5s\n",s);//%-5s�� 5�ڸ��� ���ڸ� ����ó�� ���� ����
      System.out.printf("%f\n",f);//%f�� 10���� �Ǽ�
      System.out.printf("%e\n",f);//%e�� ����
      System.out.printf("%4.1f\n",f);//%4.qf�� �Ҽ��� ���� 1�ڸ�
      System.out.printf("%04.1f\n",f);//%04.qf�� �Ҽ��� ���� 1�ڸ�, ���ڸ� 0
      System.out.printf("%-4.1f\n",f);//%-4.qf�� �Ҽ��� ���� 1�ڸ�, ���� ����
    }
  }
  public class Hello {
    public static void main(String[] args) {
      int a = 10;
      //int b = 20;
      //int c = 0;
      //c = b / a;
      System.out.println(a);
      System.out.println(++a);
      System.out.println(a++);
    }
  }*/
  //import java.util.Random;
  // import java.util.Scanner;

  // public class Hello {
  // public static void main(String[] args) {
      /*int a = 10;
      int b = 5;
      System.out.println(a+=b);
      a = 10;
      b = 5;
      System.out.println(a=a+b);
      a = 10;
      b = 5;
      System.out.println(a-=b);
      a = 10;
      b = 5;
      System.out.println(a=a-b);
      int x = 63;
      int y = 18;
      int c = (x+y)/2;
      System.out.println("�հ��"+ (x+y) +"�Դϴ�.");
      System.out.println("�����"+ (c) +"�Դϴ�.");

      double x = 6.5;
      double y = 3.5;
      double c = (x*y)/2;
      System.out.printf("���̴�"+ (c) +"�Դϴ�.");

      double x = 12.5;
      double PI = 3.1416;
      double a = 4 * PI * x * x;
      double b = 4 / 3 * PI * x * x * x;
      System.out.printf("�ѳ��̴�"+ (a) +"�Դϴ�.");
      System.out.printf("���Ǵ�"+ (b) +"�Դϴ�.");

      Random stdIn = new Random();
      int a,b,c = stdIn.nextInt();
      a = (int)(Math.random()*9)+1;
      b = (int)(Math.random()*-9)-1;
      c = (int)(Math.random()*99)+10;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      
      Scanner stdIn = new Scanner(System.in);
      System.out.print("a:");
      int a = stdIn.nextInt();
      System.out.print("b:");
      int b = stdIn.nextInt();
      if(a>b){
      System.out.println("1 ����ö");}
      else{System.out.println("2 ����ö");}

    Scanner stdIn = new Scanner(System.in);
    Random x = new Random();
    System.out.print("a:");
    int a = stdIn.nextInt();
    int b = (int)(Math.random()*100)+1;
    System.out.println("b:" + b);
    /*if(a < b) {System.out.println("�����Լ� ���ڰ� Ŀ��");}
    else{System.out.println("���� ���� ���ڰ� Ŀ��");}

    if(a < b) {System.out.printf("�����Լ� %d ��ŭ Ŀ��", b-a);}
    else{System.out.printf("���� ���� ���� %d ��ŭ Ŀ��", a-b );}

    int a = 1;
    int b = 2;
    int c = 3;
    if(c==1){
      System.out.println("a�� 1 �Դϴ�");
    }
    else if(c==2){
      System.out.println("b�� 2�Դϴ�");
    }
    else if(c==3){
      System.out.println("c�� 3�Դϴ�");
    }
    else{
      System.out.println("��� ���� �ʾƿ�");
    }
    int a = 93;
    if(a>=90){
      System.out.println("if���� ���̸� ����.");
      if(a>=96){
        System.out.println("A+");}
        else{
        System.out.println("2��° if d����");}
      }
    else{
      System.out.println("A0 OR A-");

    Scanner stdIn = new Scanner(System.in);
    System.out.print("ù ��й�ȣ�� �Է��ϼ���");
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    int d = stdIn.nextInt();
    System.out.print("���� ��й�ȣ�� �Է��ϼ���");
    int a1 = stdIn.nextInt();
    int b2 = stdIn.nextInt();
    int c3 = stdIn.nextInt();
    int d4 = stdIn.nextInt();
    if(a==a1){
      if(b==b2){
        if(c==c3){
          if(d==d4){
            System.out.println("��й�ȣ�� ��ġ�մϴ�. ����帱�Կ�");
          }else{
            System.out.println("4��° ��й�ȣ�� Ʋ����");
          }
        }else{
          System.out.println("3��° ��й�ȣ�� Ʋ����");
        }
      }else{
        System.out.println("2��° ��й�ȣ�� Ʋ����");
    }}
    else{
    System.out.println("1��° ��й�ȣ�� Ʋ����");
    }

  Scanner stdIn = new Scanner(System.in);
  System.out.print("��ȣ�� �Է��ϼ���\n");
  int a = stdIn.nextInt();
  switch(a){
    case 1 : 
      System.out.println("1�� ����");
      break;
    case 2 : 
      System.out.println("2�� ����");
      break;
    case 3 : 
      System.out.println("3�� ����");
      break;
    case 4 : 
      System.out.println("4�� ����");
      break;
    default:
      System.out.println("5�� ����");
      break;
  }

  Scanner stdIn = new Scanner(System.in);
  int a = 1;
  while(a < 10){
    System.out.print("�������? y/n\n");
    int b = stdIn.nextInt();
    if(b == 1){
      System.out.println("�����ڽ��ϴ�.");
      break;
      }
    else{
      System.out.println("��� ������ �ҰԿ�.");
    }}
    System.out.printf("%d ����",a);
    a = a+1;

    //int a = 1;
    for (int i = 0; i < 10; i++){
      for(int a = 1; a < 10; a++){
      System.out.printf("ù��° %d �ι�° %d\n", i, a);
      }
    }
  }}
    int i=2;
    int j=1;
    Loop1 : while(i <=9) {
      while (j <= 9) {
      System.out.println(i+"*"+j+"="+i*j);
      j++;
    }System.out.println();
    j=1;
    i++;
  }}}

      
    for(int j=1;j <=9;j++) {
      if(j==5)
      break Loop1;
      break;
      continue Loop1;
      continue;
      System.out.println(i+"*"+j+"="+i*j);
    }System.out.println();
  }}}

  Random random = new Random();
  Scanner sc = new Scanner(System.in);
  System.out.print("��/�ٿ� ����");
  int a = sc.nextInt();
  int b = random.nextInt();
  b = (int)(Math.random()*100)+1;
  /*int c = sc.nextInt();
  for (int i=1; i<10; i++) {
    //System.out.println(b);
    int a = sc.nextInt();
    //System.out.print("1");
    if (a < b) {
      System.out.println("UP");
        } else if (a > b) {
          System.out.println("DOWN");
        } else if (a == b) {
          System.out.println("����");
          System.out.printf("�� �Է��� Ƚ�� %d �Դϴ�.",i);
          break;
        }}System.out.println("1~100����");
    }
  }

    int i = 1, j = 10;
    int k = sum(i,j);
    System.out.println(k);
}

  public static int sum(int i1, int i2) {
    int sum = 0;
    for(int i = i1; i<i2; i++){
      sum+=i;
    }
    return sum;
  }}
  
  Scanner x = new Scanner(System.in);
  System.out.print("정수 x:");
  int a = x.nextInt();
  int i = signof(a);
}}

  public static void signof(int y) {
    if (y>0) {
      System.out.println("singof(x)는 " + y + "입니다.");
    } else if (y == 0) {
      System.out.println("singof(x)는 " + y + "입니다.");
    } else { System.out.println("singof(x)는 " + y + "입니다.");
  }}


  import java.util.Scanner;

  public class Hello {
  public static void main(String[] args) {
  int num = div();
  System.out.print(num);
  }

  public static int div() {
    int a = 10, b = 5;
    int result = a / b;
    return result;
  }}

  import java.util.Scanner;

  public class Hello {
  public static void main(String[] args) {
  Scanner x = new Scanner(System.in);
  //String y = x.next();
  while(true) {
    String y = x.next();
    if (y.equals("+")) {
      System.out.println(div1());
    } else if (y.equals("-")) {
      System.out.println(div2());
    } else if (y.equals("*")) {
      System.out.println(div3());
    } else if (y.equals("/")) {
      System.out.println(div4());
    }}}

  public static int div1() {
    int a = 10, b =5;
    int result1 = a + b;
    return result1;
    }

  public static int div2() {
    int a = 10, b =5;
    int result2 = a - b;
    return result2;
  }

  public static int div3() {
    int a = 10, b =5;
    int result3 = a * b;
    return result3;
  }

  public static int div4() {
    int a = 10, b =5;
    int result4 = a / b;
    return result4;
    }}

  public class Hello {
  public static void main(String[] args){
  System.out.print("1부터 10의 합계:");
  // int a = sum();
  }
  public static void sum() {
  int sum = 0;
  for (int i = 0; i <= 10; i++){
    sum += i;
  }
  System.out.println(sum);
  }
}
import java.util.Scanner;
public class Hello {
public static void main(String[] args){
Scanner x = new Scanner(System.in);
list1();
System.out.println(start());

}
public static void list1() {
  System.out.print("콜라, 사이다, 환타, 파워에이드");
}

public static void process() {
  do { System.out.print("돈을 투입해주세요");
    while (true) {
      int a = x.nextInt();
      String b = x.next();
      switch (a) {
      case 1100 :
      if (b.equals("콜라")) {
        System.out.print("콜라 선택 완료! 음료를 구매했습니다.");
        break;
      } esle if (b.equals("사이다")) {
        System.out.print("사이다 선택 완료! 음료를 구매했습니다.");
        break;
      } esle if (b.equals("환타")) {
        System.out.print("환타 선택 완료! 음료를 구매했습니다.");
        break;
      } esle if (b.equals("파워에이드")) {
        System.out.print("파워에이드 선택 완료! 음료를 구매했습니다.");
        break;
        }
      case 1200 :
      if (b.equals("콜라")) {
        System.out.print("콜라 선택 완료! 음료를 구매했습니다.");
        break;
        } esle if (b.equals("사이다")) {
          System.out.print("사이다 선택 완료! 음료를 구매했습니다.");
          break;
        } esle if (b.equals("환타")) {
          System.out.print("환타 선택 완료! 음료를 구매했습니다.");
          break;
        } esle if (b.equals("파워에이드")) {
          System.out.print("파워에이드 선택 완료! 음료를 구매했습니다.");
          break;
        }
      case 1300 :
        if (b.equals("콜라")) {
          System.out.print("콜라 선택 완료! 음료를 구매했습니다.");
          break;
        } esle if (b.equals("사이다")) {
        System.out.print("사이다 선택 완료! 음료를 구매했습니다.");
        break;
        } esle if (b.equals("환타")) {
        System.out.print("환타 선택 완료! 음료를 구매했습니다.");
        break;
        } esle if (b.equals("파워에이드")) {
        System.out.print("파워에이드 선택 완료! 음료를 구매했습니다.");
        break;
        }
      case 1400 :
        if (b.equals("콜라")) {
          System.out.print("콜라 선택 완료! 음료를 구매했습니다.");
          break;
        } esle if (b.equals("사이다")) {
        System.out.print("사이다 선택 완료! 음료를 구매했습니다.");
        break;
        } esle if (b.equals("환타")) {
        System.out.print("환타 선택 완료! 음료를 구매했습니다.");
        break;
        } esle if (b.equals("파워에이드")) {
        System.out.print("파워에이드 선택 완료! 음료를 구매했습니다.");
        break;
        }
      case 1200:
        if (b.equals("콜라")) {
          System.out.print("콜라 선택 완료! 음료를 구매했습니다.");
          break;
        } esle if (b.equals("사이다")) {
        System.out.print("사이다 선택 완료! 음료를 구매했습니다.");
        break;
        } esle if (b.equals("환타")) {
        System.out.print("환타 선택 완료! 음료를 구매했습니다.");
        break;
        } esle if (b.equals("파워에이드")) {
        System.out.print("파워에이드 선택 완료! 음료를 구매했습니다.");
        break;}
        }}}

      }}

public class Hello {
public static void main(String[] args){
int[] myArr = new int[5];
myArr[0] = 10;
myArr[1] = 20;
myArr[2] = 30;
myArr[3] = 40;
myArr[4] = 50;
for (int i = 0; i<5; i++)
  System.out.println(i+"번째 요소값 : " + myArr[i]);
}}

import java.util.Scanner;

public class Hello {
  public static void main(String[] args){
  String[] myArr = new String[3];
  Scanner s = new Scanner(System.in);

  for (int i=0; i<3; i++) {
    myArr[i] = s.nextLine();
  }
  for (int i=0; i<3; i++)
    System.out.print(myArr[i]+"");
  }}

  public class Hello {
  public static void main(String[] args){
  double[] gradeArr = {90,70.5,80,79,82.5,50,70,90.2,89.5,89.7};
  double sum = 0.0;

  for (int i = 0; i<gradeArr.length;i++) {
    sum += gradeArr[i];
  }

  double average = sum / gradeArr.length;
  System.out.println("합계: " + sum);
  System.out.format("평균: %.2f",average);
  }}
  public class Hello {
  public static void main(String[] args){
  int[][] myArr = new int[5];
  myArr[0] = 10;
  }}*/

import java.util.Arrays;
// import java.util.Scanner;

// public class Hello {
//   public static void main(String[] args){
  // int [] iArr = {100, 95, 80, 70, 60};
  // for(int i=0; i < iArr.length; i++) {
  //   System.out.print(iArr[i]+",");
  // }
  //   System.out.println();

  // System.out.println(Arrays.toString(iArr));
  // }}

//   int[] iArr1 = new int[10];
//   int[] iArr2 = new int[10];
//   int[] iArr3 = {100, 95, 80, 70, 60};
//   char[] chArr = {'a', 'b', 'c', 'd'};

//   for (int i=0; i < iArr1.length; i++) {
//     iArr1[i] = i + 1;
//   }
//   for (int i=0; i < iArr2.length; i++) {
//     iArr2[i] = (int)(Math.random()*10) + 1;
//   }
//   for (int i=0; i < iArr1.length; i++) {
//     System.out.print(iArr1[i]+",");
//   }
//   System.out.println();

//   System.out.println(Arrays.toString(iArr2));
//   System.out.println(Arrays.toString(iArr3));
//   System.out.println(Arrays.toString(chArr));
//   System.out.println(iArr3);
//   System.out.println(chArr);
// }}
//   int sum = 0;
//   float average = 0f;
//   int[] score = {100, 88, 100, 100, 90};

//   for (int i=0; i < score.length;i++) {
//     sum += score[i];
//   }
//   average = sum / (float)score.length;
//   System.out.println("총합 :" + sum);
//   System.out.println("평균 :" + average);
// 


// Scanner x = new Scanner(System.in);
// while (true) {
//   System.out.println("배열의 크기를 넣어주세요");
//   int a = x.nextInt();
//   int[] score = new int[a];

//   int c = 1;
//   while (c == 1){

//   for (int y = 0; y <a; y++) {
//   System.out.println("배열의 값을" + y + "만큼 넣어주세요");
//   score[y] = x.nextInt(); }
//   }

//   int max = score[0];
//   int min = score[0];

//   for (int i=1; i < score.length; i++) {
//     if(score[i] > max) {
//       max = score[i];
//       System.out.println("max:" + max);
//   } else if(score[i] < min) {
//     min = score[i];
//     System.out.println("min:" + min);
//     }
//     }
//     System.out.println("최대값 :" + max);
//     System.out.println("최소값 :" + min); 
  
//   System.out.println("계속 하시겠습니까? (yes__1/no__2)");
//   c = x.nextInt();
//   if (c == 2) {
//     break;
// }
// } x.close();
// }
// }

// Scanner sc = new Scanner(System.in);
// int yorno = 1;
// while(yorno == 1){
//     System.out.print("배열의 크기 : ");
//     int num =sc.nextInt();
//     int[] score= new int[num];
//     for(int i=0; i<score.length;i++){
//         System.out.print("score["+i+"] = ");
//         score[i] = sc.nextInt();
//     }
//     int max=score[0];
//     int min=score[0];

//     for(int i=1; i<score.length;i++){
//         if(score[i]>max){
//             max =score[i];
//         }else if(score[i] <min){
//             min = score[i];
//         }
//     }
//     System.out.println("최대값 : "+max);
//     System.out.println("최소값 : "+min);
//     System.out.println();

//     System.out.println("계속 하시겠습니까? (yes__1/no__2)");
//     yorno = sc.nextInt();

//     if(yorno==1){
//         continue;
//     }else if(yorno==2){
//         break;
//     }else{
//         break;
//     }
// }sc.close();
// }
// }

// int[] numArr = {0,1,2,3,4,5,6,7,8,9};
// System.out.println(Arrays.toString(numArr));
// for (int i=0; i <100; i++) {
//   int n = (int)(Math.random()*10);
//   int tmo = numArr[0];
//   numArr[0] = numArr[n];
//   numArr[n] =tmp;
// }
// System.out.println(Arrays.toString(numArr));
//   }}

// int []ball = new int[45];
// for (int i=0; i < ball.length; i++)
// ball[i] = i+1;

// int tmp = 0;
// int j = 0;

// for (int i = 0; i <6; i++) {
//   j = (int)(Math.random()*45);
//   tmp = ball[i];
//   ball[i] = ball[j];
//   ball[j] = tmp;
// }
// for(int i=0; i <6; i++)
// System.out.printf("ball[%d]=%d%n", i, ball[i]);
//   }}

// String[] names = {"kim","Park","Yi"};
// for(int i=0; i < names.length; i++)
// System.out.println("names["+i+"]:"+names[i]);
// String tmp = names[2];
// System.out.println("tmp"+tmp);
// names[0] = "Yu";
// for(int i=0; i < names.length; i++)
// System.out.println(names[i]);
//   }}

// String str = "ABCDE";
// char ch = str.charAt(3);
// System.out.println(ch);

// String str2 = "012345";
// String tmp = str2.substring(1,4);
// System.out.println(tmp);
//   }}

// int[][] score = {
//   {100,100,100},
//   {20,20,20,20},
//   {30,30,30},
//   {40,40,40},
// };
// int sum = 0;
// for (int i = 0; i < score.length; i++) {
//   for (int j=0; j < score[i].length; j++) {
//     System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
    
//     sum += score[i][j];
//   }
// }
// System.out.println("sum="+ sum);
//   }}

// int[] arr = {0,1,2,3,4};
// int[][] arr2D = {{11,12},{21,22}};
// System.out.println(Arrays.toString(arr));
// System.out.println(Arrays.deepToString(arr2D));
  
// String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
// String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
// System.out.println(Arrays.equals(str2D,str2D2));
// System.out.println(Arrays.deepEquals(str2D,str2D2));

// int[] arr = {0,1,2,3,4};
// int[] arr2 = Arrays.copyOf(arr,arr.length);
// int[] arr3 = Arrays.copyOf(arr, 3);
// int[] arr4 = Arrays.copyOf(arr, 7);
// int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
// int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

// int[] arra = {3,2,0,1,4};
// Arrays.sort(arra);
// System.out.println(Arrays.toString(arra));
public class Student {

int id;
String name;
void insertRecord(int parm1, String parm2) {
  id = parm1;
  name = parm2;
}

void printInfo() {
  System.out.println("아이디:" + id);
  System.out.println("이름:" + name);
}}


