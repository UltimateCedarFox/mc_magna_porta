package net.cedarfox.mc.magna_porta.core;

/* TODO
 * Role of this class (CustomGates) in the old CustomGates spigot plugin:
 * - Entry point to spigot via onEnable() method
 * - Stores some static "global" variables like plugin logger prefix, database name, limits for gates,
 *   list of forbidden gate blocks and allowed signal blocks
 * - It holds an ArrayList of CustomGatePlayer objects, this ArrayList is protected by an ReentrantLock and accessed via
 *   the static methods getPlayerSelectionList, addPlayerToSelectionList, removePlayerFromSelectionList
 * - It holds an ArrayList of pair objects (own SimplePair class) containing a gate ID and a GateAnimationTask object,
 *   this ArrayList is protected by an ReentrantLock and accessed via the methods addTask, removeTask,
 *   cancelGateTask
 *
 * Important methods
 * public void onEnable()
 *      Creates an item stack describing the selector wand (custom name, lore, ...)
 *      Populates an array of forbidden blocks for gates and allowed blocks for signal blocks
 *      Populates a private variable with "this" as the instance of this singleton class
 *      Populates a public static variable with the spigot plugin logger
 *      Creates the plugin directory for data and config if not yet existing
 *      Calls a static method setDependencies of GateController to populate their static variables with references
 *          to logger and this plugin singleton
 *      Calls a static method setDependencies of DatabaseController which populates their logger reference and sets a
 *          name for the database file and plugin directory
 *      Calls static method connectToDB of DatabaseController, if this throws an error it calls spigots
 *          disablePlugin() on itself
 *      Registers a new CommandHandler object as the executor of the base "/gate" command
 *      Registers a new EventHandler object with the spigot PluginManager.registerEvent() mehtod
 *      Logs "Plugin enabled"
 *      Tries to find Worldguard plugin via spigot PluginManager, if it finds Worldguard it populates a public static
 *          variable with the Worldguard instance; Worldguard is not a required dependency, so if it does not find it,
 *          no crash just a info log
 *
 * public void onDisable()
 *      Calls disconnectDB of DatabaseController
 *
 *
*/


public class MagnaPorta {
}
