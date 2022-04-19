public class Point3d
{
    private double xCoord;
    private double yCoord;
    private double zCoord;

    //Метод задает координаты точки
    public Point3d(double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    //Метод задает стандартные (0, 0, 0) координаты точки
    public Point3d()
    {
        xCoord = yCoord = zCoord = 0.0;
    }

    //Методы set изменяют значения соответствующей координаты
    public void setX (double x)
    {
        xCoord = x;
    }

    //Методы get возвращают значения соответствующей координаты
    public double getX ()
    {
        return xCoord;
    }

    public void setY (double y)
    {
        yCoord = y;
    }

    public double getY ()
    {
        return yCoord;
    }

    public void setZ (double z)
    {
        zCoord = z;
    }

    public double getZ ()
    {
        return zCoord;
    }

    //Метод сравнивает координаты двух точек
    public boolean isEqual (Point3d p)
    {
        if (xCoord == p.getX () && yCoord == p.getY () && zCoord==p.getZ ())
            return true;
        return false;
    }

    //Метод расчитывает расстояние между двумя точками
    public double distanceTo (Point3d p)
    {
        return Math.sqrt (Math.pow (p.getX () - xCoord, 2) + Math.pow (p.getY () - yCoord, 2) + Math.pow (p.getZ () - zCoord, 2));
    }
}