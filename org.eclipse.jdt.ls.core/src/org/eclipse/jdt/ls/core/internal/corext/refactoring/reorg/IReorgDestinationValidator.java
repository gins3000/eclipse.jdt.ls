/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Originally copied from org.eclipse.jdt.internal.corext.refactoring.reorg.IReorgDestinationValidator
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.ls.core.internal.corext.refactoring.reorg;


public interface IReorgDestinationValidator {

	/**
	 * Is it possible, that destination contains valid destinations as children?
	 *
	 * @param destination
	 *            the destination to verify
	 * @return true if destination can have valid destinations
	 */
	public boolean canChildrenBeDestinations(IReorgDestination destination);

	/**
	 * Is it possible, that the given kind of destination is a target for the
	 * reorg?
	 *
	 * @param destination
	 *            the destination to verify
	 * @return true if possible
	 */
	public boolean canElementBeDestination(IReorgDestination destination);
}
