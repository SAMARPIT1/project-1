import java.text.DecimalFormat;
public class rectangle2 extends shape2
{
double length;
double width;

rectangle2()
{}
rectangle2(double length,double width)
{
this.length=length;
this.width=width;

}
rectangle2(double length,double width,String color,boolean filled)

{
this.length=length;
this.width=width;
this.color=color;
this.filled=filled;

}
public double getlength()
{
return length;

}
public double getwidth()
{
return width;

}
public void setlength(double length)
{
this.length=length;
}
public void setwidth(double width)
{
this.width=width;
}
public double getArea()

{
DecimalFormat dec1 = new DecimalFormat("#0.00");
System.out.println("area of rect "+dec1.format(length*width));
return 0;
}
public double getPerimeter()
{
System.out.println("primeter of rect "+2*(length+width));
return 0;
}
public String toString()
{
return "rectangle has " +color+" "+filled+" "+length+" "+ width;
}
}