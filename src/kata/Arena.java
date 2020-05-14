public class Arena {

    public static String fight(Worm worm1, Worm worm2) {

        while (worm1.getLife() > 0 && worm2.getLife() > 0) {
            if (worm1.getLife() < worm2.getLife()) {
                worm1.attack(worm2);
                worm2.attack(worm1);
            } else {
                worm2.attack(worm1);
                worm1.attack(worm2);
            }
        }

     
        

        //return ("Nom worm1 is alive" || "Nom worm2 is alive");
        // if (worm1.isAlive()) return worm1.getName();
        // else return worm2.getName();

        return worm1.isAlive() ? worm1.getName() : worm2.getName();
    }
}
