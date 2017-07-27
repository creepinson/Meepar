package me.creepinson.meepar;

import net.minecraft.util.IStringSerializable;

/**
 * Created by theo on 7/26/17.
 */
public class EnumHandler {

    public static enum Tiers implements IStringSerializable {
        TIER1("1", 0),
        TIER2("2", 1);

        private int id;
        private String name;

        private Tiers(String name, int id){

            this.name = name;
            this.id = id;


        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return getName();
        }
    }

}
