package services;

import com.akrotov.aocparser.models.equipment.Jewel;

import java.util.HashMap;
import java.util.Map;

public class JewelService {

    private static Map<String, Jewel> jewelMap = new HashMap<>();

    static {
        for (int i = 0; i < 5; i++) {
            for (Jewel.Stone stone : Jewel.Stone.values()) {
                if (i < 4) {
                    jewelMap.put("Grasp" + stone.toString() + i, new Jewel("Grasp", stone, i));
                }

                //jewelMap.put("DiamondVest" + stone.toString() + i, new Jewel("DiamondVest", stone, i+1));
                //jewelMap.put("DiamondBelt" + stone.toString() + i, new Jewel("DiamondBelt", stone, i+1));

            }
        }
    }


    public static Jewel select(String s) {

        switch (s) {

            // ----------------Перевязь------------------
            case "withTip accessory-baldric  item_158":
                return jewelMap.get("GraspSapphire0");
            case "withTip accessory-baldric  item_178":
                return jewelMap.get("GraspSapphire1");
            case "withTip accessory-baldric  item_179":
                return jewelMap.get("GraspSapphire2");
            case "withTip accessory-baldric  item_180":
                return jewelMap.get("GraspSapphire3");

            case "withTip accessory-baldric  item_159":
                return jewelMap.get("GraspAmethyst0");
            case "withTip accessory-baldric  item_181":
                return jewelMap.get("GraspAmethyst1");
            case "withTip accessory-baldric  item_182":
                return jewelMap.get("GraspAmethyst2");
            case "withTip accessory-baldric  item_183":
                return jewelMap.get("GraspAmethyst3");

            case "withTip accessory-baldric  item_160":
                return jewelMap.get("GraspRuby0");
            case "withTip accessory-baldric  item_184":
                return jewelMap.get("GraspRuby1");
            case "withTip accessory-baldric  item_185":
                return jewelMap.get("GraspRuby2");
            case "withTip accessory-baldric  item_186":
                return jewelMap.get("GraspRuby3");

            case "withTip accessory-baldric  item_161":
                return jewelMap.get("GraspEmerald0");
            case "withTip accessory-baldric  item_187":
                return jewelMap.get("GraspEmerald1");
            case "withTip accessory-baldric  item_188":
                return jewelMap.get("GraspEmerald2");
            case "withTip accessory-baldric  item_189":
                return jewelMap.get("GraspEmerald3");

            case "withTip accessory-baldric  item_162":
                return jewelMap.get("GraspDiamond0");
            case "withTip accessory-baldric  item_190":
                return jewelMap.get("GraspDiamond1");
            case "withTip accessory-baldric  item_191":
                return jewelMap.get("GraspDiamond2");
            case "withTip accessory-baldric  item_192":
                return jewelMap.get("GraspDiamond3");

            // TODO: Проработать нестандартные уркашения
            /*
            // ---------------Алмазная жилетка------------------
            case "withTip accessory-baldric  item_209":
                return jewelMap.get("DiamondVestNULL");
            case "withTip accessory-baldric  item_210":
                return new DiamondVest(2, null);
            case "withTip accessory-baldric  item_211":
                return new DiamondVest(3, null);
            case "withTip accessory-baldric  item_212":
                return new DiamondVest(4, null);
            case "withTip accessory-baldric  item_213":
                return new DiamondVest(5, null);

            // ---------------Алмазный пояс-----------------
            case "withTip accessory-belt  item_214":
                return new DiamondBelt(1, null);
            case "withTip accessory-belt  item_215":
                return new DiamondBelt(2, null);
            case "withTip accessory-belt  item_216":
                return new DiamondBelt(3, null);
            case "withTip accessory-belt  item_217":
                return new DiamondBelt(4, null);
            case "withTip accessory-belt  item_218":
                return new DiamondBelt(5, null);
                */

            default:
                throw new IllegalArgumentException();
        }
    }
}

