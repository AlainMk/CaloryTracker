package com.alainmk.calorytracker.navigation

import androidx.navigation.NavController
import com.alainmk.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}