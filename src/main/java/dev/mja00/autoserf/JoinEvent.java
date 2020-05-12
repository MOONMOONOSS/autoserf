package dev.mja00.autoserf;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;
import java.util.Set;

public class JoinEvent implements Listener {

    Plugin plugin = Autoserf.getPlugin(Autoserf.class);
    Set<Team> teams = plugin.getServer().getScoreboardManager().getMainScoreboard().getTeams();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!isPlayerInTeam(player, teams)) {
            player.getServer().getScoreboardManager().getMainScoreboard().getTeam("Serfs").addEntry(player.getName());
            player.sendMessage("Welcome to Tillicum. Enjoy starving to death.");
            System.out.println(player.getName() + " is new. Assigning Serf team.");
        }

    }

    public static boolean isPlayerInTeam(Player player, Set<Team> teams) {
        for (Team team : teams) {
            if (team.hasEntry(player.getName())) {
                System.out.println(player.getName() + " is in " + team.getName());
                return true;
            }
        }
        return false;
    }
}
