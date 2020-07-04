package com.latedude2.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TestBlock extends Block {
    public TestBlock(){
        super(Properties.create(Material.IRON).sound(SoundType.METAL));
        setRegistryName("testblock");
    }
}
