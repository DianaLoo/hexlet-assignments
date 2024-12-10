package exercise;

// BEGIN
class Cottage implements Home {
    private double area;        // площадь
    private int floorCount; //этажи кол-во

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        Home cottage = new Cottage(area, floorCount);

        //if (cottage.getArea() == another.getArea()) {
          //  return 0;
        //}
        if (cottage.getArea() > another.getArea()) {
            return 1;
        }
        if (cottage.getArea() > another.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return getFloorCount() +  " этажный коттедж площадью " + getArea() + " метров";
    }
}

// END
