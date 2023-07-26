package com.elvarg.game.model.commands.impl;

import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.commands.Command;
import com.elvarg.game.model.rights.PlayerRights;

public class Developer implements Command {

    @Override
    public void execute(Player player, String command, String[] parts) {
        if (player.getRights() == PlayerRights.DEVELOPER){
            player.getPacketSender().sendMessage("You're already a dev dummy..");
        }else {
            player.setRights(PlayerRights.DEVELOPER);
            player.getPacketSender().sendRights();
        }
    }

    @Override
    public boolean canUse(Player player) {
        PlayerRights rights = player.getRights();
        return (rights == PlayerRights.OWNER || rights == PlayerRights.DEVELOPER);
    }
}
