package fr.merlin.modomtx;

import org.bukkit.plugin.java.JavaPlugin;

import fr.merlin.modomtx.commands.CommandPkclafoteamtx;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("\u001B[31m"+"[WARN]"+"c"+"\u001B[34m"+"e"+"\u001B[31m"+"l"+"\u001B[34m"+"a"+"\u001B[31m"+"f"+"\u001B[34m"+"o"+"\u001B[31m"+"t"+"\u001B[34m"+"e"+"\u001B[31m"+"a"+"\u001B[34m"+"m"+"\u001B[31m"+"t"+"\u001B[34m"+"x"+"\u001B[31m"+"E"+"\u001B[34m"+"c"+"\u001B[31m"+"e"+"\u001B[34m"+"p"+"\u001B[31m"+"t"+"\u001B[34m"+"i"+"\u001B[31m"+"o"+"\u001B[34m"+"n"+"\u001B[31m"+": comme dab si t'as un pb c jamais de ta faute c mtx."+"\u001B[0m");
		getCommand("pkclafoteamtx").setExecutor(new CommandPkclafoteamtx());
		}
	
	@Override
	public void onDisable() {
		System.out.println("je ne passerais pas modo aujourd'hui");
	}
}
