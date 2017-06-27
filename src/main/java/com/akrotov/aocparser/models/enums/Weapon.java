package com.akrotov.aocparser.models.enums;

public enum Weapon {
    Fist, //кулак
    Brass, //кастет
    Knife,  //нож
    Sharpening, //заточка
    Bayonet, // Штык
    Saber, // Сабля
    Scimitar, // Ятаган
    Katana, // Катана

    Pistol, // Пистолет
    Fusee, // Фузея
    Musket, // Мушкет
    Carbine, // Карабин
    DoublePistols, // Пистолеты
    MachineGun, // Пулемет
    DoubleBarreledRifle, // Двуствольная винтовка
    TripleBarreledRifle, // Трехствольная винтовка
    SniperRifle; // Снайперская винтовка;

    public static Weapon select (String name) {
        switch (name) {
            case "withTip cold-arms hand" : return Fist; //
            case "withTip cold-arms  item_145" : return Brass;
            case "withTip cold-arms  item_146" : return Knife;
            case "withTip cold-arms  item_147" : return Sharpening;
            case "withTip cold-arms  item_148" : return Bayonet;
            case "withTip cold-arms  item_149" : return Saber;
            case "withTip cold-arms  item_150" : return Scimitar;
            case "withTip cold-arms  item_151" : return Katana;
            case "withTip firearms  item_65" : return Pistol;
            case "withTip firearms  item_66" : return Fusee;
            case "withTip firearms  item_67" : return Musket;
            case "withTip firearms  item_68" : return Carbine;
            case "withTip firearms  item_69" : return DoublePistols;
            case "withTip firearms war-uniform item_208" : return MachineGun;
            case "withTip firearms  item_152" : return DoubleBarreledRifle;
            case "withTip firearms  item_153" : return TripleBarreledRifle;
            case "withTip firearms  item_154" : return SniperRifle;
            default: throw new IllegalArgumentException();
        }
    }

    public static Weapon selectFromDB (String name) {
        try {
            switch (name) {
                case "Fist" : return Fist;
                case "Brass" : return Brass;
                case "Knife" : return Knife;
                case "Sharpening" : return Sharpening;
                case "Bayonet" : return Bayonet;
                case "Saber" : return Saber;
                case "Scimitar" : return Scimitar;
                case "Katana" : return Katana;
                case "Pistol" : return Pistol;
                case "Fusee" : return Fusee;
                case "Musket" : return Musket;
                case "Carbine" : return Carbine;
                case "DoublePistols" : return DoublePistols;
                case "MachineGun" : return MachineGun;
                case "DoubleBarreledRifle" : return DoubleBarreledRifle;
                case "TripleBarreledRifle" : return TripleBarreledRifle;
                case "SniperRifle" : return SniperRifle;
                default: return null;
            }
        } catch (NullPointerException e) {
            return null;
        }

    }

}
