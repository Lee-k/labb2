import java.util.Scanner;

public class Laba_2
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите x первой точки: ");
        String st1 = in.nextLine();
        System.out.print ("Введите y первой точки: ");
        String st2 = in.nextLine();
        System.out.print ("Введите z первой точки: ");
        String st3 = in.nextLine();
        Point3d p1 = new Point3d (Double.parseDouble (st1), Double.parseDouble (st2), Double.parseDouble (st3));
        System.out.print ("Введите x второй точки: ");
        st1 = in.nextLine();
        System.out.print ("Введите y второй точки: ");
        st2 = in.nextLine();
        System.out.print ("Введите z второй точки: ");
        st3 = in.nextLine();
        Point3d p2 = new Point3d (Double.parseDouble (st1), Double.parseDouble (st2), Double.parseDouble (st3));
        System.out.print ("Введите x третей точки: ");
        st1 = in.nextLine();
        System.out.print ("Введите y третей точки: ");
        st2 = in.nextLine();
        System.out.print ("Введите z третей точки: ");
        st3 = in.nextLine();
        Point3d p3 = new Point3d (Double.parseDouble (st1), Double.parseDouble (st2), Double.parseDouble (st3));


        double s = computeArea (p1, p2, p3);

        if (s==0)
            System.out.println ("Одна из точек равна другой и треугольник не формируется!");
        else
            System.out.println ("Площадь треугольника равна " + s);
    }

    //Метод высчитывает площадь треугольника
    public static double computeArea (Point3d p1, Point3d p2, Point3d p3)
    {
        if (p1.isEqual (p2) || p2.isEqual (p3) || p3.isEqual (p1)) {
            return 0;
        }

        double a = p1.distanceTo (p2);
        double b = p2.distanceTo (p3);
        double c = p3.distanceTo (p1);
        //double p = (a + b + c) / 2;

        return Math.sqrt (p * (p - a) * (p - b) * (p - c));
    }
}