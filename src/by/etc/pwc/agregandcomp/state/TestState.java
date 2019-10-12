package by.etc.pwc.agregandcomp.state;

public class TestState {
    public static void main(String[] args) {
        State belarus = new State();
        belarus.setCapital(new Town("Minsk",100));

        Region [] regions = {
                new Region(belarus.getCapital()),
                new Region(new Town("Brest",60)),
                new Region(new Town("Homel",80)),
                new Region(new Town("Mohilev",100)),
                new Region(new Town("Vitebsk",62)),
                new Region(new Town("Hrodno",55))
        };

        belarus.setRegions(regions);
        System.out.println("Capital: "+belarus.getCapital().toString());
        System.out.println("Number of regions - "+belarus.getRegions().length);
        belarus.calculateSquare();
        System.out.println("Total square of State  - "+belarus.getSquare());

        for(Region reg: regions) {
            System.out.print(reg.getRegionCenter() +" ");
        }
    }
}
