import java.text.DecimalFormat;
public class square2 extends rectangle2
{
double side;


square2()
{}
square2(double side)
{
this.side=side;
}
square2(double side,double length,double width)

{
this.side=side;
this.length=length;
this.width=width;

}
public double getside()
{
return side;

}

public void setside(double side)
{
this.side=side;
}
public void setwidth(double width)
{
this.width=width;
}
public void setlength(double length)
{
this.length=length;
}


public double getArea()
{
DecimalFormat dec2 = new DecimalFormat("#0.00");
System.out.println("area of sqr "+dec2.format(side*side));
return 0;
}
public double getPerimeter()
{
System.out.println("primeter of rect "+4*side);
return 0;
}

public String toString()
{
return "square has "+ length+" "+width+" "+side;
}
}