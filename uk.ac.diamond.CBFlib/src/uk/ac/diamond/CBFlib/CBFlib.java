/*-
* Copyright © 2011 Diamond Light Source Ltd.
* Contact :  ScientificSoftware@diamond.ac.uk
*
* File id : CBFlib.java
*
* This is free software: you can redistribute it and/or modify it under the
* terms of the GNU General Public License version 3 as published by the Free
* Software Foundation.
*
* This software is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
* Public License for more details.
*
* You should have received a copy of the GNU General Public License along
* with this software. If not, see <http://www.gnu.org/licenses/>.
*/
package uk.ac.diamond.CBFlib;

/**
 * Contains code for loading the CBFlib native library.
 * 
 * (NOTE The META-INF declares the same native lib for windows 32 and windows 64
 * This has been tested on windows 64 10/11/2011 and appears to work.)
 */
public class CBFlib {
	
	/**
	 * Loads the CBFlib native library.
	 * 
	 * <p>This class ({@link CBFlib}) must be loaded by the same classloader as the CBFlib Java wrapper classes. In an
	 * OSGi environment, this means that this class and the CBFlib JAR must be in the same bundle.
	 */
	public static void loadLibrary() {
		try {
			System.loadLibrary("libgnurx-0");
		} catch (UnsatisfiedLinkError e) {
			// do nothing as only in Windows (so much for write once...)
		}
		System.loadLibrary("cbf_wrap");
	}

}
