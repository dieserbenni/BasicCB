package de.dieserbenni.basiccb;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage("§f---------§dHilfe§f---------\n➤§fMit §e/p auto §fkannst du dir ein Grundstück claimen!\n");
        return true;
    }
}
