package lesson1;

public class hw1 {

        public static void main(String[] args) {
            hwTwo();
            System.out.println();

            System.out.println(hwThree(5,8,4,3)+"\n");

            System.out.println(hwFour(7,8)+"\n");

            System.out.println(hwFive(530)+"\n");

            System.out.println(hwFivePlus(789)+"\n");

            System.out.println(visoKostnii(2020));

        }

        static void hwTwo (){
            //Создать переменные всех пройденных типов данных и инициализировать их значения.
            byte a = Byte.MIN_VALUE;
            short b = Short.MAX_VALUE;
            int c = Integer.MIN_VALUE;
            long d = Long.MAX_VALUE;

            float e = 2.5f;
            double g = 3.35d;

            char h = '7';
            String s = "Конфетка вредина";

            boolean boo = true;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(g);
            System.out.println(h);
            System.out.println(s);
            System.out.println(boo);
        }

        public static double hwThree (double a,double b,double c, double d){
            //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода.
            return a * (b + (c / d));
        }

        public static boolean hwFour(double a, double b){
            //Написать метод, принимающий на вход два числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
            double c = a + b;
            if (c >= 10 && c <= 20) {
                return true;
            }else{
                return false;
            }
        }

        public static int hwFive(int a){
            //Создать метод, который принимает число. Если данное число больше 100 и меньше 999 включительно - вывести в консоль цифры данного числа в обратном порядке. Например, введено число 725 -> в консоле будет: 527.
            if(a >= 100 && a <= 999){
                int b1 = a / 100;
                int b2 = (a % 100) /10;
                int b3 = a % 10;
                int reverse = (b3 * 100)+(b2*10)+b1;
                // System.out.print(b3);
                // System.out.print(b2);
                // System.out.print(b1);
                // System.out.println(reverse);
                return reverse;

            }else{
                return a;
            }
        }

        public static String hwFivePlus (int num){
            if(num >= 100 && num <= 999){
                int num1 = num / 100;
                int num2 = (num % 100) / 10;
                int num3 = num % 10;
                return "перевернутое" + num3 + num2 + num1;
            }else{
                return "ошибочка" +num;
            }
        }

        public static boolean visoKostnii (int god){
            if((god % 4 == 0 ) &&! (god % 100 == 0) || (god % 400 == 0 )){
                return true;
            } else {
                return false;
            }
        }


}
