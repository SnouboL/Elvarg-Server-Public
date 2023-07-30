package com.elvarg.game.model.commands.impl;

import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.commands.Command;
import com.elvarg.game.model.rights.PlayerRights;

public class InfiniteRun implements Command {

    @Override
    public void execute(Player player, String command, String[] parts) {
        player.setRunEnergy(1333333337);

        player.getPacketSender().sendMessage("Run energy at: " + player.getRunEnergy());
    }

    @Override
    public boolean canUse(Player player) {
        PlayerRights rights = player.getRights();
        return rights == PlayerRights.OWNER || rights == PlayerRights.DEVELOPER;
    }
}
