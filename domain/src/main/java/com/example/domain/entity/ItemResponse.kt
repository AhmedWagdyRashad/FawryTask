package com.example.domain.entity

data class ItemResponse(
    val count: Int,
    val entries: MutableList<Entry>
)