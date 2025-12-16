class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damagePoints = 0;
        return (fighter.isVulnerable()) ? 10 : 6;
    }
    
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

    private boolean spellIsPrepared = false;

    public void prepareSpell() {
        spellIsPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !spellIsPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damagePoints = 0;
        return (isVulnerable()) ? 3 : 12;
    }
    
    public String toString() {
        return "Fighter is a Wizard";
    }


}
