class Aspirant extends Main{
    String work;

    public Aspirant(String name, String firstName, String group, double avgMark, String work) {
        super(name, firstName, group, avgMark);
        this.work = work;
    }

    public static void main(String[] args) {
        Main student=new Main();
        Aspirant aspirant=new Aspirant("denis","orlioglo","TI232ru",9.2,"yes");
        System.out.println(aspirant.name);
    }
}
