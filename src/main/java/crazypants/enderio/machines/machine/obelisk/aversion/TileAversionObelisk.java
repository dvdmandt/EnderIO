package crazypants.enderio.machines.machine.obelisk.aversion;

import crazypants.enderio.base.machine.baselegacy.SlotDefinition;
import crazypants.enderio.machines.init.MachineObject;
import crazypants.enderio.machines.machine.obelisk.spawn.TileEntityAbstractSpawningObelisk;
import info.loenwind.autosave.annotations.Storable;
import net.minecraft.entity.EntityLivingBase;

import static crazypants.enderio.base.capacitor.CapacitorKey.*;

import javax.annotation.Nonnull;

@Storable
public class TileAversionObelisk extends TileEntityAbstractSpawningObelisk {

  public TileAversionObelisk() {
    super(new SlotDefinition(12, 0), LEGACY_ENERGY_INTAKE,LEGACY_ENERGY_BUFFER, LEGACY_ENERGY_USE);
  }
  
  @Override
  public @Nonnull String getMachineName() {
    return MachineObject.block_aversion_obelisk.getUnlocalisedName();
  }

  @Override
  public Result isSpawnPrevented(EntityLivingBase mob) {
    return (redstoneCheckPassed && hasPower() && isMobInRange(mob) && isMobInFilter(mob)) ? Result.DENY : Result.NEXT;
  }

  @Override
  public SpawnObeliskAction getSpawnObeliskAction() {
    return SpawnObeliskAction.AVERT;
  }

}
