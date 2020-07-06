package com.latedude2.testmod.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Linute extends FlowerBlock {
    public Linute(){
        super(Effects.LUCK,20,Properties.create(Material.PLANTS, DyeColor.YELLOW).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT).notSolid().lightValue(14));
        setRegistryName("linute");
    }

}
