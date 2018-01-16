package com.theaudiobros.gabriel.mars;

import com.theaudiobros.gabriel.masa.MASA;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.generator.BlockPopulator;

import java.util.*;

public class OrePopulator extends BlockPopulator{

    private static List<BlockFace> faces = Arrays.asList(BlockFace.values());

    private MASA pl;
    private ArrayList<GENERATED_BLOCK> toGenerate;

    public OrePopulator(MASA pl) {
        this.pl = pl;
        toGenerate = GENERATED_BLOCK.fromConfig();
    }

    @Override
    public void populate(World world, Random random, Chunk chunk) {
        Map<Location, GENERATED_BLOCK> ore = new HashMap<>();

        for (GENERATED_BLOCK p : toGenerate) {
            for (int i = 0; i < p.count; i++) {
                int x = random.nextInt(16);
                int y = random.nextInt(p.max - p.min) + p.min;
                int z = random.nextInt(16);
                Location loc = new Location(world, x, y, z);
                ore.put(loc, p);

                // max size is 16
                int size = new Random().nextInt(16);

                for (int i1 = 0; i1 < size; i1++) {
                    ore.put(getRandomLocation(world.getBlockAt(loc), random).getLocation(), p);
                }
            }
        }

        for (Location loc : ore.keySet()) {
            Block cb = chunk.getBlock(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
            if (cb.getType() == Material.STAINED_CLAY) {
                GENERATED_BLOCK gb = ore.get(loc);
                if (gb.data == 0)
                    cb.setType(gb.mat);
                else {
                    cb.setType(gb.mat);
                    cb.setData((byte) gb.data);
                }
            }
        }
    }

    private Block getRandomLocation(Block block, Random rand) {
        int randy = rand.nextInt(19);

        return block.getRelative(faces.get(randy));
    }

    static class GENERATED_BLOCK {

        private final int count;
        private final int min;
        private final int max;
        private final Material mat;
        private final int data;

        GENERATED_BLOCK(int count, int min, int max, Material mat) {
            this.count = count;
            this.min = min;
            this.max = max;
            this.mat = mat;
            data = 0;
        }

        GENERATED_BLOCK(int count, int min, int max, Material mat, int data) {
            this.count = count;
            this.min = min;
            this.max = max;
            this.mat = mat;
            this.data = data;
        }

        static ArrayList<GENERATED_BLOCK> fromConfig() {
            ArrayList<String> list = new ArrayList<String>();

            list.add("LAVA:4:1:12");
            list.add("PACKED_ICE:10:1:6");
            list.add("IRON_ORE:20:1:60");
            list.add("REDSTONE_ORE:4:1:15");

            ArrayList<GENERATED_BLOCK> generated_blocks = new ArrayList<>();
            for (String s : list) {
                String[] split = s.split(":");
                if (split.length == 4) {
                    Material mat = Material.getMaterial(split[0]);
                    int chance = Integer.valueOf(split[1]);
                    int min = Integer.valueOf(split[2]);
                    int max = Integer.valueOf(split[3]);
                    generated_blocks.add(new GENERATED_BLOCK(chance, min, max, mat));
                } else if (split.length == 5) {
                    Material mat = Material.getMaterial(split[0]);
                    int data = Integer.valueOf(split[1]);
                    int chance = Integer.valueOf(split[2]);
                    int min = Integer.valueOf(split[3]);
                    int max = Integer.valueOf(split[4]);
                    generated_blocks.add(new GENERATED_BLOCK(chance, min, max, mat, data));
                }
            }
            return generated_blocks;
        }
    }

}
