// Copyright 2024, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

package dev.chrisbanes.haze

import kotlinx.datetime.Clock

internal actual fun epochTimeMillis(): Long = Clock.System.now().toEpochMilliseconds()
