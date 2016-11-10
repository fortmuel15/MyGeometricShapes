package fh.java.geometry.model.ThreeDimensional.NonCurved;

import static java.lang.Math.PI;

/**
 * Created by 2540p on 04.11.2016.
 */
public class Kegel extends NonCurved {

    protected double sideA;
    protected double sideB;
    protected double sideH;

    public Kegel(int x, int y, double sideA, double sideB, double sideH ) {
        this.x=x;
        this.y=y;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Kegel kegel = (Kegel) o;

        return Double.compare(kegel.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kegel{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideH=").append(sideH);
        sb.append(" , surfaceArea = ").append(calcSurfaceArea());
        sb.append(" , Volume = ").append(calcVolume());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcSurfaceArea()  {
        return PI*sideA*(sideA*sideB);
    }

    @Override
    public double calcVolume() {return (1/3)*PI*sideA*sideA*sideH; }
}
