/*
 * Dylan Gilson
 * dylan.gilson@outlook.com
 * June 8, 2021
 */

package Engine;

import Font.GUIText;
import Font.TextMaster;
import Utilities.GlobalConstants;

import org.lwjgl.util.vector.Vector2f;

public class Stats {

    private long totalXP;
    private int totalLevel;
    private Skill attack;
    private Skill strength;
    private Skill defence;
    private Skill ranged;
    private Skill prayer;
    private Skill magic;
    private Skill hitpoints;
    private Skill herblore;
    private Skill crafting;
    private Skill fletching;
    private Skill slayer;
    private Skill runecrafting;
    private Skill mining;
    private Skill smithing;
    private Skill fishing;
    private Skill cooking;
    private Skill firemaking;
    private Skill woodcutting;

    public Stats(boolean isLevelable) {
        attack = new Skill("Attack", 1, new Vector2f(0f, 0f), isLevelable);
        strength = new Skill("Strength", 1, new Vector2f(0f, 0f), isLevelable);
        defence = new Skill("Defence", 1, new Vector2f(0f, 0f), isLevelable);
        ranged = new Skill("Ranged", 1, new Vector2f(0f, 0f), isLevelable);
        prayer = new Skill("Prayer", 1, new Vector2f(0f, 0f), isLevelable);
        magic = new Skill("Magic", 1, new Vector2f(0f, 0f), isLevelable);
        hitpoints = new Skill("Hitpoints", 1000, new Vector2f(0f, 0f), isLevelable);
        herblore = new Skill("Herblore", 1, new Vector2f(0f, 0f), isLevelable);
        crafting = new Skill("Crafting", 1, new Vector2f(0f, 0f), isLevelable);
        fletching = new Skill("Fletching", 1, new Vector2f(0f, 0f), isLevelable);
        slayer = new Skill("Slayer", 1, new Vector2f(0f, 0f), isLevelable);
        runecrafting = new Skill("Runecrafting", 1, new Vector2f(0f, 0f), isLevelable);
        mining = new Skill("Mining", 1, new Vector2f(0f, 0f), isLevelable);
        smithing = new Skill("Smithing", 1, new Vector2f(0f, 0f), isLevelable);
        fishing = new Skill("Fishing", 1, new Vector2f(0f, 0f), isLevelable);
        cooking = new Skill("Cooking", 1, new Vector2f(0f, 0f), isLevelable);
        woodcutting = new Skill("Woodcutting", 1, new Vector2f(0f, 0f), isLevelable);
        firemaking = new Skill("Firemaking", 1, new Vector2f(0f, 0f), isLevelable);

        calculateTotalXP();
        calculateTotalLevel();
    }

    public void calculateTotalXP() {
        totalXP = 0;

        totalXP += attack.getXP();
        totalXP += strength.getXP();
        totalXP += defence.getXP();
        totalXP += ranged.getXP();
        totalXP += prayer.getXP();
        totalXP += magic.getXP();
        totalXP += hitpoints.getXP();
        totalXP += herblore.getXP();
        totalXP += crafting.getXP();
        totalXP += fletching.getXP();
        totalXP += slayer.getXP();
        totalXP += runecrafting.getXP();
        totalXP += mining.getXP();
        totalXP += smithing.getXP();
        totalXP += fishing.getXP();
        totalXP += cooking.getXP();
        totalXP += woodcutting.getXP();
        totalXP += firemaking.getXP();
    }

    public void calculateTotalLevel() {
        totalLevel = 0;

        totalLevel += attack.getLevel();
        totalLevel += strength.getLevel();
        totalLevel += defence.getLevel();
        totalLevel += ranged.getLevel();
        totalLevel += prayer.getLevel();
        totalLevel += magic.getLevel();
        totalLevel += hitpoints.getLevel();
        totalLevel += herblore.getLevel();
        totalLevel += crafting.getLevel();
        totalLevel += fletching.getLevel();
        totalLevel += slayer.getLevel();
        totalLevel += runecrafting.getLevel();
        totalLevel += mining.getLevel();
        totalLevel += smithing.getLevel();
        totalLevel += fishing.getLevel();
        totalLevel += cooking.getLevel();
        totalLevel += woodcutting.getLevel();
        totalLevel += firemaking.getLevel();
    }

