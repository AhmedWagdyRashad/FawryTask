package com.example.domain.utils

sealed class NetworkResult<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : NetworkResult<T>(data, null)
    class Error<T>(message: String) : NetworkResult<T>(null, message)
}