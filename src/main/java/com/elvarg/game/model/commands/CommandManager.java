package com.elvarg.game.model.commands;

import java.util.HashMap;
import java.util.Map;

import com.elvarg.Server;
import com.elvarg.game.model.commands.impl.*;

public class CommandManager {

    public static final Map<String, Command> commands = new HashMap<>();
    
    private static void put(Command command, String... keys) {
        for (String key : keys) {
            commands.put(key, command);
        }
    }
    
    public static void loadCommands() {
        commands.clear();
        
        /**
         * Players Command
         */
        put(new ChangePassword(), "changepassword", "cpw");
        put(new LockExperience(), "lockxp");
        put(new Claim(), "claim");
        put(new CreationDate(), "creationdate");
        put(new Kdr(), "kdr");
        put(new Players(), "players");
        put(new OpenThread(), "thread");
        put(new TimePlayed(), "timeplayed");
        put(new Store(), "store", "donate");

        /**
         * Donators Command
         */
        put(new Yell(), "yell");
        put(new Skull(), "skull", "redskull");

        /**
         * Moderators Commands
         */
        put(new MutePlayer(), "mute");
        put(new UnMutePlayer(), "unmute");
        put(new IpMutePlayer(), "ipmute");
        put(new BanPlayer(), "ban");
        put(new IpBanPlayer(), "ipban");
        put(new UnBanPlayer(), "unban");
        put(new UnIpMutePlayer(), "unipmute");
        put(new TeleToPlayer(), "teleto");
        put(new ExitClient(), "exit");
        put(new KickPlayer(), "kick");

        /**
         * Administrator Commands
         */
        put(new ReloadItems(), "reloaditemdefs");
        put(new ReloadNPCDefinitions(), "reloadnpcdefs");
        put(new ReloadNPCSpawns(), "reloadnpcspawns");
        put(new ReloadDrops(), "reloaddrops");
        put(new ReloadShops(), "reloadshops");
        put(new ReloadPunishments(), "reloadpunishments");
        put(new ReloadCommands(), "reloadcommands");
        put(new TeleToMe(), "teletome");
        put(new TeleTo(), "tele");
        put(new ItemSpawn(), "item", "pickup");
        put(new Empty(), "empty");
        put(new UnlockPrayers(), "unlockprayers");
        put(new SaveAll(), "saveall");

        /**
         * Owner Commands
         */
        put(new CopyBank(), "copybank");
        put(new Bank(), "bank");
        put(new Title(), "title");
        put(new Runes(), "runes");
        put(new BarrageCommand(), "barrage");

        /**
         * Developer Commands
         */
        put(new DialogueCommand(), "dialogue");
        put(new FloodCommand(), "flood");
        put(new MasterCommand(), "master");
        put(new ResetCommand(), "reset");
        put(new PNPCCommand(), "pnpc");
        put(new SpawnNPCCommand(), "npc");
        put(new SpawnObjectCommand(), "object");
        put(new PositionDebug(), "mypos");
        put(new ConfigCommand(), "config");
        put(new SpecCommand(), "spec");
        put(new GFXCommand(), "gfx");
        put(new AnimationCommand(), "anim");
        put(new InterfaceCommand(), "interface");
        put(new ChatboxInterfaceCommand(), "chatboxinterface");
        put(new UpdateServer(), "update");
        put(new AreaDebug(), "area");
        put(new InfiniteHealth(), "infhp");
        put(new InfiniteRun(), "infrun");

        put(new TaskDebug(), "taskdebug");
        put(new Noclip(), "noclip");
        put(new Up(), "up");
        put(new Down(), "down");
        put(new Save(), "save");
        put(new ListSizesCommand(), "listsizes");
        
        if (!Server.PRODUCTION) {
            put(new DebugCommand(), "t");
        }
    }

    static {
        loadCommands();
    }
}
