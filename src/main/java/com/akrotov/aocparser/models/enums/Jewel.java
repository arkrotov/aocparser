package com.akrotov.aocparser.models.enums;

public enum Jewel {

    GraspWithSapphire_0, GraspWithSapphire_1, GraspWithSapphire_2, GraspWithSapphire_3, // Перевязь с сапфиром
    GraspWithAmethyst_0, GraspWithAmethyst_1, GraspWithAmethyst_2, GraspWithAmethyst_3, // Перевязь с аметистом
    GraspWithRuby_0, GraspWithRuby_1, GraspWithRuby_2, GraspWithRuby_3, // Перевязь с рубином
    GraspWithEmerald_0, GraspWithEmerald_1, GraspWithEmerald_2, GraspWithEmerald_3, // Перевязь с изумрудом
    GraspWithDiamond_0, GraspWithDiamond_1, GraspWithDiamond_2, GraspWithDiamond_3,// Перевязь с бриллиантом
    BeltWithSapphire_0, BeltWithSapphire_1, BeltWithSapphire_2, BeltWithSapphire_3,// Пояс с сапфиром
    BeltWithAmethyst_0, BeltWithAmethyst_1, BeltWithAmethyst_2, BeltWithAmethyst_3,// Пояс с аметистом
    BeltWithRuby_0, BeltWithRuby_1, BeltWithRuby_2, BeltWithRuby_3, BeltWithRuby_4, BeltWithRuby_5,// Пояс с рубином
    BeltWithEmerald_0, BeltWithEmerald_1, BeltWithEmerald_2, BeltWithEmerald_3,// Пояс с изумрудом
    BeltWithDiamond_0, BeltWithDiamond_1, BeltWithDiamond_2, BeltWithDiamond_3,// Пояс с бриллиантом
    BraceletWithSapphire_0, BraceletWithSapphire_1, BraceletWithSapphire_2, BraceletWithSapphire_3,// Браслет с сапфиром
    BraceletWithAmethyst_0, BraceletWithAmethyst_1, BraceletWithAmethyst_2, BraceletWithAmethyst_3, // Браслет с аметистом
    BraceletWithRuby_0, BraceletWithRuby_1, BraceletWithRuby_2, BraceletWithRuby_3,// Браслет с рубином
    BraceletWithEmerald_0, BraceletWithEmerald_1, BraceletWithEmerald_2, BraceletWithEmerald_3,// Браслет с изумрудом
    BraceletWithDiamond_0, BraceletWithDiamond_1, BraceletWithDiamond_2, BraceletWithDiamond_3,// Браслет с бриллиантом
    ChainWithSapphire_0, ChainWithSapphire_1, ChainWithSapphire_2, ChainWithSapphire_3,// Цепь с сапфиром
    ChainWithAmethyst_0, ChainWithAmethyst_1, ChainWithAmethyst_2, ChainWithAmethyst_3,// Цепь с аметистом
    ChainWithRuby_0, ChainWithRuby_1, ChainWithRuby_2, ChainWithRuby_3,// Цепь с рубином
    ChainWithEmerald_0, ChainWithEmerald_1, ChainWithEmerald_2, ChainWithEmerald_3,// Цепь с изумрудом
    ChainWithDiamond_0, ChainWithDiamond_1, ChainWithDiamond_2, ChainWithDiamond_3,// Цепь с бриллиантом
    DiamondVest_1, DiamondVest_2, DiamondVest_3, DiamondVest_4, DiamondVest_5, // Алмазная жилетка
    DiamondBelt_1, DiamondBelt_2, DiamondBelt_3, DiamondBelt_4, DiamondBelt_5; // Алмазная пояс