    // reset all temporary levels back to actual level
    public void reset() {
        this.attack.updateTemporaryLevel(this.attack.getLevel(), false);
        this.strength.updateTemporaryLevel(this.strength.getLevel(), false);
        this.defence.updateTemporaryLevel(this.defence.getLevel(), false);
        this.ranged.updateTemporaryLevel(this.ranged.getLevel(), false);
        this.prayer.updateTemporaryLevel(this.prayer.getLevel(), false);
        this.magic.updateTemporaryLevel(this.magic.getLevel(), false);
        this.hitpoints.updateTemporaryLevel(this.hitpoints.getLevel(), false);
        this.herblore.updateTemporaryLevel(this.herblore.getLevel(), false);
        this.crafting.updateTemporaryLevel(this.crafting.getLevel(), false);
        this.fletching.updateTemporaryLevel(this.fletching.getLevel(), false);
        this.slayer.updateTemporaryLevel(this.slayer.getLevel(), false);
        this.runecrafting.updateTemporaryLevel(this.runecrafting.getLevel(), false);
        this.mining.updateTemporaryLevel(this.mining.getLevel(), false);
        this.smithing.updateTemporaryLevel(this.smithing.getLevel(), false);
        this.fishing.updateTemporaryLevel(this.fishing.getLevel(), false);
        this.cooking.updateTemporaryLevel(this.cooking.getLevel(), false);
        this.woodcutting.updateTemporaryLevel(this.woodcutting.getLevel(), false);
        this.firemaking.updateTemporaryLevel(this.firemaking.getLevel(), false);
    }

    public void renderLevels() {
        this.attack.loadText(new Vector2f(0.79f, 0.497f));
        this.strength.loadText(new Vector2f(0.79f, 0.572f));
        this.defence.loadText(new Vector2f(0.79f, 0.647f));
        this.ranged.loadText(new Vector2f(0.79f, 0.722f));
        this.magic.loadText(new Vector2f(0.79f, 0.797f));
        this.prayer.loadText(new Vector2f(0.79f, 0.872f));
        this.hitpoints.loadText(new Vector2f(0.865f, 0.497f));
        this.herblore.loadText(new Vector2f(0.865f, 0.572f));
        this.crafting.loadText(new Vector2f(0.865f, 0.647f));
        this.fletching.loadText(new Vector2f(0.865f, 0.722f));
        this.slayer.loadText(new Vector2f(0.865f, 0.797f));
        this.runecrafting.loadText(new Vector2f(0.865f, 0.872f));
        this.mining.loadText(new Vector2f(0.95f, 0.497f));
        this.smithing.loadText(new Vector2f(0.95f, 0.572f));
        this.fishing.loadText(new Vector2f(0.95f, 0.647f));
        this.cooking.loadText(new Vector2f(0.95f, 0.722f));
        this.woodcutting.loadText(new Vector2f(0.95f, 0.797f));
        this.firemaking.loadText(new Vector2f(0.95f, 0.872f));
    }

