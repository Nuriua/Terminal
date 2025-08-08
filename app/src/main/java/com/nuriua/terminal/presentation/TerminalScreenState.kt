package com.nuriua.terminal.presentation

import com.nuriua.terminal.data.Bar

sealed class TerminalScreenState {

    object Initial : TerminalScreenState()

    object Loading : TerminalScreenState()

    data class Content(val barList: List<Bar>, val timeFrame: TimeFrame) : TerminalScreenState()
}