package com.akrotov.aocparser.models.weapons;


public interface Weapon {

    public int attack();

    public static Weapon select (String name) {
        switch (name) {
            case "withTip cold-arms hand" : return new Fist(); //
            case "withTip cold-arms  item_145" : return new Brass();
            case "withTip cold-arms  item_146" : return new Knife();
            case "withTip cold-arms  item_147" : return new Sharpening();
            case "withTip cold-arms  item_148" : return new Bayonet();
            case "withTip cold-arms  item_149" : return new Saber();
            case "withTip cold-arms  item_150" : return new Scimitar();
            case "withTip cold-arms  item_151" : return new Katana();
            case "withTip firearms  item_65" : return new Pistol();
            case "withTip firearms  item_66" : return new Fusee();
            case "withTip firearms  item_67" : return new Musket();
            case "withTip firearms  item_68" : return new Carbine();
            case "withTip firearms  item_69" : return new DoublePistols();
            case "withTip firearms war-uniform item_208" : return new MachineGun();
            case "withTip firearms  item_152" : return new DoubleBarreledRifle();
            case "withTip firearms  item_153" : return new TripleBarreledRifle();
            case "withTip firearms  item_154" : return new SniperRifle();
            default: throw new IllegalArgumentException();
        }
    }

    public static Weapon selectFromDB (String name) {
        try {
            switch (name) {
                case "Fist" : return new Fist ();
                case "Brass" : return new Brass ();
                case "Knife" : return new Knife ();
                case "Sharpening" : return new Sharpening ();
                case "Bayonet" : return new Bayonet ();
                case "Saber" : return new Saber ();
                case "Scimitar" : return new Scimitar ();
                case "Katana" : return new Katana ();
                case "Pistol" : return new Pistol ();
                case "Fusee" : return new Fusee ();
                case "Musket" : return new Musket ();
                case "Carbine" : return new Carbine ();
                case "DoublePistols" : return new DoublePistols ();
                case "MachineGun" : return new MachineGun ();
                case "DoubleBarreledRifle" : return new DoubleBarreledRifle ();
                case "TripleBarreledRifle" : return new TripleBarreledRifle ();
                case "SniperRifle" : return new SniperRifle ();
                default: return null;
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

}
