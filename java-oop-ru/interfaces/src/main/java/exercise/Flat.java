package exercise;

// BEGIN
class Flat implements Home {
    private double area;        // Жилая площадь квартиры
    private double balconyArea; // Площадь балкона
    private int floor; //этаж

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getFlatArea() {
    return area;
    }
    public double getBalconyArea() {
        return balconyArea;
    }
    public int getFloor() {
    return floor;
    }

@Override
public double getArea() {
    return getFlatArea() + getBalconyArea();
}
@Override
public int compareTo(Home another) {
    Home flat = new Flat(area, balconyArea, floor);
    //if (flat.getArea() == another.getArea()) {
      //  return 0;
    //}
    if (flat.getArea() > another.getArea()) {
        return 1;
    }
    if (flat.getArea() > another.getArea()) {
        return -1;
    }
    return 0;
}
@Override
    public String toString() {
        return "Квартира площадью " + getArea() +  " метров на " + getFloor() + " этаже";
    }
}


// END