    public static Jewel select (String name) {
        switch (name) {

            // ----------------Перевязь------------------
            case "withTip accessory-baldric  item_158": return GraspWithSapphire_0;
            case "withTip accessory-baldric  item_178": return GraspWithSapphire_1;
            case "withTip accessory-baldric  item_179": return GraspWithSapphire_2;
            case "withTip accessory-baldric  item_180": return GraspWithSapphire_3;

            case "withTip accessory-baldric  item_159" : return GraspWithAmethyst_0;
            case "withTip accessory-baldric  item_181" : return GraspWithAmethyst_1;
            case "withTip accessory-baldric  item_182" : return GraspWithAmethyst_2;
            case "withTip accessory-baldric  item_183" : return GraspWithAmethyst_3;

            case "withTip accessory-baldric  item_160" : return GraspWithRuby_0;
            case "withTip accessory-baldric  item_184" : return GraspWithRuby_1;
            case "withTip accessory-baldric  item_185" : return GraspWithRuby_2;
            case "withTip accessory-baldric  item_186" : return GraspWithRuby_3;

            case "withTip accessory-baldric  item_161" : return GraspWithEmerald_0;
            case "withTip accessory-baldric  item_187" : return GraspWithEmerald_1;
            case "withTip accessory-baldric  item_188" : return GraspWithEmerald_2;
            case "withTip accessory-baldric  item_189" : return GraspWithEmerald_3;

            case "withTip accessory-baldric  item_162" : return GraspWithDiamond_0;
            case "withTip accessory-baldric  item_190" : return GraspWithDiamond_1;
            case "withTip accessory-baldric  item_191" : return GraspWithDiamond_2;
            case "withTip accessory-baldric  item_192" : return GraspWithDiamond_3;

//            // ------------------Пояс---------------
//            case "withTip accessory-belt  item_" : return BeltWithSapphire_0;
//            case "withTip accessory-belt  item_193" : return BeltWithSapphire_1;
//            case "withTip accessory-belt  item_194" : return BeltWithSapphire_2;
//            case "withTip accessory-belt  item_195" : return BeltWithSapphire_3;
//
//            case "withTip accessory-belt  item_" : return BeltWithAmethyst_0;
//            case "withTip accessory-belt  item_196" : return BeltWithAmethyst_1;
//            case "withTip accessory-belt  item_197" : return BeltWithAmethyst_2;
//            case "withTip accessory-belt  item_198" : return BeltWithAmethyst_3;
//
//            case "withTip accessory-belt  item_" : return BeltWithRuby_0;
//            case "withTip accessory-belt  item_199" : return BeltWithRuby_1;
//            case "withTip accessory-belt  item_200" : return BeltWithRuby_2;
//            case "withTip accessory-belt  item_201" : return BeltWithRuby_3;
//
//            case "withTip accessory-belt  item_" : return BeltWithEmerald_0;
//            case "withTip accessory-belt  item_202" : return BeltWithEmerald_1;
//            case "withTip accessory-belt  item_203" : return BeltWithEmerald_2;
//            case "withTip accessory-belt  item_204" : return BeltWithEmerald_3;
//
//            case "withTip accessory-belt  item_" : return BeltWithDiamond_0;
//            case "withTip accessory-belt  item_205" : return BeltWithDiamond_1;
//            case "withTip accessory-belt  item_206" : return BeltWithDiamond_2;
//            case "withTip accessory-belt  item_207" : return BeltWithDiamond_3;


//            // -----------------Браслеты----------------------
//            case "" : return BraceletWithSapphire_0;
//            case "" : return BraceletWithSapphire_1;
//            case "" : return BraceletWithSapphire_2;
//            case "" : return BraceletWithSapphire_3;
//
//            case "" : return BraceletWithAmethyst_0;
//            case "" : return BraceletWithAmethyst_1;
//            case "" : return BraceletWithAmethyst_2;
//            case "" : return BraceletWithAmethyst_3;
//
//            case "" : return BraceletWithRuby_0;
//            case "" : return BraceletWithRuby_1;
//            case "" : return BraceletWithRuby_2;
//            case "" : return BraceletWithRuby_3;
//
//            case "" : return BraceletWithEmerald_0;
//            case "" : return BraceletWithEmerald_1;
//            case "" : return BraceletWithEmerald_2;
//            case "" : return BraceletWithEmerald_3;
//
//            case "" : return BraceletWithDiamond_0;
//            case "" : return BraceletWithDiamond_1;
//            case "" : return BraceletWithDiamond_2;
//            case "" : return BraceletWithDiamond_3;


//            //----------------------Цепь-----------------------
//            case "" : return ChainWithSapphire_0;
//            case "" : return ChainWithSapphire_1;
//            case "" : return ChainWithSapphire_2;
//            case "" : return ChainWithSapphire_3;
//
//            case "" : return ChainWithAmethyst_0;
//            case "" : return ChainWithAmethyst_1;
//            case "" : return ChainWithAmethyst_2;
//            case "" : return ChainWithAmethyst_3;
//
//            case "" : return ChainWithRuby_0;
//            case "" : return ChainWithRuby_1;
//            case "" : return ChainWithRuby_2;
//            case "" : return ChainWithRuby_3;
//
//            case "" : return ChainWithEmerald_0;
//            case "" : return ChainWithEmerald_1;
//            case "" : return ChainWithEmerald_2;
//            case "" : return ChainWithEmerald_3;
//
//            case "" : return ChainWithDiamond_0;
//            case "" : return ChainWithDiamond_1;
//            case "" : return ChainWithDiamond_2;
//            case "" : return ChainWithDiamond_3;


            // ---------------Алмазная жилетка------------------
            case "withTip accessory-baldric  item_209": return DiamondVest_1;
            case "withTip accessory-baldric  item_210": return DiamondVest_2;
            case "withTip accessory-baldric  item_211": return DiamondVest_3;
            case "withTip accessory-baldric  item_212": return DiamondVest_4;
            case "withTip accessory-baldric  item_213": return DiamondVest_5;

            // ---------------Алмазный пояс-----------------
            case "withTip accessory-belt  item_214": return DiamondBelt_1;
            case "withTip accessory-belt  item_215": return DiamondBelt_2;
            case "withTip accessory-belt  item_216": return DiamondBelt_3;
            case "withTip accessory-belt  item_217": return DiamondBelt_4;
            case "withTip accessory-belt  item_218": return DiamondBelt_5;
            /*

             */
            default: throw new IllegalArgumentException();
        }
    }

