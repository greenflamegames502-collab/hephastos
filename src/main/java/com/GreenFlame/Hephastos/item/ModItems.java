package com.GreenFlame.Hephastos.item;

import com.GreenFlame.Hephastos.Hephastos;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Hephastos.MOD_ID);

    public static final DeferredItem<Item> URAN = ITEMS.register("uran",
            ()->new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
