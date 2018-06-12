package crazypants.enderio.zoo.config;

import crazypants.enderio.base.config.factory.IValue;
import crazypants.enderio.base.config.factory.IValueFactory;

public final class ZooConfig {

  public static final IValueFactory F = Config.F.section("zoo");

  public static final IValueFactory F0 = Config.F.section(".mobs");
  public static final IValueFactory CREEPER = F0.section(".concussion_creeper");

  public static final IValue<Integer> explosionRange = CREEPER.make("explosionRange", 5, //
      "The range of the 'teleport explosion'.").setRange(1, 99).sync();
  public static final IValue<Float> teleportRange = CREEPER.make("teleportRange", 32f, //
      "Sets the max range entites can be telported when the creeper explodes.").setRange(1, 160).sync();
  public static final IValue<Integer> confusionDuration = CREEPER.make("confusionDuration", 100, //
      "Sets the durtaion in ticks of the confusion effect applied on explosion.").setRange(20 * 1, 20 * 30).sync();

  public static final IValueFactory SLIME = F0.section(".dire_slime");

  public static final IValue<Float> direSlime1Health = SLIME.make("direSlime1Health", 4f, //
      "Base health of the Dire Slime (small).").setRange(1, 99).sync();
  public static final IValue<Float> direSlime2Health = SLIME.make("direSlime2Health", 8f, //
      "Base health of the Dire Slime (medium).").setRange(1, 99).sync();
  public static final IValue<Float> direSlime3Health = SLIME.make("direSlime3Health", 20f, //
      "Base health of the Dire Slime (big).").setRange(1, 99).sync();

  public static final IValue<Float> direSlime1AttackDamage = SLIME.make("direSlime1AttackDamage", 3f, //
      "Base attack damage of the Dire Slime (small).").setRange(1, 99).sync();
  public static final IValue<Float> direSlime2AttackDamage = SLIME.make("direSlime2AttackDamage", 5f, //
      "Base attack damage of the Dire Slime (medium).").setRange(1, 99).sync();
  public static final IValue<Float> direSlime3AttackDamage = SLIME.make("direSlime3AttackDamage", 8f, //
      "Base attack damage of the Dire Slime (large).").setRange(1, 99).sync();

  public static final IValue<Float> direSlime1Chance = SLIME.make("direSlime1Chance", .2f, //
      "The chance that a Dire Slime will be spawned (0 = never, 1 = always).").setRange(0, 1).sync();
  public static final IValue<Float> direSlime2Chance = SLIME.make("direSlime2Chance", .4f, //
      "The chance that a medium Dire Slime will spawn when a small Dire Slime is killed (eg 0.12 for a 12% chance).").setRange(0, 1).sync();
  public static final IValue<Float> direSlime3Chance = SLIME.make("direSlime3Chance", .2f, //
      "The chance that a large Dire Slime will spawn when a medium Dire Slime is killed (eg 0.12 for a 12% chance).").setRange(0, 1).sync();

  public static final IValueFactory WOLF = F0.section(".dire_wolf");

  public static final IValue<Boolean> packAttackEnabled = WOLF.make("packAttackEnabled", true, //
      "When true all nearby dire wolves will join an attack.").sync();
  public static final IValue<Integer> packAttackRange = WOLF.make("packAttackRange", 16, //
      "What is 'nearby' for dire wolves to join an attack.").setRange(0, 32).sync();
  public static final IValue<Float> howlVolume = WOLF.make("howlVolumeMultiplier", 8f, //
      "The volume multiplier for the dire wolf's howl.").setRange(0, 99);
  public static final IValue<Float> howlChance = WOLF.make("howlChance", .05f, //
      "The chance a dire wolf will howl when it is asked to play a sound.").setRange(0, 1);
  public static final IValue<Integer> howlPackSize = WOLF.make("howlPackSize", 8, //
      "The amount of other dire wolves that will \"join in\" with the initial howl, per pack howl.").setRange(1, 10);
  public static final IValue<Float> howlPackChance = WOLF.make("howlPackChance", .6f, //
      "The chance that when a dire wolf howls, nearby dire wolves will \"join in\" to a pack howl.").setRange(0, 1);
  public static final IValue<Double> wolfAggressionRange = WOLF.make("aggressionRange", 3d, //
      "If a player gets within this range they will be attacked.").setRange(0, 32).sync();

  public static final IValueFactory MINI = F0.section(".endermini");

  public static final IValue<Boolean> attackPlayers = MINI.make("attackPlayers", false, //
      "When true an Enderminy will attack a player if it looks at them, otherwise they are neutral mobs.").sync();
  public static final IValue<Boolean> attackCreepers = MINI.make("attackCreepers", true, //
      "When true Enderminies will attack creepers.").sync();
  public static final IValue<Boolean> spawnInLitAreas = MINI.make("spawnInLitAreas", false, //
      "When true enderminies will spawn in well lit areas, when false they will only spawn in dark areas.").sync();
  public static final IValue<Boolean> spawnOnlyOnGrass = MINI.make("spawnOnlyOnGrass", true, //
      "When true enderminies will spawn only on (vanilla) grass blocks.").sync();
  public static final IValue<Integer> spawnMinY = MINI.make("spawnMinY", 0, //
      "The minimum Y level at which enderminies will spawn.").setRange(0, 255).sync();
  public static final IValue<Boolean> miniPackAttackEnabled = MINI.make("packAttackEnabled", true, //
      "When true attacking one Enderminy will cause other Enderminies who witness the attack to attack the player as well.").sync();

  public static final IValueFactory KNIGHT = F0.section(".fallen_knight");

  public static final IValue<Double> fallenKnightChargeSpeed = KNIGHT.make("chargeSpeed", 1.2, //
      "The speed at which a knight will charge its target.").setRange(0, 10).sync();
  public static final IValue<Double> fallenKnightFollowRange = KNIGHT.make("followRange", 40.0, //
      "Follow range of a knight.").setRange(0, 10).sync();
  public static final IValue<Integer> fallenKnightRangedMinAttackPause = KNIGHT.make("rangedMinAttackPause", 20, //
      "The min number of ticks between ranged attacks.").setRange(1, 200).sync();
  public static final IValue<Integer> fallenKnightRangedMaxAttackPause = KNIGHT.make("rangedMaxAttackPause", 60, //
      "The max number of ticks between ranged attacks.").setRange(1, 200).sync();
  public static final IValue<Float> fallenKnightRangedMaxRange = KNIGHT.make("rangedMaxRange", 15f, //
      "The max attack range when using a bow.").setRange(1, 200).sync();
  public static final IValue<Boolean> fallKnightMountedArchersMaintainDistance = KNIGHT.make("mountedArchersMaintainDistance", true, //
      "When true mounted archer knights will attempt to keep distance between themselves and their target.").sync();
  public static final IValue<Boolean> fallenKnightArchersSwitchToMelee = KNIGHT.make("archersSwitchToMelee", true, //
      "When true archer knights will switch to a sword when target is within melee range."
          + "Doesn't apply to mounted archers if fallKnightMountedArchersMaintainDistance is true")
      .sync();

  public static final IValueFactory MOUNT = F0.section(".fallen_mount");

  public static final IValue<Double> fallenMountChargeSpeed = MOUNT.make("chargeSpeed", 2.5, //
      "The speed at which a mount will charge its target.").setRange(0, 10).sync();

  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //

}
