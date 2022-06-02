public class Road {
    int person;
    int cars;

    public void countPersons() {
        person++;
        if (person > 4) {
            System.out.println("Светофор для пешеходов включен");
            person = 0;
        }
    }

    public void countCars() {
        cars++;
        if (cars > 3) {
            System.out.println("Светофор для машин включен");
            cars = 0;
        }
    }

}
