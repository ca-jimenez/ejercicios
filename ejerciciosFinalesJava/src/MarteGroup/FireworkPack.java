package MarteGroup;

import java.util.ArrayList;

//public class FireworkPack extends Explosive {
//
//    ArrayList<Firework> contents;
//
//    public FireworkPack() {
//        super("Pack");
//        contents = new ArrayList<>();
//    }
//
//    public FireworkPack(ArrayList<Firework> contents) {
//        super("Pack");
//        this.contents = contents;
//    }
//
//    public ArrayList<Firework> getContents() {
//        return contents;
//    }
//
//    public void setContents(ArrayList<Firework> contents) {
//        this.contents = contents;
//    }
//
//    public void addFirework(Firework firework) {
//        contents.add(firework);
//        System.out.println("Fuego artificial añadido");
//    }
//
//    @Override
//    public void explode() {
//
//        for (Firework fw : contents) {
//            fw.explode();
//        }
//    }
//
//    @Override
//    public String toString() {
//
//        String result = "Pack, contents: ";
//
//        for (Firework fw : contents) {
//            result += fw.getName() + ", ";
//        }
//
//        return result.substring(0, result.length() - 2);
//    }
//}

public class FireworkPack extends Explosive {

    ArrayList<Explosive> contents;

    public FireworkPack() {
        super("Pack");
        contents = new ArrayList<>();
    }

    public FireworkPack(ArrayList<Explosive> contents) {
        super("Pack");
        this.contents = contents;
    }

    public ArrayList<Explosive> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Explosive> contents) {
        this.contents = contents;
    }

    public void addFirework(Explosive firework) {
        contents.add(firework);
//        System.out.println("Fuego artificial añadido");
    }

    @Override
    public void explode() {

        for (Explosive fw : contents) {
            fw.explode();
        }
    }

    @Override
    public String toString() {

        String result = "Pack, contents: ";

        for (Explosive fw : contents) {
            result += fw.getName() + ", ";
        }

        return result.substring(0, result.length() - 2);
    }
}
