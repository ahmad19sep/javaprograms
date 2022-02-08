package src.expressionNStatments;

import java.util.Objects;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Wall Width: ");
        double width=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Your Wall Height: ");
        double height=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Area Covered By One Bucket: ");
        double area=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Extra Buckets: ");
        int buckets=scanner.nextInt();
        scanner.close();
        System.out.println("Required Buckets= "+getBukCount(width,height,area,buckets));
        System.out.println("Required Buckets with no extra bukets= "+getBukCount(width,height,area));
        System.out.println("When Only Area Is Given Rquired Buckets= "+getBukCount(width*height,area));

    }
    public static int getBukCount(double width, double  height,double area, int extraBuckets){
        if(width>=0 && height>=0 && area>=0 && extraBuckets>=0){
            double totalArea=width*height;
            double areaByExtraBuckets=area*extraBuckets;
            double remainingArea=totalArea-areaByExtraBuckets;
            double requiredBuckets= Math.ceil(remainingArea/area);
            return (int) Math.ceil(requiredBuckets);

        }else {
            return -1;
        }
    }
    public static int getBukCount(double width, double  height,double area){
        if(width>=0 && height>=0 && area>=0 ){
            double totalArea=width*height;
            double requiredBuckets= Math.ceil(totalArea /area);
            return (int) Math.ceil(requiredBuckets);

        }else {
            return -1;
        }
    }
    public static int getBukCount(double areaOfWall,double area){
        if(areaOfWall>=0 && area>=0 ){
            double requiredBuckets= Math.ceil(areaOfWall /area);
            return (int) Math.ceil(requiredBuckets);

        }else {
            return -1;
        }
    }
}







