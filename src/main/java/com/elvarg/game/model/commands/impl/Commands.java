package com.elvarg.game.model.commands.impl;

import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.commands.Command;

public class Commands implements Command {

    @Override
    public void execute(Player player, String command, String[] parts) {
        player.getPacketSender().sendMessage("commands," +
                " passwd," +
                " lockxp," +
                " kdr, players");
    }

    @Override
    public boolean canUse(Player player) {
        return true;
    }

}
