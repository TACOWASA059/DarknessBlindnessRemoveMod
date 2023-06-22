package com.github.tacowasa059.darkness_remove_mod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.event.ContainerScreenEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Darkness_remove_mod.MODID)
public class DisableEffectHandler {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onClientTickEvent(TickEvent.RenderTickEvent event) {
        Player player=Minecraft.getInstance().player;
        if(player!=null) {
            player.removeEffect(MobEffects.DARKNESS);
            player.removeEffect(MobEffects.BLINDNESS);
        }
    }
//    @OnlyIn(Dist.CLIENT)
//    @SubscribeEvent
//    public static void onMobEffectEventAdded(MobEffectEvent.Added event) {
//        MobEffectInstance instance = event.getEffectInstance();
//        if (instance != null && instance.getEffect() == MobEffects.DARKNESS) {
//            Player player = Minecraft.getInstance().player;
//            if (player.getUUID() == event.getEntity().getUUID()) {
//                if (player != null) player.removeEffect(MobEffects.DARKNESS);
//            }
//        }
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    @SubscribeEvent
//    public static void onMobEffectEventAppicable(MobEffectEvent.Applicable event) {
//        MobEffectInstance instance = event.getEffectInstance();
//        if (instance != null && instance.getEffect() == MobEffects.DARKNESS) {
//            Player player = Minecraft.getInstance().player;
//            if (player.getUUID() == event.getEntity().getUUID()) {
//                if (player != null) player.removeEffect(MobEffects.DARKNESS);
//            }
//        }
//    }

//    public static void register() {
//
//        MinecraftForge.EVENT_BUS.register(DisableEffectHandler.class);
//    }
}