    public static Jewel selectFromDB (String name) {
        switch (name) {
            case "GraspWithSapphire_0" : return GraspWithSapphire_0;
            case "GraspWithSapphire_1" : return GraspWithSapphire_1;
            case "GraspWithSapphire_2" : return GraspWithSapphire_2;
            case "GraspWithSapphire_3" : return GraspWithSapphire_3;
            case "GraspWithAmethyst_0" : return GraspWithAmethyst_0;
            case "GraspWithAmethyst_1" : return GraspWithAmethyst_1;
            case "GraspWithAmethyst_2" : return GraspWithAmethyst_2;
            case "GraspWithAmethyst_3" : return GraspWithAmethyst_3;
            case "GraspWithRuby_0" : return GraspWithRuby_0;
            case "GraspWithRuby_1" : return GraspWithRuby_1;
            case "GraspWithRuby_2" : return GraspWithRuby_2;
            case "GraspWithRuby_3" : return GraspWithRuby_3;
            case "GraspWithEmerald_0" : return GraspWithEmerald_0;
            case "GraspWithEmerald_1" : return GraspWithEmerald_1;
            case "GraspWithEmerald_2" : return GraspWithEmerald_2;
            case "GraspWithEmerald_3" : return GraspWithEmerald_3;
            case "GraspWithDiamond_0" : return GraspWithDiamond_0;
            case "GraspWithDiamond_1" : return GraspWithDiamond_1;
            case "GraspWithDiamond_2" : return GraspWithDiamond_2;
            case "GraspWithDiamond_3" : return GraspWithDiamond_3;
            case "DiamondVest_1" : return DiamondVest_1;
            case "DiamondVest_2" : return DiamondVest_2;
            case "DiamondVest_3" : return DiamondVest_3;
            case "DiamondVest_4" : return DiamondVest_4;
            case "DiamondVest_5" : return DiamondVest_5;
            case "DiamondBelt_1" : return DiamondBelt_1;
            case "DiamondBelt_2" : return DiamondBelt_2;
            case "DiamondBelt_3" : return DiamondBelt_3;
            case "DiamondBelt_4" : return DiamondBelt_4;
            case "DiamondBelt_5" : return DiamondBelt_5;
            default: return null;
        }
    }
}
