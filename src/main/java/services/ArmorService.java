package services;

import com.akrotov.aocparser.models.equipment.Armor;

import java.util.HashMap;
import java.util.Map;

public class ArmorService {

    private static Map<String, Armor> armorMap = new HashMap<>();

    // TODO: Добавить показатель защиты брони
    static {
        armorMap.put("Cloak", new Armor("Cloak", 0, 0));
        armorMap.put("Jacket", new Armor("Jaket", 0, 0));
        armorMap.put("Vest", new Armor("Vest", 0, 0));
        armorMap.put("SamuraiCloak", new Armor("SamuraiCloak", 0,0 ));
    }

    public static Armor getArmor(String name) {
        switch (name) {
            case "withTip armor-plating  item_155" : return  armorMap.get("Cloak");
            case "withTip armor-plating  item_156" : return armorMap.get("Jacket");
            case "withTip armor-plating  item_157" : return armorMap.get("Vest");
            case "withTip armor-plating  item_219" : return armorMap.get("SamuraiCloak");
            default: throw new IllegalArgumentException();
        }
    }

    // TODO: Смоделировать таблицы в базе так, чтобы учитывалась прочность и защита
    public static Armor getArmorFromDB(String name) {
        return armorMap.get(name);
    }
}
