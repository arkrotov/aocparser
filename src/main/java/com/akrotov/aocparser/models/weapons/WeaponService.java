package com.akrotov.aocparser.models.weapons;

import com.akrotov.aocparser.models.weapons.cold.*;
import com.akrotov.aocparser.models.weapons.hot.*;


// TODO: Отпарсить и добавить в конструктор значение прочности оружия
public class WeaponService {

    public static Weapon getWeapon (String name) {
        switch (name) {
            case "withTip cold-arms hand" : return new Fist(0); //
            case "withTip cold-arms  item_145" : return new BrassKnuckles(0);
            case "withTip cold-arms  item_146" : return new Knife(0);
            case "withTip cold-arms  item_147" : return new Sharpening(0);
            case "withTip cold-arms  item_148" : return new Bayonet(0);
            case "withTip cold-arms  item_149" : return new Saber(0);
            case "withTip cold-arms  item_150" : return new Scimitar(0);
            case "withTip cold-arms  item_151" : return new Katana(0);
            case "withTip firearms  item_65" : return new Pistol(0);
            case "withTip firearms  item_66" : return new Fusee(0);
            case "withTip firearms  item_67" : return new Musket(0);
            case "withTip firearms  item_68" : return new Carbine(0);
            case "withTip firearms  item_69" : return new DoublePistols(0);
            case "withTip firearms war-uniform item_208" : return new MachineGun(0);
            case "withTip firearms  item_152" : return new DoubleBarreledRifle(0);
            case "withTip firearms  item_153" : return new TripleBarreledRifle(0);
            case "withTip firearms  item_154" : return new SniperRifle(0);
            default: throw new IllegalArgumentException();
        }
    }

    public static Weapon getWeaponFromDB (String name) {
        try {
            switch (name) {
                case "Fist" : return new Fist (0);
                case "BrassKnuckles" : return new BrassKnuckles(0);
                case "Knife" : return new Knife (0);
                case "Sharpening" : return new Sharpening (0);
                case "Bayonet" : return new Bayonet (0);
                case "Saber" : return new Saber (0);
                case "Scimitar" : return new Scimitar (0);
                case "Katana" : return new Katana (0);
                case "Pistol" : return new Pistol (0);
                case "Fusee" : return new Fusee (0);
                case "Musket" : return new Musket (0);
                case "Carbine" : return new Carbine (0);
                case "DoublePistols" : return new DoublePistols (0);
                case "MachineGun" : return new MachineGun (0);
                case "DoubleBarreledRifle" : return new DoubleBarreledRifle (0);
                case "TripleBarreledRifle" : return new TripleBarreledRifle (0);
                case "SniperRifle" : return new SniperRifle (0);
                default: return null;
            }
        } catch (NullPointerException e) {
            return null;
        }
    }
}
