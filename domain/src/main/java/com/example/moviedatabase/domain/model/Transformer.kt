package com.example.moviedatabase.domain.model

import io.reactivex.ObservableTransformer

abstract class Transformer<T> : ObservableTransformer<T, T>