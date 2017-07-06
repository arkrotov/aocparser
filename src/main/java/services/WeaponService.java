package services;

import com.akrotov.aocparser.models.equipment.ColdWeapon;
import com.akrotov.aocparser.models.equipment.HotWeapon;
import com.akrotov.aocparser.models.equipment.Weapon;

import java.util.HashMap;
import java.util.Map;


// TODO: Отпарсить и добавить в конструктор значение прочности оружия
public class WeaponService {

    private static Map<String, Weapon> weaponMap = new HashMap<>();

    static {
        weaponMap.put("Fist", new ColdWeapon("Fist", 0, 0, 0, 1, 1));
        weaponMap.put("BrassKnuckles", new ColdWeapon("BrassKnuckles",10, 20, 0, 1, 1));
        weaponMap.put("Knife", new ColdWeapon("Knife", 18, 30, 0, 1, 0));
        weaponMap.put("Sharprening", new ColdWeapon("Sharprening", 15, 25, 0, 1, 0));
        weaponMap.put("Bayonet", new ColdWeapon("Bayonet", 20, 40, 0, 1, 0));
        weaponMap.put("Saber", new ColdWeapon("Saber", 22, 45 , 0, 1, 0));
        weaponMap.put("Scimitar", new ColdWeapon("Scimitar", 18, 28, 0, 2, 10));
        weaponMap.put("Katana", new ColdWeapon("Katana", 55, 70, 0, 1, 15));
        weaponMap.put("Pistol", new HotWeapon("Pistol", 10, 20, 0, 1, 1, 5));
        weaponMap.put("Fusee", new HotWeapon("Fusee", 15, 25, 0, 1, 1, 6));
        weaponMap.put("Musket", new HotWeapon("Musket", 18, 30 ,0, 1, 1, 7));
        weaponMap.put("Carbine", new HotWeapon("Carbine", 20,40, 0, 1, 1,8));
        weaponMap.put("DoublePistols", new HotWeapon("DoublePistol", 22, 45, 0, 1, 1, 10));
        weaponMap.put("MachineGun", new HotWeapon("MachineGun", 7, 20, 0, 6, 1, 40));
        weaponMap.put("DoubleBarreledRifle", new HotWeapon("DoubleBarreledRifle", 13, 25, 0, 2, 1, 20));
        weaponMap.put("TripleBarreledRifle", new HotWeapon("TripleBarreledRifle", 14 , 22, 0, 3, 7, 30));
        weaponMap.put("SniperRifle", new HotWeapon("SniperRifle", 35, 60, 0, 1, 25, 15));
    }

    public static Weapon getWeapon (String name) {
        switch (name) {
            case "withTip cold-arms hand" : return weaponMap.get("Fist");
            case "withTip cold-arms  item_145" : return weaponMap.get("BrassKnuckles");
            case "withTip cold-arms  item_146" : return weaponMap.get("Knife");
            case "withTip cold-arms  item_147" : weaponMap.get("Sharpening");
            case "withTip cold-arms  item_148" : return weaponMap.get("Bayonet");
            case "withTip cold-arms  item_149" : return weaponMap.get("Saber");
            case "withTip cold-arms  item_150" : return weaponMap.get("Scimitar");
            case "withTip cold-arms  item_151" : return weaponMap.get("Katana");
            case "withTip firearms  item_65" : return weaponMap.get("Pistol");
            case "withTip firearms  item_66" : return weaponMap.get("Fusee");
            case "withTip firearms  item_67" : return weaponMap.get("Musket");
            case "withTip firearms  item_68" : return weaponMap.get("Carbine");
            case "withTip firearms  item_69" : return weaponMap.get("DoublePistols");
            case "withTip firearms war-uniform item_208" : weaponMap.get("new MachineGun");
            case "withTip firearms  item_152" : return weaponMap.get("DoubleBarreledRifle");
            case "withTip firearms  item_153" : return weaponMap.get("TripleBarreledRifle");
            case "withTip firearms  item_154" : return weaponMap.get("SniperRifle");
            default: throw new IllegalArgumentException();
        }
    }

    public static Weapon getWeaponFromDB (String name) {
        return weaponMap.get(name);
    }
}
