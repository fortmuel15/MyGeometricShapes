package fh.java.geometry;

import fh.java.geometry.model.MyGeometricShapes;
import fh.java.geometry.model.ThreeDimensional.Curved.Kugel;
import fh.java.geometry.model.ThreeDimensional.NonCurved.Kegel;
import fh.java.geometry.model.ThreeDimensional.NonCurved.Zylinder;
import fh.java.geometry.model.TwoDimensional.EquallySized.Raute;
import fh.java.geometry.model.TwoDimensional.NonEquallySized.Parallelogramm;
import fh.java.geometry.model.TwoDimensional.NonEquallySized.Trapez;



import java.util.*;

/**
 * Created by 2540p on 04.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();
    }

    private void doIt() {

        List<MyGeometricShapes> shapeList = new ArrayList<>(); // List because it takes every possible List (array List, Linked List,..) // is called polymorphisem
        fillList(shapeList);
        printList(shapeList);

        List<Kugel> kugelList = new ArrayList<>();
        System.out.println("------------ for loop -------------");

        for (MyGeometricShapes shape : shapeList) {
            if (shape instanceof Kugel) {
                Kugel kugel = (Kugel) shape;
                kugel.setSideA(111);
                kugelList.add((Kugel) shape);
            }
        }
        System.out.println("-------- only kugel -------------");
        for (Kugel kugel : kugelList) {
            System.out.println(kugel);
        }

    }


    public void fillList(List<MyGeometricShapes> shapeList) {
        //TODO: Implement
        // Three-Dimensionals
        shapeList.add(new Kugel(8, 19));
        shapeList.add(new Kugel(17, 19.20));
        shapeList.add(new Kugel(7, 7.8));

        shapeList.add(new Kegel(20, 15, 10.0, 23.8, 9));
        shapeList.add(new Kegel(2, 18, 0.88, 9.17, 8.9));
        shapeList.add(new Kegel(3, 1, 4.5, 8.9, 0));

        shapeList.add(new Zylinder(8, 17, 2, 4));
        shapeList.add(new Zylinder(9, 68, 9.7, 8.9));
        shapeList.add(new Zylinder(17, 23, 0.5, 14.8));

        //Two Dimensionals

        shapeList.add(new Parallelogramm(28, 9, 5.3, 5.9, 7.8));
        shapeList.add(new Parallelogramm(26, 0, 9.3, 6.8, 9.3));
        shapeList.add(new Parallelogramm(13, 10, 3.4, 10.9, 5.8));

        shapeList.add(new Trapez(17, 10, 9.3, 6.8, 9.3, 10.5, 18.8));
        shapeList.add(new Trapez(2, 9, 6.8, 1.8, 10.3, 0.5, 9.8));
        shapeList.add(new Trapez(7, 5, 5.3, 7.8, 12.4, 9.5, 8.8));

        shapeList.add(new Raute(9, 8, 7.8, 8.9, 12.0));
        shapeList.add(new Raute(20, 18, 17.8, 18.9, 12.0));
        shapeList.add(new Raute(10, 9, 9.2, 8.7, 9.0));

    }


    public void printList(List<MyGeometricShapes> shapeList) {
        //TODO: Implement


        System.out.println("------------ stream 2 -------------");

        shapeList.stream().forEach(System.out::println);
    }
}
