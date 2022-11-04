public abstract class Animal {
    public void Info(){
        System.out.println("druh: " + mujDruh());
        System.out.println("trida: " + mojeTrida());
        System.out.println("pocet nohou: " + pocetNohou());
    }

    public abstract String mujDruh();
    public abstract String mojeTrida();
    public abstract Integer pocetNohou();
}