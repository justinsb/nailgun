/*   

  Copyright 2004, Martian Software, Inc.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/

package com.martiansoftware.nailgun;

/**
 * Just a simple holder for various NailGun-related contants.
 * 
 * @author <a href="http://www.martiansoftware.com/contact.html">Marty Lamb</a>
 */
public class NGConstants {
	
	/**
	 * The default NailGun port (2113)
	 */
	public static final int DEFAULT_PORT = 2113;
	
	/**
	 * The exit code sent to clients if an exception occurred on the server
	 */
	public static final int EXIT_EXCEPTION = 899;
	
	/**
	 * The exit code sent to clients if an invalid command is sent
	 */
	public static final int EXIT_NOSUCHCOMMAND = 898;

	/**
	 * Chunk type marker for command line arguments
	 */
	public static final char CHUNKTYPE_ARGUMENT = 'A';

	/**
	 * Chunk type marker for client environment variables
	 */
	public static final char CHUNKTYPE_ENVIRONMENT = 'E';
	
	/**
	 * Chunk type marker for the command (alias or class)
	 */
	public static final char CHUNKTYPE_COMMAND = 'C';
	
	/**
	 * Chunk type marker for client working directory
	 */	
	public static final char CHUNKTYPE_WORKINGDIRECTORY = 'D';
	
	/**
	 * Chunk type marker for stdin
	 */
	public static final char CHUNKTYPE_STDIN = '0';

	/**
	 * Chunk type marker for the end of stdin
	 */
	public static final char CHUNKTYPE_STDIN_EOF = '.';

	/**
	 * Chunk type marker for stdout
	 */
	public static final char CHUNKTYPE_STDOUT = '1';
	
	/**
	 * Chunk type marker for stderr
	 */	
	public static final char CHUNKTYPE_STDERR = '2';
	
	/**
	 * Chunk type marker for client exit chunks
	 */	
	public static final char CHUNKTYPE_EXIT = 'X';
}
