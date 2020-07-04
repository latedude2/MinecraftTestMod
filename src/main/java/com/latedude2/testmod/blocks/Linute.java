package com.latedude2.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;

public class Linute extends FlowerBlock {
    public Linute(){
        super(Effects.LUCK,20,Properties.create(Material.PLANTS, DyeColor.YELLOW).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT));
        setRegistryName("linute");
    }
}
