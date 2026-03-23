import java.util.Scanner;

// Abstract Class
abstract class Volume {
    protected String name;

    // Constructor
    Volume(String name) {
        this.name = name;
    }

    // Abstract Method
    abstract float calculateVolume();
}

class VolumeOfSphere extends Volume {
    private int radius;

    VolumeOfSphere(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    float calculateVolume() {
        return (4.0f / 3.0f) * 3.14f * radius * radius * radius;
    }
}

class VolumeOfCube extends Volume {
    private int side;

    VolumeOfCube(String name, int side) {
        super(name);
        this.side = side;
    }

    float calculateVolume() {
        return side * side * side;
    }
}

class VolumeOfCuboid extends Volume {
    private int length, breadth, height;

    VolumeOfCuboid(String name, int length, int breadth, int height) {
        super(name);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    float calculateVolume() {
        return length * breadth * height;
    }
}

public class t72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape (Sphere, Cube, or Cuboid):");
        String shape = sc.nextLine();

        Volume volume = null;

        switch (shape.toLowerCase()) {
            case "sphere":
                System.out.println("Enter the radius of the sphere:");
                int r = sc.nextInt();

                if (r < 0) {
                    System.out.println("Invalid Input");
                    return;
                }

                volume = new VolumeOfSphere("Sphere", r);
                System.out.printf("The volume of the sphere is %.2f", volume.calculateVolume());
                break;

            case "cube":
                System.out.println("Enter the side of the cube:");
                int s = sc.nextInt();

                if (s < 0) {
                    System.out.println("Invalid Input");
                    return;
                }

                volume = new VolumeOfCube("Cube", s);
                System.out.printf("The volume of the cube is %.2f", volume.calculateVolume());
                break;

            case "cuboid":
                System.out.println("Enter the length of the cuboid:");
                int l = sc.nextInt();
                System.out.println("Enter the breadth of the cuboid:");
                int b = sc.nextInt();
                System.out.println("Enter the height of the cuboid:");
                int h = sc.nextInt();

                if (l < 0 || b < 0 || h < 0) {
                    System.out.println("Invalid Input");
                    return;
                }

                volume = new VolumeOfCuboid("Cuboid", l, b, h);
                System.out.printf("The volume of the cuboid is %.2f", volume.calculateVolume());
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}