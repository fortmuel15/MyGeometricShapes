package fh.java.geometry.model.TwoDimensional.NonEquallySized;

/**
 * Created by 2540p on 04.11.2016.
 */
public class Trapez extends NonEquallySized {

    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;
    protected double sideH;

    public Trapez(int x, int y, double sideA, double sideB, double sideC, double sideD, double sideH) {
        this.x=x;
        this.y=y;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() { return sideC; }

    public void setSideC() { this.sideC = sideC; }

    public double getSideD() { return sideD; }

    public void setSideD() { this.sideD = sideD; }

    public double getSideH() { return sideA;}

    public void setSideH() { this.sideH = sideH; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapez trapez = (Trapez) o;

        if (Double.compare(trapez.sideA, sideA) != 0) return false;
        if (Double.compare(trapez.sideB, sideB) != 0) return false;
        return Double.compare(trapez.sideD, sideD) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trapez{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideC=").append(sideC);
        sb.append(", sideD=").append(sideD);
        sb.append(", sideH=").append(sideH);
        sb.append(", area = ").append(calcArea());
        sb.append(", perimeter = ").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea()  {
        return ((sideA + sideB)/2) * sideH;
    }

    @Override
    public double calcPerimeter() {return sideA + sideB + sideC + sideD;}
}
