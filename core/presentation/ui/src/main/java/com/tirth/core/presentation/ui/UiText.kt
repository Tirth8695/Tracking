package com.tirth.core.presentation.ui

import androidx.annotation.StringRes

sealed interface UiText {
    data class DynamicString(val value: String): UiText
    class StringResourse(
        @StringRes val id: Int,
        val args: Array<Any> = arrayOf()
    ): UiText
}