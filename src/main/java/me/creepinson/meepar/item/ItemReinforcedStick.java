package me.creepinson.meepar.item;

import me.creepinson.meepar.EnumHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * Created by theo on 7/26/17.
 */
public class ItemReinforcedStick extends Item {

    public ItemReinforcedStick() {
        this.setUnlocalizedName("reinforced_stick");
        this.setRegistryName("reinforced_stick");
        this.setCreativeTab(CreativeTabs.MATERIALS);
        setHasSubtypes(true);
        setMaxDamage(0);

    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        for (int i = 0; i < EnumHandler.Tiers.values().length; i++) {
            if(stack.getItemDamage() == i){
                    return this.getUnlocalizedName() + "_" + EnumHandler.Tiers.values()[i].getName();
            }
            else {
                continue;
            }
        }
        return this.getUnlocalizedName() + "_" + EnumHandler.Tiers.TIER1.getName();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> items) {
        for (int i = 0; i < EnumHandler.Tiers.values().length; i++) {
            items.add(new ItemStack(item, 1, i));
        }
    }




}
