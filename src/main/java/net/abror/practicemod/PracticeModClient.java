package net.abror.practicemod;

import net.abror.practicemod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class PracticeModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
