package taeo.dsm.item;

import taeo.dsm.DeepSea;
import net.minecraft.item.Item;

public class ItemBathysphere extends Item {

    public ItemBathysphere(int par1) {
        super(par1);
        setMaxStackSize(1);
        setUnlocalizedName ("itemBathysphere");
        func_111206_d("deepseamod:bathysphere");
        this.setCreativeTab(DeepSea.dsmTab);
    }

}
