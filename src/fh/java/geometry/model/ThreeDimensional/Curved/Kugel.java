package fh.java.geometry.model.ThreeDimensional.Curved;

import static java.lang.Math.PI;

/**
 * Created by 2540p on 04.11.2016.
 */
public class Kugel extends Curved {

    protected double sideA;


    public Kugel(int x, double sideA ) {
        this.x=x;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Kugel kugel = (Kugel) o;

        return Double.compare(kugel.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kugel{");
        sb.append("sideA=").append(sideA);
        sb.append(" , surfaceArea = ").append(calcSurfaceArea());
        sb.append(" , calcVolume = ").append(calcVolume());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcSurfaceArea()  {
        return 4*PI*sideA*sideA;
    }

    @Override
    public double calcVolume() { return (4/3)*PI*sideA*sideA*sideA ;}

}
