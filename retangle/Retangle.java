package retangle;

public class Retangle {
    public double Width;
    public double Height;

    public  double Area(){
        return Height * Width;
    }

    public double Perimeter(){
        return (Width * Height)+2;
    }

    public double Diagonal(){
        return Height+Width/2;
    }

}

