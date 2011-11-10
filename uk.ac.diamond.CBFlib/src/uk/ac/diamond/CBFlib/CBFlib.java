/*-
 * Copyright © 2009 Diamond Light Source Ltd.
 *
 * This file is part of GDA.
 *
 * GDA is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License version 3 as published by the Free
 * Software Foundation.
 *
 * GDA is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along
 * with GDA. If not, see <http://www.gnu.org/licenses/>.
 */

package uk.ac.diamond.CBFlib;

/**
 * Contains code for loading the CBFlib native library.
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
