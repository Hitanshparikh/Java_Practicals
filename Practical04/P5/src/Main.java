public class Main {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate undergrad = new Undergraduate();
        Postgraduate postgrad = new Postgraduate();

        degree.getDegree();
        undergrad.getDegree();
        postgrad.getDegree();

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}

class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    @Override
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    @Override
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}