    // TODO create a background for each skill
    public void renderPanel() {
        this.attack.loadTexture(new Vector2f(0.52f, -0.03f));
        this.strength.loadTexture(new Vector2f(0.52f, -0.18f));
        this.defence.loadTexture(new Vector2f(0.52f, -0.33f));
        this.ranged.loadTexture(new Vector2f(0.52f, -0.48f));
        this.magic.loadTexture(new Vector2f(0.52f, -0.63f));
        this.prayer.loadTexture(new Vector2f(0.52f, -0.78f));
        this.hitpoints.loadTexture(new Vector2f(0.68f, -0.03f));
        this.herblore.loadTexture(new Vector2f(0.68f, -0.18f));
        this.crafting.loadTexture(new Vector2f(0.68f, -0.33f));
        this.fletching.loadTexture(new Vector2f(0.68f, -0.48f));
        this.slayer.loadTexture(new Vector2f(0.68f, -0.63f));
        this.runecrafting.loadTexture(new Vector2f(0.68f, -0.78f));
        this.mining.loadTexture(new Vector2f(0.84f, -0.03f));
        this.smithing.loadTexture(new Vector2f(0.84f, -0.18f));
        this.fishing.loadTexture(new Vector2f(0.84f, -0.33f));
        this.cooking.loadTexture(new Vector2f(0.84f, -0.48f));
        this.woodcutting.loadTexture(new Vector2f(0.84f, -0.63f));
        this.firemaking.loadTexture(new Vector2f(0.84f, -0.78f));

        renderLevels();
    }

    public void clearLevels() {
        this.attack.removeText();
        this.strength.removeText();
        this.defence.removeText();
        this.ranged.removeText();
        this.magic.removeText();
        this.prayer.removeText();
        this.hitpoints.removeText();
        this.herblore.removeText();
        this.crafting.removeText();
        this.fletching.removeText();
        this.slayer.removeText();
        this.runecrafting.removeText();
        this.mining.removeText();
        this.smithing.removeText();
        this.fishing.removeText();
        this.cooking.removeText();
        this.woodcutting.removeText();
        this.firemaking.removeText();
    }

    public void clearPanel() {
        if (this.attack.getTexture() == null) {
            return;
        }

        Main.GUIS.remove(this.attack.getTexture());
        Main.GUIS.remove(this.strength.getTexture());
        Main.GUIS.remove(this.defence.getTexture());
        Main.GUIS.remove(this.ranged.getTexture());
        Main.GUIS.remove(this.prayer.getTexture());
        Main.GUIS.remove(this.magic.getTexture());
        Main.GUIS.remove(this.hitpoints.getTexture());
        Main.GUIS.remove(this.herblore.getTexture());
        Main.GUIS.remove(this.crafting.getTexture());
        Main.GUIS.remove(this.fletching.getTexture());
        Main.GUIS.remove(this.slayer.getTexture());
        Main.GUIS.remove(this.runecrafting.getTexture());
        Main.GUIS.remove(this.mining.getTexture());
        Main.GUIS.remove(this.smithing.getTexture());
        Main.GUIS.remove(this.fishing.getTexture());
        Main.GUIS.remove(this.cooking.getTexture());
        Main.GUIS.remove(this.woodcutting.getTexture());
        Main.GUIS.remove(this.firemaking.getTexture());

        clearLevels();
    }

    public long getTotalXP() {
        return totalXP;
    }

    public int getTotalLevel() {
        return totalLevel;
    }

    public Skill getAttack() {
        return attack;
    }

    public Skill getStrength() {
        return strength;
    }

    public Skill getDefence() {
        return defence;
    }

    public Skill getRanged() {
        return ranged;
    }

    public Skill getPrayer() {
        return prayer;
    }

    public Skill getMagic() {
        return magic;
    }

    public Skill getHitpoints() {
        return hitpoints;
    }

    public Skill getHerblore() {
        return herblore;
    }

    public Skill getCrafting() {
        return crafting;
    }

    public Skill getFletching() {
        return fletching;
    }

    public Skill getSlayer() {
        return slayer;
    }

    public Skill getRunecrafting() {
        return runecrafting;
    }

    public Skill getMining() {
        return mining;
    }

    public Skill getSmithing() {
        return smithing;
    }

    public Skill getFishing() {
        return fishing;
    }

    public Skill getCooking() {
        return cooking;
    }

    public Skill getWoodcutting() {
        return woodcutting;
    }

    public Skill getFiremaking() {
        return firemaking;
    }
}
