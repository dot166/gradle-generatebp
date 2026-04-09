/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.generatebp.models

import org.lineageos.generatebp.ext.equalsComparable
import org.lineageos.generatebp.ext.hashCodeOf

/**
 * A Gradle module identifier.
 *
 * @param group The group name
 * @param name The name of the module
 * @param version The version of the module. This field is ignored for comparison
 */
open class ModuleIdentifier(
    val group: String,
    val name: String,
    val version: String,
) : Comparable<ModuleIdentifier> {
    override fun compareTo(other: ModuleIdentifier) = compareValuesBy(
        this, other,
        ModuleIdentifier::group,
        ModuleIdentifier::name,
    )

    override fun equals(other: Any?) = equalsComparable(other)

    override fun hashCode() = hashCodeOf(
        ModuleIdentifier::group,
        ModuleIdentifier::name,
    )

    override fun toString() = "$group:$name:$version"
}
