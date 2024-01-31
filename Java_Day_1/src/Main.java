import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter your name :" );
//        String name=sc.nextLine();
//        System.out.println("Enter your age : ");
//        int age=sc.nextInt();
//        System.out.println("Hiii ! "+name+" Your age is "+age);
//        int a=20;
//        int b=10;
//        int c=++a;
//        System.out.println(c);
//        c=a++;
//        System.out.println(c);


//        Find area of triangle
        /*System.out.println("Enter first side : ");
        int a=sc.nextInt();
        System.out.println("Enter second side : ");
        int b=sc.nextInt();
        System.out.println("Enter third side : ");
        int c=sc.nextInt();
        double s=(a+b+c)/2;

        double area=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area of triangle : "+area);*/





//        Find the roots of quadratic equation
//        System.out.println("Enter the value of a : ");
//        double a=sc.nextInt();
//        System.out.println("Enter the value of b : ");
//        double b=sc.nextInt();
//        System.out.println("Enter the value of c : ");
//        double c=sc.nextInt();
//
//        double root1=(-b + Math.sqrt( b*b-4*a*c ))/2*a;
//        double root2=(-b - Math.sqrt( b*b-4*a*c ))/2*a;
//
//        System.out.println("First root of equation :"+root1);
//        System.out.println("Second root of equation :"+(root2));






//        Find the number is even or odd
        /*System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }*/



//   Young or old

//        System.out.println("Enter the age : ");
//        int num=sc.nextInt();
//        if(num>=14 && num<=55)
//        {
//            System.out.println("Young");
//        }else if(num<14){
//            System.out.println("Kid");
//        }else{
//            System.out.println("Old");
//        }



//        Print days in a week
//        System.out.println("Enter the number : ");
//        int num=sc.nextInt();
//
//            switch(num) {
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                default:
//                    System.out.println("Invalid input");
//            }





//        Find the grade of a student

//        System.out.println("Enter the marks of sub1 : ");
//        int a=sc.nextInt();
//        System.out.println("Enter the marks of sub2 : ");
//        int b=sc.nextInt();
//        System.out.println("Enter the marks of sub3 : ");
//        int c=sc.nextInt();
//
//        int avg=(a+b+c)/3;
//        if(avg>=70){
//            System.out.println("A Grade");
//        }else if(avg>=60 && avg<70){
//            System.out.println("B Grade");
//        }else if(avg>=50 && avg<60)
//        {
//            System.out.println("C Grade");
//        }else if(avg>=40 && avg<50)
//        {
//            System.out.println("D Grade");
//        }else
//        {
//            System.out.println("E Grade");
//        }



//        System.out.println("Enter the where to skip : ");
//        int skip=sc.nextInt();
//        System.out.println("Enter the where to stop : ");
//        int stop=sc.nextInt();
//
//        for(int i=1;i<=100;i++)
//        {
//            if(i==skip){
//                continue;
//            }
//            if(i==stop)
//            {
//                break;
//            }
//            System.out.println(i);
//        }

//        Multiplication table

//        System.out.println("Enter the number: ");
//        int num=sc.nextInt();
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(num+" * "+i+" : "+num*i);
//        }


//        System.out.println("Enter the number: ");
//        int num=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=5;i++)
//        {
//            sum+=i;
//        }
//        System.out.println("Sum : "+sum);




//        Factorial of a number

//        System.out.println("Enter the number: ");
//        int num=sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=num;i++)
//        {
//            fact*=i;
//        }
//        System.out.println("Factorial is  : "+fact);



//        System.out.println("Enter the number: ");
//        int num=sc.nextInt();
//        while(num>0)
//        {
//            int digit=num%10;
//            System.out.print(digit);
//            num=num/10;
//        }



       HashMap<String,String> map=new HashMap<>();
       String s="245";
       String ans="";
       map.put("1","One");
       map.put("2","Two");
       map.put("4","Four");
       map.put("5","Five");
       for(int i=0;i<s.length();i++)
       {
           ans+=map.g;
       }
        System.out.println(ans);






    }
}