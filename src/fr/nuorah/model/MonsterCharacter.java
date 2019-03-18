package fr.nuorah.model;

import fr.nuorah.Utils;

public class MonsterCharacter extends Character{

    public MonsterCharacter(){
        super(Utils.randInt(0, 5),Utils.randInt(0, 5),Utils.randInt(0, 5));
    }
}
