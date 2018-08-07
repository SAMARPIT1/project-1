public abstract class shape2
{
protected String color;
protected boolean filled;
shape2()
{}
shape2(String color,boolean filled)
{
this.color=color;
this.filled=filled;
}
public String getcolor()
{
return color;
}
void setcolor(String color)
{
this.color=color;
}
public boolean isfilled()
{
return filled;
}
void setfilled(boolean filled)
{
this.filled=filled;
}
public double getArea()
{
return 0;
}
public double getPerimeter()
{
return 0;
}
public String toString()
{
return color+" "+ filled;
}

}