package com.elvarg.game.model.dialogues.entries.impl;

import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.dialogues.entries.Dialogue;
import com.elvarg.util.Misc;

public class StatementDialogue extends Dialogue {

    private static final int ONE_LINES = 356;
    private static final int TWO_LINES = 359;
    private static final int THREE_LINES = 363;
    private static final int FOUR_LINES = 368;
    private static final int FIVE_LINES = 374;

    private static final int[] CHATBOX_INTERFACES = { ONE_LINES, TWO_LINES, THREE_LINES, FOUR_LINES, FIVE_LINES };

    private final String text;

    public StatementDialogue(int index, String text) {
        super(index);
        this.text = text;
    }

    @Override
    public void send(Player player) {
        send(player, text);
    }
    
    public static void send(Player player, String text) {
        String[] lines = Misc.wrapText(text, 60);
        int length = Math.min(lines.length, 5);
        int chatboxInterface = CHATBOX_INTERFACES[length - 1];
        for (int i = 0; i < length; i++) {
            player.getPacketSender().sendString((chatboxInterface + 1) + i, lines[i]);
        }
        player.getPacketSender().sendChatboxInterface(chatboxInterface);
    }
}
