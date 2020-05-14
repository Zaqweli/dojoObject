public class Worm {

    // TODO
    private String name;
    private int life;
    private int attack;

    public Worm(String name, int life, int attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
    }

    public String getName() {
        return this.name;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getLife() {
        return this.life;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    

    // public abstract boolean attack(Worm)
}
