import java.text.DecimalFormat;
public class circle2 extends shape2
{
public double radius;
circle2()
{}
circle2(double radius)
{
this.radius=radius;
}
circle2(double radius,String color,boolean filled)
{
this.radius=radius;
this.color=color;
this.filled=filled;

}

public double getradius()
{
return radius;
}
void setradius(double radius)
{
this.radius=radius;
}

public double getArea()
{
DecimalFormat dec = new DecimalFormat("#0.00");
     System.out.println("area of circle "+dec.format(3.14*radius*radius));  
     return 0;
}
public double getPerimeter()
{
System.out.println("perimeter of circle "+2*3.14*radius);
return 0;
}
public String toString()
{
return "circle has "+color +""+ filled +""+ radius;
}

}