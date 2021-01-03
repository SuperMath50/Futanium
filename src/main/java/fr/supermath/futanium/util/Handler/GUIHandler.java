package fr.supermath.futanium.util.Handler;

import fr.supermath.futanium.objects.blocks.machines.oven.ContainerOven;
import fr.supermath.futanium.objects.blocks.machines.oven.GuiOven;
import fr.supermath.futanium.objects.blocks.machines.oven.TileEntityOven;
import fr.supermath.futanium.objects.blocks.machines.seed.ContainerSeed;
import fr.supermath.futanium.objects.blocks.machines.seed.GuiSeed;
import fr.supermath.futanium.objects.blocks.machines.seed.TileEntitySeed;
import fr.supermath.futanium.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {

        if(ID == Reference.GUI_OVEN)
        {
            return new ContainerOven(player.inventory, (TileEntityOven) world.getTileEntity(new BlockPos(x, y, z)));
        }
        if(ID == Reference.SEED)
        {
            return new ContainerSeed(player.inventory, (TileEntitySeed) world.getTileEntity(new BlockPos(x, y, z)));
        }

        return null;
    }


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {

        if(ID == Reference.GUI_OVEN)
        {
            return new GuiOven(player.inventory, (TileEntityOven) world.getTileEntity(new BlockPos(x, y, z)));
        }
        if(ID == Reference.SEED)
        {
            return new GuiSeed(player.inventory, (TileEntitySeed) world.getTileEntity(new BlockPos(x, y, z)));
        }

        return null;
    }

}
