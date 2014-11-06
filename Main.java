package me.tbhg;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	String msg = "§f[§4TB§2HG§f]§b";
	
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getConsoleSender().sendMessage(this.msg + " Plugin feito por Tom_Gamer117 e BielSAA");
		Bukkit.getConsoleSender().sendMessage(this.msg + " Plugin esta na versao 1.0 - Beta");
		Bukkit.getConsoleSender().sendMessage(this.msg + " Plugin ativado!");
	}

	public void onDisable()
	{
		Bukkit.getConsoleSender().sendMessage(this.msg + " Obrigado por ultilizar nosso plugin!");
		Bukkit.getConsoleSender().sendMessage(this.msg + " Plugin desativado!");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		if(label.equalsIgnoreCase("tbhg")){
			if(args[0].equalsIgnoreCase("start")){
				//Iniciar HG aqui
			}else if(args[0].equalsIgnoreCase("help")){
				//Subcomandos do plugin
			}else{
				sender.sendMessage("§f[§4TB§2HG§f]§b Plugin feito por Tom_Gamer117 com ajuda de BielSAA");
				sender.sendMessage("§f[§4TB§2HG§f]§b Para ajuda digite /tbhg help");
			}
		}
		return false;
	}
}

