package com.example.pagingtask.data

import kotlinx.coroutines.flow.flow

fun <T> emitFlow(action: suspend () -> T) = flow { emit(action.invoke()) }
