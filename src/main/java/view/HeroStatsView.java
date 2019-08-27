package view;

import model.Hero;

public class HeroStatsView {
    public HeroStatsView(Hero hero) {
        UserOutput o = new UserOutput();
        
        o.output("Your hero has the following stats\n");
        o.output("Attack: " + hero.getAttack());
        o.output("Defense: " + hero.getDefense());
        o.output("HP: " + hero.getHitPoints() + "\n");
    }
}