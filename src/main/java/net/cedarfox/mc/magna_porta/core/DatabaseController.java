package net.cedarfox.mc.magna_porta.core;

/* ToDo
 * Role of this class' equivalent (DBController) in the old CustomGates spigot plugin:
 * - Abstracts access to SQLite database used for storing data related to the custom gates
 * - Methods for connecting to and disconnecting from database
 * - Method for connecting to database also prepares database if tables or indices are missing
 * - Method for executing an arbitrary query, specified as a string containing SQL
 * - Method for executing an arbitrary update query, specified as a string containing SQL
 * - Method for executing an arbitrary insert query, specified as a string containing SQL
 * - Method for executing multiple arbitrary insert queries as a batch (important for performance)
 * - Method for executing a query that "inserts a gate" which after inserting selects and returns the
 *   last_inserted_rowid()
 * - Currently unused method for cleaning database from obsolete entries, which executes three application specific
 *   queries
 * - Holds reference to plugin logger instance
 * - Holds reference to the database connection in static variable,
 * - Method setDependencies which populates the logger reference and static fields with database info
 *
 */

public class DatabaseController {
}
