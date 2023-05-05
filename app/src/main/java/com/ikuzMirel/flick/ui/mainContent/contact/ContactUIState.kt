package com.ikuzMirel.flick.ui.mainContent.contact

import com.ikuzMirel.flick.domain.model.Friend

data class ContactUIState(
    val isLoading: Boolean = false,
    val friends: List<Friend> = emptyList(),
)