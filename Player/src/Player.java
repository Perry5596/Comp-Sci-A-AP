public class Player {
    private String n;
    private static int numPlayers;
    private int X;
    private int Y;
    private int Z;
    private int d;
    private int hp;
    public Player() {
        numPlayers++;
        n.equals ("P");
        X = 0;
        Y = 0;
        Z = 0;
        d = 1;
        hp = 20;
    }
    public Player(String name, int x, int y, int z) {
        X = x;
        Y = y;
        Z = z;
        n = name;
        numPlayers++;
        hp = 20;
        d = 1;
    }
    public Player(String name, int x, int y, int z, int health, int direction) {
        numPlayers++;
        X = x;
        Y = y;
        Z = z;
        n = name;
        d = direction;
        hp = health;
        if (hp < 0) {
            hp = 0;
        }
        if (direction < 1 || direction > 6) {
            d = 1;
        }
    }
    String getName() {
        return (this.n);
    }
    static int getNumPlayers() {
        return numPlayers;
    }
    int getX() {
        return (this.X);
    }
    int getY() {
        return (this.Y);
    }
    int getZ() {
        return (this.Z);
    }
    int getHp() {
        return (this.hp);
    }
    int getDirection() {
        return (this.d);
    }
    public String toString() {
        return ("Name: " + getName() + " Health: " + getHp() + " Coordinates: X " + getX() + " Y " + getY() + " Z " + getZ() + " Direction: " + getDirection());
    }
    void setHp(int health) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = health;
    }
    void setDirection(int direction) {
        if (direction >= 1 && direction <= 6) {
            this.d = direction;
        }
    }
    void move(int direction, int units) {
        if (direction == 1) {
            this.Y += units;
        }
        if (direction == 2) {
            this.Y -= units;
        }
        if (direction == 3) {
            this.Z += units;
        }
        if (direction == 4) {
            this.Z -= units;
        }
        if (direction == 5) {
            this.X += units;
        }
        if (direction == 6) {
            this.X -= units;
        }
    }
    void teleport(int x, int y, int z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }
    void teleport(Player player) {
        this.X = player.X;
        this.Y = player.Y;
        this.Z = player.Z;
    }
    void attack(Player p, int damage) {
        if (p.hp - damage < 0) {
            p.hp = 0;
        }
        else {
            p.hp -= damage;
        }
    }
    double getDistance(int x, int y, int z) {
        double xx = Math.abs(this.X - x);
        double yy = Math.abs(this.Y - y);
        double zz = Math.abs(this.Z - z);
        return (xx + yy + zz);
    }
    double getDistance(Player player) {
        double xx = Math.abs(this.X - player.X);
        double yy = Math.abs(this.Y - player.Y);
        double zz = Math.abs(this.Z - player.Z);
        return (xx + yy + zz);
    }
}